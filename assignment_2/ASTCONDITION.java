/* Generated By:JJTree: Do not edit this line. ASTCONDITION.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTCONDITION extends SimpleNode {
  public ASTCONDITION(int id) {
    super(id);
  }

  public ASTCONDITION(SLPParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SLPParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ff26d523038ccb1b917500cb5da4de61 (do not edit this line) */