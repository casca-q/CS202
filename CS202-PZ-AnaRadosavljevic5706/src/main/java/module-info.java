module com.example.cs202pzanaradosavljevic5706 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.simplejavamail;
    requires org.simplejavamail.core;
    requires java.sql;
    requires junit;
    requires org.junit.jupiter.api;
    requires org.testng;


    opens main to javafx.fxml;
    exports main;
    exports agencija;
    exports application;
    opens agencija to javafx.fxml;
}