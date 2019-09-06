package modul1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

/**
 * author: Johnson Hartanto
 * NRP: 1772017
 */

public class Paperrockscissor {
    public ImageView imgUser;
    public ImageView imgComp;
    public TextField countWin;
    public TextField countLose;
    public TextField countDraw;
    public Button btnPaper;
    public Button btnRock;
    public Button btnScissor;
    private int number,win=0,lose=0,draw=0;


    public void setPaper(ActionEvent actionEvent) {
        imgUser.setImage(new Image("modul1/gambar/paper.jpg"));
        Random rnd=new Random();
        number=rnd.nextInt(3);
        if (number==1){
            imgComp.setImage(new Image("modul1/gambar/rock.jpg"));
            win+=1;
            countWin.setText(String.valueOf(win));
        }
        else if (number==2){
            imgComp.setImage(new Image("modul1/gambar/paper.jpg"));
            draw+=1;
            countDraw.setText(String.valueOf(draw));
        }
        else if (number==0){
            imgComp.setImage(new Image("modul1/gambar/scissor.jpg"));
            lose+=1;
            countLose.setText(String.valueOf(lose));
        }
        btnPaper.setDisable(true);
        btnRock.setDisable(false);
        btnScissor.setDisable(false);
    }

    public void setRock(ActionEvent actionEvent) {
        imgUser.setImage(new Image("modul1/gambar/rock.jpg"));
        Random rnd=new Random();
        number=rnd.nextInt(3);
        if (number==1){
            imgComp.setImage(new Image("modul1/gambar/scissor.jpg"));
            win++;
            countWin.setText(String.valueOf(win));
        }
        else if (number==2){
            imgComp.setImage(new Image("modul1/gambar/paper.jpg"));
            lose++;
            countLose.setText(String.valueOf(lose));
        }
        else if (number==0){
            imgComp.setImage(new Image("modul1/gambar/rock.jpg"));
            draw++;
            countDraw.setText(String.valueOf(draw));
        }
        btnPaper.setDisable(false);
        btnRock.setDisable(true);
        btnScissor.setDisable(false);
    }

    public void setScissor(ActionEvent actionEvent) {
        imgUser.setImage(new Image("modul1/gambar/scissor.jpg"));
        Random rnd=new Random();
        number=rnd.nextInt(3);
        if (number==1){
            imgComp.setImage(new Image("modul1/gambar/paper.jpg"));
            win++;
            countWin.setText(String.valueOf(win));
        }
        else if (number==2){
            imgComp.setImage(new Image("modul1/gambar/rock.jpg"));
            lose++;
            countLose.setText(String.valueOf(lose));
        }
        else if (number==0){
            imgComp.setImage(new Image("modul1/gambar/scissor.jpg"));
            draw++;
            countDraw.setText(String.valueOf(draw));
        }
        btnPaper.setDisable(false);
        btnRock.setDisable(false);
        btnScissor.setDisable(true);
    }

    public void Close(ActionEvent actionEvent) {
        Platform.exit();
    }
}
