/* Generated By:JJTree: Do not edit this line. ASTEXPR.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTEXPR extends SimpleNode {
  public ASTEXPR(int id) {
    super(id);
  }

  public ASTEXPR(SLPParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SLPParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e1ff74bcae2a8e12f65aa46cbb8c1ff3 (do not edit this line) */