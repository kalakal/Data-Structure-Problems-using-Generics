package day10;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    boolean search(int value) {
        return searchRecursive(root, value);
    }

    boolean searchRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.value == value) {
            return true;
        }

        boolean foundInLeftSubtree = searchRecursive(currentNode.left, value);
        boolean foundInRightSubtree = searchRecursive(currentNode.right, value);

        return foundInLeftSubtree || foundInRightSubtree;
    }
}

public class BinaryTreeSearch {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating a sample binary tree
        tree.root = new Node(15);
        tree.root.left = new Node(25);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(14);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(63);

        int searchValue = 63;

        // Search for the value in the binary tree
        boolean found = tree.search(searchValue);

        if (found) {
            System.out.println("Value " + searchValue + " is found in the binary tree.");
        } else {
            System.out.println("Value " + searchValue + " is not found in the binary tree.");
        }
    }
}
