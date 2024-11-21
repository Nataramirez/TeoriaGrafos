module TeoriaGrafos {
    requires org.jgrapht.core;
    requires javafx.controls;
    requires javafx.fxml;


    opens TeoriaGrafos to javafx.fxml;
    exports TeoriaGrafos;

    opens TeoriaGrafos.viewcontroller to javafx.fxml;
    exports TeoriaGrafos.viewcontroller;

}