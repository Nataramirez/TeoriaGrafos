package TeoriaGrafos.viewcontroller;

import TeoriaGrafos.enums.Nodo;
import TeoriaGrafos.modelo.Dijkstra;
import TeoriaGrafos.modelo.Grafo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class RutasViewController {

    @FXML
    private ComboBox<Nodo> ComboBoxFinalizaRuta;

    @FXML
    private ComboBox<Nodo> ComboBoxIniciarRuta;

    @FXML
    private Button btnCalcularRuta;

    @FXML
    private TextArea txtAreaResultado;

    @FXML
    public void initialize() {
        ComboBoxIniciarRuta.getItems().setAll(Nodo.values());
        ComboBoxFinalizaRuta.getItems().setAll(Nodo.values());
    }

    @FXML
    void onCalcularRuta(ActionEvent event) {
        Nodo nodoInicio = ComboBoxIniciarRuta.getValue();
        Nodo nodoFinal = ComboBoxFinalizaRuta.getValue();

        if (nodoInicio != null && nodoFinal != null) {
            Grafo grafo = new Grafo();
            Dijkstra dijkstra = new Dijkstra();
            String resultadoRuta = dijkstra.rutaOptima(grafo.crearGrafo(), nodoInicio.name(), nodoFinal.name());

            txtAreaResultado.setText(resultadoRuta);

        } else {
            txtAreaResultado.setText("Por favor, selecciona ambas ciudades de inicio y final.");
        }
    }
}
