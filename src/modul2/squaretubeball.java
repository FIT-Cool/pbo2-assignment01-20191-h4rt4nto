package modul2;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * author: Johnson Hartanto
 * NRP: 1772017
 */

public class squaretubeball {

    public TextField rad;
    public TextField lbr;
    public TextField pjg;
    public TextField tgn;
    private double luas,keliling;

    public void setSquare(ActionEvent actionEvent) {
        rad.setDisable(true);
        pjg.setDisable(false);
        lbr.setDisable(false);
        tgn.setDisable(true);
    }

    public void setBall(ActionEvent actionEvent) {
        rad.setDisable(false);
        pjg.setDisable(true);
        lbr.setDisable(true);
        tgn.setDisable(true);
    }

    public void setTube(ActionEvent actionEvent) {
        rad.setDisable(false);
        pjg.setDisable(true);
        lbr.setDisable(true);
        tgn.setDisable(false);
    }

    public void hitung(ActionEvent actionEvent) {

        if (rad.isDisable()==false && tgn.isDisable()==false){
            keliling=2*3.14*Integer.parseInt(rad.getText())*(Integer.parseInt(rad.getText())+Integer.parseInt(tgn.getText()));
            luas=3.14*Math.pow(Integer.parseInt(rad.getText()),2)*Integer.parseInt(tgn.getText());
        }
        else if (pjg.isDisable()==false && lbr.isDisable()==false){
            luas=Integer.parseInt(pjg.getText())*Integer.parseInt(lbr.getText());
            keliling=2*(Integer.parseInt(pjg.getText())+Integer.parseInt(lbr.getText()));
        }
        else{
            keliling=4*3.14*Math.pow(Integer.parseInt(rad.getText()),2);
            luas=(4*3.14*Math.pow(Integer.parseInt(rad.getText()),3))/3;

        }
        Alert inf=new Alert(Alert.AlertType.INFORMATION);
        inf.setContentText("Surface area:"+keliling+", Volume:"+luas);
        inf.show();
    }
}
