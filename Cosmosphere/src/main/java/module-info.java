module project.cosmosphere {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.desktop;

    opens project.cosmosphere to javafx.fxml;
    opens project.controller to javafx.fxml;
    exports project.cosmosphere;
}
