/* Generated By:JJTree: Do not edit this line. ASTInteger.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTInteger extends SimpleNode {
    String value;
 public ASTInteger(int id) {
    super(id);
  }

  public ASTInteger(Prog03 p, int id) {
    super(p, id);
  }
    public void  setValue(String a){
	value=a;
    }
    public String toString(){
	return value;
    }
    public ASTInteger clone(int id){
	ASTInteger temp=new ASTInteger(id);
	temp.setValue(value);
	return temp;
    }
}
/* JavaCC - OriginalChecksum=30a3f125f2c3f9fca29fd162f4f474ee (do not edit this line) */
