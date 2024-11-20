package TeoriaGrafos;

import TeoriaGrafos.enums.Nodo;
import TeoriaGrafos.modelo.Dijkstra;
import TeoriaGrafos.modelo.Grafo;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class Main {
    public static void main(String[] args) {
        Graph<String, DefaultWeightedEdge> grafo = new Grafo().crearGrafo();
        new Dijkstra().rutaOptima(grafo, Nodo.Armenia.name(), Nodo.Cali.name());

    }
}
