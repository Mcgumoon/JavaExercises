package lab7;

public class testBinaryTree extends BinaryTree{
	public static void main(String[] args) {
		BinaryTree binary = new BinaryTree();
		LinkedBinaryTree<Integer> tree = binary.new LinkedBinaryTree<>();
		
		if(tree.isEmpty()) {
			Node<Integer> root = tree.addRoot(2);
			Node<Integer> left = tree.addLeft(root, 4);
			Node<Integer> right = tree.addRight(root, 6);
			Node<Integer> leftL = tree.addLeft(left, 8);
			Node<Integer> leftR = tree.addRight(left, 10);
			Node<Integer> rightL = tree.addLeft(right, 12);
			Node<Integer> rightR = tree.addRight(right, 16);
			
			System.out.println("inOrder traversal: ");
			tree.inOrder();
			
			System.out.println();
			System.out.println("\npostOrder traversal: ");
			tree.postOrder();
			
			System.out.println();
			System.out.println("\npreOrder traversal: ");
			tree.preOrder();
			
			System.out.println();
			System.out.println("\nSearching for element 6: ");
			System.out.println();
			Node<Integer> result = tree.search(root, 6);
			if(result != null) {
				System.out.println("Element 6 found in the tree");
			} else {
				System.out.println("Element 6 not found in the tree");
			}
			
			System.out.println("\nWhat is the root of the tree?: " + tree.root().getElement());
			System.out.println("\nThe tree size?: " + tree.size());
			System.out.println("Is 4 an internal node?: " + tree.isInternal(left));
			System.out.println("\nIs 8 an external node? " + tree.isExternal(leftL));
			System.out.println("\nWhat is the parent of 6?: " + tree.parent(right).getElement());
			System.out.println("\nwhat is the left side of 4? " + tree.left(left).getElement());
			System.out.println("\nWhat is the right of 6?: " + tree.right(right).getElement());
			System.out.println("\nDoes 12 have a right child? " + tree.hasRight(rightL));
			System.out.println("\nDoes 8 have a left child?: " + tree.left(leftL));
		} else {
			System.out.println("not working");
		}
		
		
	}
}
