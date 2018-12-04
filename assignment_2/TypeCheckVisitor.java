public class TypeCheckVisitor implements SLPParserVisitor {
    public Object visit(SimpleNode node, Object data) {
        throw RunTimeException("Visit Node");
    }
    public Object visit(ASTdecl_list node, Object data) {}
    public Object visit(ASTdecl node, Object data) {}
    public Object visit(ASTfunc_list node, Object data) {}
    public Object visit(ASTfunc node, Object data) {}
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