/* Generated By:JJTree: Do not edit this line. ASTdeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTdeclaration extends SimpleNode {
  public ASTdeclaration(int id) {
    super(id);
  }

  public ASTdeclaration(SLPParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SLPParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a31b9c9e03aefd49d4a7762cdbb5df50 (do not edit this line) */
