/* Generated By:JJTree: Do not edit this line. ASTPARAM.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTPARAM extends SimpleNode {
  public ASTPARAM(int id) {
    super(id);
  }

  public ASTPARAM(SLPParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SLPParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=de381437752444a9902ff43359745352 (do not edit this line) */
