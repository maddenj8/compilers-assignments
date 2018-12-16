import java.util.*;

public class TypeCheckVisitor implements SLPParserVisitor {
    public Object visit(SimpleNode node, Object data) {
        throw new RuntimeException("Visiting Node");
    }
    public Object visit(ASTPROGRAM node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        return DataType.Program;
    }
    public Object visit(ASTcode node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        return node.jjtGetChild(1).jjtAccept(this, data);
    }
    public Object visit(ASTdecl_list node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        node.jjtGetChild(1).jjtAccept(this, data);
        return data;
    }
    public Object visit(ASTdecl node, Object data) {
        return (node.jjtGetChild(0).jjtAccept(this, data));
    }
    public Object visit(ASTVAR node, Object data) {
        //System.out.println(node);
        String idVal = node.jjtGetChild(0).jjtAccept(this, data).toString();
        SymbolTable ST = (SymbolTable) data;
        ArrayList<String> types = ST.get(String.valueOf(idVal));
        if (types != null) {
            if (types.size() > 1) {
                System.out.println("Type Error: " + idVal + " has already been defined");
                return null;
            }
        }
        return DataType.Declaration;
    }
    public Object visit(ASTCONST node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        return DataType.Declaration;    
    }
    public Object visit(ASTfunc node, Object data) {return null;}
    public Object visit(ASTparam_list node, Object data) {
        return node.jjtGetChild(0).jjtAccept(this, data);
    }
    public Object visit(ASTnemp_param_list node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        node.jjtGetChild(1).jjtAccept(this, data);
        return data;
    }
    public Object visit(ASTparam node, Object data) {
        return node.jjtGetChild(0).jjtAccept(this, data);
    }
    public Object visit(ASTcondition node, Object data) {return null;}
    public Object visit(ASTsimple_condition node, Object data) {return null;}
    public Object visit(ASTcomp_ops node, Object data) {return null;}
    public Object visit(ASTlog_ops node, Object data) {return null;}
    public Object visit(ASTmain_statement node, Object data) {
        return node.jjtGetChild(0).jjtAccept(this, data);
    }
    public Object visit(ASTstatement_block node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        node.jjtGetChild(1).jjtAccept(this, data);
        return data;
    }
    public Object visit(ASTstatement node, Object data) {
        for (int i = 0; i < node.jjtGetNumChildren(); i++) {
            node.jjtGetChild(i).jjtAccept(this, data);
        }
        return data;
    }
    public Object visit(ASTexpr node, Object data) {
        return node.jjtGetChild(0).jjtAccept(this, data);
    }
    public Object visit(ASTarg_list node, Object data) {
        return node.jjtGetChild(0).jjtAccept(this, data);
    }
    public Object visit(ASTnemp_arg_list node, Object data) {
        SymbolTable ST = (SymbolTable) data; 
        String idVal = node.jjtGetChild(0).jjtAccept(this, data).toString();
        if (!(ST.check(idVal))) {System.out.println("Type Error: " + idVal + " was used before it was defined");}
        String otherVal = node.jjtGetChild(1).jjtAccept(this, data).toString();
        if (!(otherVal.contains("SymbolTable"))) {
            if(!(ST.check(otherVal))) {System.out.println("Type Error: " + otherVal + " was used before it was defined");}
        }
        return data;
    }
    // GET A VALUE FOR FRAGMENT
    public Object visit(ASTfragment node, Object data) {
        String idVal = (node.jjtGetNumChildren() >= 1) ? node.jjtGetChild(0).jjtAccept(this, data).toString() : null;
        String tokVal = node.value.toString();
        if (idVal != null)
            if (tokVal != null)
                return tokVal + idVal; // -x
            else 
                return idVal; // x
        else 
            return tokVal; // true
    }
    public Object visit(ASTid node, Object data) {
        if (node.jjtGetNumChildren() > 0) {
            return node.jjtGetChild(0).jjtAccept(this, data);
        }
        return node.value;
    }
    public Object visit(ASTfunc_call node, Object data) { 
        String funcName = node.jjtGetChild(0).jjtAccept(this, data).toString(); // id
        SymbolTable ST = (SymbolTable) data;
        if (!(ST.check(funcName))) {System.out.println("Type Error: Function " + funcName + " used before it was defined");}
        else if (ST.get(funcName).get(0) != "function") {System.out.println("Type Error: " + funcName + " is not a function");}
        node.jjtGetChild(1).jjtAccept(this, data); // expr
        return data;
    }
    public Object visit(ASTassign node, Object data) {
        SymbolTable ST = (SymbolTable) data;
        String idVal = node.jjtGetChild(0).jjtAccept(this, data).toString();
        String idType;
        String exprVal = node.jjtGetChild(1).jjtAccept(this, data).toString();
        try {
            idType = ST.get(idVal).get(0);
        } catch (Exception e) {return null;}
        if (idType.contains("boolean")) {
            if (!(exprVal.equals("true") || exprVal.equals("false"))) {
                System.out.println("Type Error: " + idType + " " + idVal + " cannot be assigned to integer " + exprVal);
                return null;
            }
        }
        else { // know it is integer id type here
            if (!(isNumeric(exprVal))) {
                if (!(exprVal.contains("+")) || !(exprVal.contains("-"))) { // not a bin_op either
                    System.out.println("Type Error: " + idType + " " + idVal + " cannot be assigned to boolean " + exprVal);
                }
            }
        }
        return data;
    }
    private Boolean isNumeric(String num) {
        try {
            int d = Integer.parseInt(num);
        } catch(Exception e) {return false;}
        return true;
    }
    public Object visit(ASTbin_op node, Object data) {
        String leftSideVal = node.jjtGetChild(0).jjtAccept(this, data).toString();
        String leftSideType = node.jjtGetChild(0).toString();
        System.out.println(leftSideType + " " + leftSideVal);
        return null;
    }

    // public Object visit(ASTlog_op node, Object data) {
        // return null;
    // }
    public Object visit(ASTreturn_statement node, Object data) {
        return null;
    }
}