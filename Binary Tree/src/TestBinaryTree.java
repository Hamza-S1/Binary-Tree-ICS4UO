
public class TestBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyBinaryTree theTree = new MyBinaryTree();
		
		StudentInfo someStudent;
		
		someStudent = new StudentInfo(20, "Elmer", "Fudd");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(37, "Daffy", "Duck");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(29, "Lola", "Bunny");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(30, "Bugs", "Bunny");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(11, "Foghorn", "Leghorn");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(50, "Tweety", "Bird");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(15, "Sylvester", "Cat");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(5, "Marvin", "Martian");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(7, "Miss", "Prissy");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(25, "AAA", "AAAAA");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(32, "BBB", "BBBBB");
		theTree.addToTree(theTree.getRoot(), someStudent);

		System.out.println("\nINORDER traversal of the tree!");
		theTree.inorder(theTree.getRoot());
		
		System.out.println("\nPREORDER traversal of the tree!");
		theTree.preorder(theTree.getRoot());
		
		System.out.println("\nPOSTORDER traversal of the tree!");
		theTree.postorder(theTree.getRoot());
		
	}

}
