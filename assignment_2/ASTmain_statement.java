/* Generated By:JJTree: Do not edit this line. ASTmain_statement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTmain_statement extends SimpleNode {
  public ASTmain_statement(int id) {
    super(id);
  }

  public ASTmain_statement(SLPParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SLPParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b38e384ed68d365ad65ea9f95aa440c1 (do not edit this line) */
