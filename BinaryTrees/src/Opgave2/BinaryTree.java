package Opgave2;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData
	 *            the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<>();
		result.root = root.left;
		return result;

	}
	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		//This method reassigns the previous root's data a
		if (root == null) {
			throw new IllegalStateException("Cannot replace root in an empty binary tree");
		}
		E previousRootData = root.data;
		root.data = rootData;
		return previousRootData;
	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {
		if (n == null) {
			throw new IllegalStateException("Cannot check leaf status for a null node");
		}

		//If both n.left and n.right are null,
		// the node is a leaf and it returns true.
		return n.left == null && n.right == null;
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		if (n == null) {
			throw new IllegalStateException("Cannot check for the note status for a null node");
		}
		//Checks if the node is internal, meaning that it has at least
		//one child
		return n.left != null && n.right != null;
	}


	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		if (n == null) {
			return 0;
		} else {
			//Computes the size of the left side
			int leftSize = size(n.left);
			//Computes the size of the right side
			int rightSize = size(n.right);
			return 1 + leftSize + rightSize;
			// 1 comes from the node itself, as a node cannot be less than 1
		}
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		} else {
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);
			return 1 + Math.max(leftHeight, rightHeight);
		}
	}

	public void printPreorder() {
		printPreorder(root);
	}

	private void printPreorder(Node node) {
		if (node == null) {
			return;
		}

		System.out.println(node.data);
		printPreorder(node.left);

		printPreorder(node.right);
	}


	private void printinOrder(Node node) {
		if (node == null) {
			return;
		}
		printPreorder(node.left);
		System.out.println(node.data);

		printPreorder(node.right);
	}

	private void printpostOrder(Node node) {
		if (node == null) {
			return;
		}
		printPreorder(node.left);
		printPreorder(node.right);
		System.out.println(node.data);
	}

	public int sum() {
		return sum(root);
	}

	private int sum(Node n) {
		if(n == null) {
			return 0;
		} else {
			return (Integer) n.data + sum(n.left) + sum(n.right);
		}
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
