package com.unknown;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    //private void switchtoTertiary() throws IOException {
    //    App.setRoot("tertiary");
    //}
}