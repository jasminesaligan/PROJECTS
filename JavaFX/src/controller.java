import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;


public class controller {
    @FXML

    private Circle mixy;
    private double y;
    private double y2;
    private double x;
    private double x2;


    public void UP(ActionEvent event) {
        mixy.setCenterY(y = y-10);
    }

    public void DOWN(ActionEvent event) {
        mixy.setCenterY(y2 = y2+10);
    }

    public void RIGHT(ActionEvent event) {
        mixy.setCenterX(x = x+10);
    }

    public void LEFT(ActionEvent event) {
        mixy.setCenterX(x2 = x2-10);
    }
}
