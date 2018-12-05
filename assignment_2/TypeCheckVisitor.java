/** 
 * so the way I think it works is that you add everything to the Symbol table and
 * do everything you want to do care free in the SLPParser class.
 * Once parser.Prog() is finished executing through the source code
 * you then call new TypeCheckVisitor that goes through and corrects everything
 * you just did wrong during the prog execution. So don't worry about the type checker
 * until you are finished with the Prog() 
 **/

public class TypeCheckVisitor implements SLPParserVisitor {
    SymbolTable ST = new SymbolTable();
    public Object visit(SimpleNode node, Object data) {
        throw RunTimeException("Visit Node");
    }
    public Object visit(ASTdecl_list node, Object data) {}
    public Object visit(ASTdecl node, Object data) {
        return DataType.Declaration;
    }
    public Object visit(ASTfunc_list node, Object data) {}
    public Object visit(ASTfunc node, Object data) {
        
    }
    public Object visit(ASTparam_list node, Object data) {}
    public Object visit(ASTnemp_param_list node, Object data) {}
    public Object visit(ASTparam node, Object data) {}
    public Object visit(ASTVAR node, Object data) {}
    public Object visit(ASTvar_decl node, Object data) {}
    public Object visit(ASTconst_decl node, Object data) {}
    public Object visit(ASTcondition node, Object data) {}
    public Object visit(ASTsimple_condition node, Object data) {}
    public Object visit(ASTcomp_ops node, Object data) {}
    public Object visit(ASTlog_ops node, Object data) {}
    public Object visit(ASTid node, Object data) {}
}