import structures.IntTree;
import structures.trees.Tree;
import models.Persona;

public class App {
    public static void main(String[] args) {

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