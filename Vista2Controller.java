import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Controller class for the second vista.
 */
public class Vista2Controller {

    /**
     * Event handler fires when the user requests a previous vista.
     *
     * @param event the event the triggered the handler.
     */
    @FXML
    void previousPane(ActionEvent event) {
        VistaNavigator.loadVista(VistaNavigator.VISTA_1);
    }

}