package pl.lublin.wsei.java.cwiczenia.lab_2new;

import javafx.application.HostServices;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    public TextField txtAdresStrony;
    public Button btnPrzejdzDoStrony;
    public Button btnPokazInfografike;
    public ImageView imgMiniaturka;
    public Label lbFile;
    private Stage stage;
    private HostServices hostServices;
    Infografika selInfografika;
    FileChooser fileChooser = new FileChooser();
    FileChooser.ExtensionFilter xmlFilter = new FileChooser.ExtensionFilter("Pliki XML (*.xml)", "*.xml");
    public ListView lstInfografiki;
    ObservableList<String> tytuly = FXCollections.observableArrayList();
    GusInfoGraphicList igList;


    public void initialize() {
        fileChooser.getExtensionFilters().add(xmlFilter);
        lstInfografiki.getSelectionModel().selectedIndexProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observableValue, Number old_val, Number new_val) {
                        int index = new_val.intValue();
                        if (index != -1){
                            selInfografika = igList.infografiki.get(index);
                            txtAdresStrony.setText(igList.infografiki.get(index).graphicWebsiteAddress);
                            Image image = new Image(igList.infografiki.get(index).thumbnailAddress);
                            imgMiniaturka.setImage(image);
                        }
                        else {
                            txtAdresStrony.setText("");
                            imgMiniaturka.setImage(null);
                        }
                    }
                }
        );
    }
    public void btnZaladujStrone(ActionEvent actionEvent) {
        if (selInfografika != null)
            hostServices.showDocument(selInfografika.graphicWebsiteAddress);
    }


    public void btnOpenFileAction(ActionEvent actionEvent) {
        File file = fileChooser.showOpenDialog(null);
        if (file != null){
            igList = new GusInfoGraphicList(file.getAbsolutePath());
            lbFile.setText(file.getAbsolutePath());
            for (Infografika ig: igList.infografiki) tytuly.add(ig.graphicTitle);
            lstInfografiki.setItems(tytuly);
        }
        else {
            lbFile.setText("Proszę wczytać plik ...");
        }
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }


    public void setHostServices(HostServices hostServices) {
        this.hostServices = hostServices;
    }
}