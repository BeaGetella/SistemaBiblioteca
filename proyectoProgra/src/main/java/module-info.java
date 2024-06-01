module com.cindypu_prueba2.proyectoprogra {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.cindypu_prueba2.proyectoprogra to javafx.fxml;
    exports com.cindypu_prueba2.proyectoprogra;
}
