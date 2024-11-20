package TeoriaGrafos.modelo;

import TeoriaGrafos.enums.Nodo;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

public class Grafo {
    private Graph<String, DefaultWeightedEdge> grafoRuta;

    public Graph<String, DefaultWeightedEdge> crearGrafo() {
        grafoRuta = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);

        // Agregar vértices
        grafoRuta.addVertex(Nodo.Armenia.name());
        grafoRuta.addVertex(Nodo.Circasia.name());
        grafoRuta.addVertex(Nodo.Montenegro.name());
        grafoRuta.addVertex(Nodo.Tebaida.name());
        grafoRuta.addVertex(Nodo.Pereira.name());
        grafoRuta.addVertex(Nodo.Manizales.name());
        grafoRuta.addVertex(Nodo.Cartago.name());
        grafoRuta.addVertex(Nodo.Paila.name());
        grafoRuta.addVertex(Nodo.Buga.name());
        grafoRuta.addVertex(Nodo.Yotoco.name());
        grafoRuta.addVertex(Nodo.Rozo.name());
        grafoRuta.addVertex(Nodo.Amaime.name());
        grafoRuta.addVertex(Nodo.Palmira.name());
        grafoRuta.addVertex(Nodo.Cedrito.name());
        grafoRuta.addVertex(Nodo.Yumbo.name());
        grafoRuta.addVertex(Nodo.Cali.name());

        // Agregar aristas y asignar pesos
        DefaultWeightedEdge ruta1 = grafoRuta.addEdge(Nodo.Armenia.name(), Nodo.Circasia.name());
        grafoRuta.setEdgeWeight(ruta1, 12);
        DefaultWeightedEdge ruta2 = grafoRuta.addEdge(Nodo.Armenia.name(), Nodo.Montenegro.name());
        grafoRuta.setEdgeWeight(ruta2, 12);
        DefaultWeightedEdge ruta3 = grafoRuta.addEdge(Nodo.Armenia.name(), Nodo.Tebaida.name());
        grafoRuta.setEdgeWeight(ruta3, 17);
        DefaultWeightedEdge ruta4 = grafoRuta.addEdge(Nodo.Circasia.name(), Nodo.Pereira.name());
        grafoRuta.setEdgeWeight(ruta4, 35);
        DefaultWeightedEdge ruta5 = grafoRuta.addEdge(Nodo.Montenegro.name(), Nodo.Cartago.name());
        grafoRuta.setEdgeWeight(ruta5, 39);
        DefaultWeightedEdge ruta6 = grafoRuta.addEdge(Nodo.Pereira.name(), Nodo.Manizales.name());
        grafoRuta.setEdgeWeight(ruta6, 53);
        DefaultWeightedEdge ruta7 = grafoRuta.addEdge(Nodo.Pereira.name(), Nodo.Cartago.name());
        grafoRuta.setEdgeWeight(ruta7, 30);
        DefaultWeightedEdge ruta8 = grafoRuta.addEdge(Nodo.Cartago.name(), Nodo.Paila.name());
        grafoRuta.setEdgeWeight(ruta8, 56);
        DefaultWeightedEdge ruta9 = grafoRuta.addEdge(Nodo.Tebaida.name(), Nodo.Paila.name());
        grafoRuta.setEdgeWeight(ruta9, 41);
        DefaultWeightedEdge ruta10 = grafoRuta.addEdge(Nodo.Paila.name(), Nodo.Buga.name());
        grafoRuta.setEdgeWeight(ruta10, 60);
        DefaultWeightedEdge ruta11 = grafoRuta.addEdge(Nodo.Buga.name(), Nodo.Yotoco.name());
        grafoRuta.setEdgeWeight(ruta11, 12);
        DefaultWeightedEdge ruta12 = grafoRuta.addEdge(Nodo.Buga.name(), Nodo.Cedrito.name());
        grafoRuta.setEdgeWeight(ruta12, 26);
        DefaultWeightedEdge ruta13 = grafoRuta.addEdge(Nodo.Cartago.name(), Nodo.Yotoco.name());
        grafoRuta.setEdgeWeight(ruta13, 140);
        DefaultWeightedEdge ruta14 = grafoRuta.addEdge(Nodo.Yotoco.name(), Nodo.Rozo.name());
        grafoRuta.setEdgeWeight(ruta14, 42);
        DefaultWeightedEdge ruta15 = grafoRuta.addEdge(Nodo.Yotoco.name(), Nodo.Yumbo.name());
        grafoRuta.setEdgeWeight(ruta15, 44);
        DefaultWeightedEdge ruta16 = grafoRuta.addEdge(Nodo.Cedrito.name(), Nodo.Rozo.name());
        grafoRuta.setEdgeWeight(ruta16, 15);
        DefaultWeightedEdge ruta17 = grafoRuta.addEdge(Nodo.Cedrito.name(), Nodo.Amaime.name());
        grafoRuta.setEdgeWeight(ruta17, 12);
        DefaultWeightedEdge ruta18 = grafoRuta.addEdge(Nodo.Cedrito.name(), Nodo.Palmira.name());
        grafoRuta.setEdgeWeight(ruta18, 27);
        DefaultWeightedEdge ruta19 = grafoRuta.addEdge(Nodo.Rozo.name(), Nodo.Yumbo.name());
        grafoRuta.setEdgeWeight(ruta19, 12);
        DefaultWeightedEdge ruta20 = grafoRuta.addEdge(Nodo.Rozo.name(), Nodo.Cali.name());
        grafoRuta.setEdgeWeight(ruta20, 28);
        DefaultWeightedEdge ruta21 = grafoRuta.addEdge(Nodo.Amaime.name(), Nodo.Palmira.name());
        grafoRuta.setEdgeWeight(ruta21, 9);
        DefaultWeightedEdge ruta22 = grafoRuta.addEdge(Nodo.Palmira.name(), Nodo.Cali.name());
        grafoRuta.setEdgeWeight(ruta22, 30);
        DefaultWeightedEdge ruta23 = grafoRuta.addEdge(Nodo.Yumbo.name(), Nodo.Cali.name());
        grafoRuta.setEdgeWeight(ruta23, 13);
        return grafoRuta;
    }

}
