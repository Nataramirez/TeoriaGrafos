package TeoriaGrafos.modelo;

import TeoriaGrafos.enums.Nodo;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.util.List;

public class Dijkstra {

    // Cambié el tipo de retorno de void a String
    public String rutaOptima(Graph<String, DefaultWeightedEdge> grafo, String nodoInicio, String nodoFinal) {
        // Crear el algoritmo de Dijkstra
        DijkstraShortestPath<String, DefaultWeightedEdge> dijkstraAlg = new DijkstraShortestPath<>(grafo);

        // Encontrar el camino más corto desde el nodo de inicio al nodo de destino
        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultWeightedEdge> iPaths = dijkstraAlg.getPaths(nodoInicio);

        // Obtener el camino más corto
        List<DefaultWeightedEdge> path = iPaths.getPath(nodoFinal).getEdgeList();

        // Construir el resultado como un String
        StringBuilder resultado = new StringBuilder();
        resultado.append("Camino más corto desde ").append(nodoInicio).append(" hasta ").append(nodoFinal).append(":\n");

        String actual = nodoInicio; // Nodo actual para imprimir consistentemente el camino

        for (DefaultWeightedEdge edge : path) {
            String source = grafo.getEdgeSource(edge);
            String target = grafo.getEdgeTarget(edge);

            // Determinar el orden correcto (de actual a siguiente nodo)
            if (source.equals(actual)) {
                resultado.append(source).append(" -> ").append(target).append("\n");
                actual = target;
            } else {
                resultado.append(target).append(" -> ").append(source).append("\n");
                actual = source;
            }
        }

        // Añadir la longitud del camino
        resultado.append("Longitud del camino: ").append(dijkstraAlg.getPathWeight(nodoInicio, nodoFinal)).append(" kilómetros");

        // Retornar el resultado como un String
        return resultado.toString();
    }
}
