package TeoriaGrafos;

import TeoriaGrafos.enums.Nodo;
import TeoriaGrafos.modelo.Dijkstra;
import TeoriaGrafos.modelo.Grafo;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/TeoriaGrafos/Rutas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("App Rutas");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
