package ChapterTwentyFive;

public class BinaryTrees {

    Nodes root;

    BinaryTrees() {
        root = null;
    }

    void printPostOrders(Nodes node) {
        if (node == null) {
            return;
        }
        printPostOrders(node.left);
        printPostOrders(node.right);
        System.out.println(node.key + " ");
    }

    void printInOrders(Nodes node) {
        if (node == null) {
            return;
        }
        printInOrders(node.left);
        System.out.println(node.key + " ");
        printInOrders(node.right);

    }

    void printPreOrders(Nodes node) {
        if (node == null) {
            return;
        }
        System.out.println(node.key + " ");
        printPreOrders(node.left);
        printPreOrders(node.right);

    }

    void prinPostOrder() {
        printPostOrders(root);
    }

    void prinInOrder() {
        printInOrders(root);
    }

    void prinPreOrder() {
        printPreOrders(root);
    }

    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();

        tree.root = new Nodes(1);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(3);
        tree.root.left.left = new Nodes(4);
        tree.root.left.right = new Nodes(5);

        System.out.print("Preorder traversal of binary tree is ");
        tree.prinPreOrder();
        System.out.print("\nInorder traversal of binary tree is ");
        tree.prinInOrder();
        System.out.print("\nPostorder traversal of binary tree is ");
        tree.prinPostOrder();

    }

}
