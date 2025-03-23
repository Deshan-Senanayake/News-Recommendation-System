module org.example.s {


    requires org.json;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.net.http;
    requires mysql.connector.j;
    requires mahout.math;
    requires junit;


    // Open and export packages for JavaFX and other modules
    exports org.example.API;

    opens classes to javafx.fxml, javafx.graphics; // Allow javafx.graphics to access classes.Main
    exports classes;

    opens controllers to javafx.fxml;  // Allow JavaFX to access controllers.RegisterController
    exports controllers;
    exports recommendationEngine;
    opens recommendationEngine to javafx.fxml, javafx.graphics;
    exports article_categorization;
    opens article_categorization to javafx.fxml, javafx.graphics;
    exports user_management;
    opens user_management to javafx.fxml, javafx.graphics;
    exports article_recommendations;
    opens article_recommendations to javafx.fxml, javafx.graphics;
    opens org.example.API to javafx.fxml, javafx.graphics;
    exports user_action_handlers;
    opens user_action_handlers to javafx.fxml, javafx.graphics;
}
