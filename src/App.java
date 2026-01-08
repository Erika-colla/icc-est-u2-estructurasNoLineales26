import structures.IntTree;
import structures.graph.Graph;
import structures.node.Node;
import structures.trees.Tree;

import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) {
       // runIntTree();
       //runTree();
       runGraph();
        
    }

    public static void runGraph(){
        Graph<String> graph = new Graph<>();

        Node<String> nA = new Node<String>("A");
        Node<String> nB = new Node<String>("B");
        Node<String> nC = new Node<String>("C");
        Node<String> nD = new Node<String>("D");

        graph.addNode(nA);
        graph.addEdge(nA, nB);
        graph.addEdge(nA, nC);
        graph.addEdge(nB, nD);
        graph.addEdge(nC, nD);
        graph.printGraph();

        //Conectados de A
        System.out.println("Neighbors de A:");
        List<Node<String>> neighbors = graph.getMapa().get(nA);
        for (Node<String> neighbor : neighbors) {
            System.out.println(neighbor);
        }
    }

    public static void runTree() {
        Tree<Persona> tree = new Tree<Persona>();
        tree.insert(new Persona("Pablo", 21));
        tree.insert(new Persona("María", 23));
        tree.insert(new Persona("Luis", 19));
        tree.insert(new Persona("Pedro", 23));
        tree.insert(new Persona("Ana", 25));

        System.out.println("InOrder");
        tree.inOrder();

        System.out.println("Búsqueda por edad");
        Persona findPersona = tree.searchByAge(23);
        if(findPersona != null) {
            System.out.println(findPersona);
        } else {
            System.out.println("No se encontro");
        }

    }

    public static void runIntTree() {
        System.out.println("=== Árbol de enteros ===");
        IntTree intTree = new IntTree();
        intTree.insert(10);
        intTree.insert(5);
        intTree.insert(3);
        intTree.insert(15);

        System.out.println("preOrder: ");
        intTree.preOrder();   // 10 5 3 15
        System.out.println(" ");
        System.out.println("inOrder: ");
        intTree.inOrder();    // 3 5 10 15
        System.out.println(" ");
        System.out.println("posOrder: ");
        intTree.postOrder();  // 3 5 15 10

        System.out.println(" ");
        System.out.println("Size:");
        System.out.println(intTree.size());

        System.out.println("\n=== Árbol de personas (ordenado por edad) ===");
        Tree<Persona> personaTree = new Tree<>();
        personaTree.insert(new Persona("Ana", 25));
        personaTree.insert(new Persona("Luis", 20));
        personaTree.insert(new Persona("Carlos", 30));
        personaTree.insert(new Persona("María", 22));

        personaTree.inOrder();
    }
}