package TeoriaGrafos.modelo;

import TeoriaGrafos.enums.Nodo;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.util.List;

public class Dijkstra {
    public void rutaOptima(Graph<String, DefaultWeightedEdge> grafo, String nodoInicio, String nodoFinal) {

        // Crear el algoritmo de Dijkstra
        DijkstraShortestPath<String, DefaultWeightedEdge> dijkstraAlg = new DijkstraShortestPath<>(grafo);

        // Encontrar el camino más corto desde el vértice "A" al vértice "C"
        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultWeightedEdge> iPaths = dijkstraAlg.getPaths(nodoInicio);

        // Obtener el camino más corto
        List<DefaultWeightedEdge> path = iPaths.getPath(nodoFinal).getEdgeList();

        // Imprimir el camino más corto y su longitud
        System.out.println("Camino más corto desde "+ nodoInicio +" hasta " + nodoFinal + ":");

        for (DefaultWeightedEdge edge : path) {
            System.out.println(grafo.getEdgeSource(edge) + " -> " + grafo.getEdgeTarget(edge));
        }

        System.out.println("Longitud del camino: " + dijkstraAlg.getPathWeight(nodoInicio, nodoFinal) + " kilómetros");
    }
}
