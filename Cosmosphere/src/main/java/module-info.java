module project.cosmosphere {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens project.cosmosphere to javafx.fxml;
    exports project.cosmosphere;
}
