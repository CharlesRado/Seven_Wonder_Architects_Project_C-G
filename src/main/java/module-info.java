module com.example.seven_wonder_architects_project_cg {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.seven_wonder_architects_project_cg to javafx.fxml;
    exports com.example.seven_wonder_architects_project_cg;
}