module com.moonarc.snake {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.moonarc.snake to javafx.fxml;
    exports com.moonarc.snake;
}