public class MyBinaryTree {
	//attributes
	private int numInTree;
	private StudentInfo root;

	public MyBinaryTree() {
		numInTree=0;
		root=null;
	}
	
	public StudentInfo getRoot() {return root;}
	public int getNumInTree() {return numInTree;}
	public void addToTree (StudentInfo currentNode, StudentInfo newStudent) {
		if (root==null) {root=newStudent;}
		else if (newStudent.getStudentNum() < currentNode.getStudentNum()) {
			if (currentNode.getLeft()==null) {currentNode.setLeft(newStudent);}
			else {addToTree(currentNode.getLeft(),newStudent);}
			}
		else if (newStudent.getStudentNum() > currentNode.getStudentNum()) {
			if (currentNode.getRight()==null) {currentNode.setRight(newStudent);}
			else {addToTree(currentNode.getRight(),newStudent);}

		}
	}
	
	
	

public void inorder(StudentInfo rootNode) {
	if (rootNode.getLeft()!=null) {inorder(rootNode.getLeft());}
	System.out.println(rootNode.getStudentNum());
	if (rootNode.getRight()!=null) {inorder(rootNode.getRight());}
	
}

public void preorder(StudentInfo rootNode) {
	System.out.println(rootNode.getStudentNum());
    if (rootNode.getLeft()!=null) {preorder(rootNode.getLeft());}
	if (rootNode.getRight()!=null) {preorder(rootNode.getRight());}
}

public void postorder(StudentInfo rootNode) {
	if (rootNode.getLeft()!=null) {postorder(rootNode.getLeft());}
	if (rootNode.getRight()!=null) {postorder(rootNode.getRight());}
	System.out.println(rootNode.getStudentNum());
}
}