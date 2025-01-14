public class Student {
	String StudentId;
	String StudentName;
	String StudentSurName;
           
	/** Creates a new instance of Student */
	public Student() {
		setStudentId("");
		setStudentName("");
		setStudentSurName("");
	}
	public Student(String Id, String Name, String SurName) {
		setStudentId(Id);
		setStudentName(Name);
		setStudentSurName(SurName);
	}
	public void setStudentId(String Id) {
   		this.StudentId = Id;
	}
 
	public void setStudentName(String Name) {
   		this.StudentName = Name;
	}
 
	public void setStudentSurName(String SurName) {
   		this.StudentSurName = SurName;
	}
 
	public String getStudentId() {
		return(this.StudentId);
	}
	public String getStudentName() {
	   	return(this.StudentName);
	}
 
	public String getStudentSurName() {
   		return(this.StudentSurName);
	}
 
	public String toString() {
   		String str = getStudentId()+" "+getStudentName()+" ";
      	str += getStudentSurName();
      	return(str);
	} 
}