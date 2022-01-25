package lecture10;

import java.util.ArrayList;
import java.util.List;

public class GeneralTree<E> {

    Node<E> root;
    int nodeCount;


    private static class Node<E>{

        private E data;
        private List<Node> children;
        private Node<E> parent;

        private Node(E item){
            data = item;
            children = new ArrayList<>();
            parent = null;
        }


    }

    public void addChild(Node<E> node){
        if(this.nodeCount == 0){
            root = node;
            nodeCount++;
        }
    }

    public void addChild(Node<E> parent , Node<E> child){
        parent.children.add(child); // adding the child to the parent's arraylist
        child.parent = parent;
        nodeCount++;
    }

    public E getParent(Node<E> node) {
        return node.parent.data;
    }

    public boolean areSiblings(Node<E> node1, Node<E> node2) {
        return (node1.parent.equals(node2.parent));
    }

    public void printChildren(Node<E> node){
        for (int i = 0; i < node.children.size(); i++) {
            System.out.println(node.children.get(i).data);
        }
    }

    public void printPreorder(Node<E> node){
        if(node.children.size()== 0){
            return;
        }
        else{
            if(node.equals(root)){
                System.out.println(node.data);
            }
            for (int i = 0; i < node.children.size(); i++) {
                System.out.println(node.children.get(i).data);
                printPreorder(node.children.get(i));
            }
        }
    }

    public void printInorder(Node<E> node){
        if(node.children.size()== 0){
            return;
        }
        else{
//            if(node.equals(root)){
//                System.out.println(node.data);
//            }
            for (int i = 0; i < node.children.size(); i++) {

                printInorder(node.children.get(i));
                System.out.println(node.children.get(i).data);
            }
        }
    }




    public static void main(String[] args) {
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");
        Node<String> nodeD = new Node<>("D");
        Node<String> nodeE = new Node<>("E");
        Node<String> nodeF = new Node<>("F");

        GeneralTree<String> tree = new GeneralTree<>();

        tree.addChild(nodeA);

        tree.addChild(nodeA,nodeB);
        tree.addChild(nodeA,nodeC);
        tree.addChild(nodeB,nodeD);
        tree.addChild(nodeB,nodeE);
        tree.addChild(nodeC,nodeF);

        System.out.println("Searching parent of node:");
        System.out.println("Node B: " + tree.getParent(nodeB));
        System.out.println("Node C: " + tree.getParent(nodeC));
        System.out.println("Node F: " + tree.getParent(nodeF));

        System.out.print("Check siblings for B and C: ");
        System.out.println(tree.areSiblings(nodeB, nodeC));
        System.out.print("Check siblings for E and F: ");
        System.out.println(tree.areSiblings(nodeE, nodeF));

       tree.printInorder(nodeA);

    }
}
