public class StudentInfo {


    // Attributes
    
    private int studentNumber;
    private String firstName;
    private String lastName;
    private StudentInfo left;
    private StudentInfo right;
    
    public StudentInfo() {
		this.studentNumber = 0;
		this.firstName = "";
		this.lastName = "";
		this.left = null;
		this.right = null;
    }
    
    
    // Constructors
    
    public StudentInfo(int sN, String fN, String lN) {
        studentNumber = sN;
        firstName = fN;
        lastName = lN;
        left = null; 
        right = null;
    }
    
    public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getStudentNum() {
		return this.studentNumber;
	}

	public StudentInfo getLeft() {
		return this.left;
	}

	public StudentInfo getRight() {
		return this.right;
	}
	// Setters & Getters

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStudentNum(int studentNum) {
		this.studentNumber = studentNum;
	}

	public void setLeft(StudentInfo left) {
		this.left = left;
	}

	public void setRight(StudentInfo right) {
		this.right = right;
	}
	
}

