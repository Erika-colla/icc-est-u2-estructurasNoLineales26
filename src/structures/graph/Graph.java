package structures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import structures.node.Node;

public class Graph<T> {

    // 1ra forma
    // Trabaja con listado de Adyaciencia
    List<Node <T>> nodes;

    // 2da forma
    private Map<Node<T>, List<Node<T>>> mapa;

    public Graph() {
        //this.nodes = new ArrayList<Node<T>>();
        this.mapa = new HashMap<Node<T>, List<Node<T>>>();
    }

    // Inserta un vertice o nodo
    public void addNode(Node<T> node) {
        mapa.putIfAbsent(node, new ArrayList<>());
    }

    // Grafo no dirijido
    public void addEdge(Node<T> n1, Node<T> n2) {
        addNode(n1);
        addNode(n2);
        List<Node <T>> listadoNodo1 = mapa.get(n1);
        listadoNodo1.add(n2);
        mapa.get(n2).add(n1); 
    }

    public void printGraph() {
        for (Map.Entry<Node<T>, List<Node<T>>> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> ");

            for (Node<T> neighbor : entry.getValue()) {
                System.out.println(neighbor + " ");
            }
            System.out.println();
        }
    }
    public Map<Node<T>, List<Node<T>>> getMapa() {
        return mapa;
    }
}
