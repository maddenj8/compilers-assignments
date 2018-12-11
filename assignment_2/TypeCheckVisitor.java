/** 
 * so the way I think it works is that you add everything to the Symbol table and
 * do everything you want to do care free in the SLPParser class.
 * Once parser.Prog() is finished executing through the source code
 * you then call new TypeCheckVisitor that goes through and corrects everything
 * you just did wrong during the prog execution. So don't worry about the type checker
 * until you are finished with the Prog() 
 **/

public class TypeCheckVisitor implements SLPParserVisitor {
    public Object visit(SimpleNode node, Object data) {
        throw new RuntimeException("Visiting Node");
    }
    public Object visit(ASTPROGRAM node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        return DataType.Program;
    }
    public Object visit(ASTcode node, Object data) {
        // if ((DataType) node.jjtGetChild(0).jjtAccept(this, data) == DataType.TypeUnknown) {
        //     System.out.println("Type Error");
        // }
        return (node.jjtGetChild(0).jjtAccept(this, data));
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
        System.out.println(node);
        node.jjtGetChild(0).jjtAccept(this, data);
        return DataType.Declaration;
    }
    public Object visit(ASTCONST node, Object data) {
        System.out.println(node);
        node.jjtGetChild(0).jjtAccept(this, data);
        return DataType.Declaration;    
    }
    public Object visit(ASTfunc node, Object data) {return null;}
    public Object visit(ASTparam_list node, Object data) {return null;}
    public Object visit(ASTnemp_param_list node, Object data) {return null;}
    public Object visit(ASTparam node, Object data) {return null;}
    public Object visit(ASTcondition node, Object data) {return null;}
    public Object visit(ASTsimple_condition node, Object data) {return null;}
    public Object visit(ASTcomp_ops node, Object data) {return null;}
    public Object visit(ASTlog_ops node, Object data) {return null;}
    public Object visit(ASTmain_statement node, Object data) {return null;}
    public Object visit(ASTstatement_block node, Object data) {return null;}
    public Object visit(ASTstatement node, Object data) {return null;}
    public Object visit(ASTexpr node, Object data) {return null;}
    public Object visit(ASTarg_list node, Object data) {return null;}
    public Object visit(ASTnemp_arg_list node, Object data) {return null;}
    public Object visit(ASTbin_op node, Object data) {return null;}
    public Object visit(ASTfragment node, Object data) {return null;}
    public Object visit(ASTid node, Object data) {
        SymbolTable ST = (SymbolTable) data;
        System.out.println("#########################");
        ST.print();
        System.out.println("#########################");
        if (ST.check(String.valueOf(node.value))) {
            // variable has already been defined
            System.out.println("Type Error: " + node.value + " has already been defined");
            return null;
        }
        return node.value;
    }
}
