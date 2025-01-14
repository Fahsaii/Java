public class Subject {
	private String SubjectCode;
	private String SubjectName;
	private int  SubjectCredit;
 
	/** Creates a new instance of Subject */
	public Subject() {
   		setSubjectCode("");
		setSubjectName("");
		setSubjectCredit(0);
	}
    
	public Subject(String Code, String Name, int Credit) {
   		setSubjectCode(Code);
		setSubjectName(Name);
		setSubjectCredit(Credit);
	}
    	public void setSubjectCode(String Code) {
   		this.SubjectCode = Code;
	}

	public void setSubjectName(String Name) {
   		this.SubjectName = Name;
	}

	public void setSubjectCredit(int Credit) {
   		this.SubjectCredit = Credit;
	}

	public String getSubjectCode() {
   		return (this.SubjectCode);
	}

	public String getSubjectName() {
   		return(this.SubjectName);
	}
 
	public int getSubjectCredit() {
   		return(this.SubjectCredit);
	}
 
	public String toString() {
		String str = "";
		str = getSubjectCode()+" "+getSubjectName()+" ";
		str += getSubjectCredit();
		return(str);
	}    
}
