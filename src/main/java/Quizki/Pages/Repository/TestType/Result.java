package Quizki.Pages.Repository.TestType;

import Quizki.Models.Variables;
import Quizki.Pages.Main_window.Main;
import Quizki.Pages.Repository.CardType.CardType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * Реализация окна результатов прохождения текстового формата теста.
 * Отображаются соответствия между ответами пользователя и ответами теста.
 * Пользователь имеет доступ к повторному прохождению теста,
 * или прохождению специального теста, состоящего исключительно из вопросов,
 * на которые пользователь ответил неправильно (см. TestType).
 */

public class Result {
    public static Pane p;
    public static Label l_correct_count, l_incorrect_count;
    public static Button b_continue, b_again, b_back;
    public static Scene scene;
    public static void changeScene() {
        p = new Pane();
        l_correct_count = new Label("Верных ответов: " + TestType.arr_corr.size());
        firstOption(l_correct_count, 0, 20, true);

        l_incorrect_count = new Label("Неверных ответов: " + TestType.arr_wrong.size());
        firstOption(l_incorrect_count, 0, 50, true);

        b_continue = new Button("Продолжить");
        firstOption(b_continue, 0, 100, true);
        b_continue.setOnAction(new Events.continueStudy());


        b_again = new Button("Начать заново");
        firstOption(b_again, 150, 100, true);
        b_again.setOnAction(new Events.AgainCard());


        b_back = new Button("Назад");
        firstOption(b_back, 0, 300, true);
        b_back.setOnAction(new Events.BackScene());


        scene = new Scene(p, Variables.appWidth, Variables.appHeight);
        scene.getStylesheets().add("repository_style.css");
        Main.temp.setScene(scene);
    }
    static private void firstOption(Button temp, int x, int y, boolean flag) {
        temp.setLayoutX(x);
        temp.setLayoutY(y);
        temp.setVisible(flag);
        p.getChildren().add(temp);
    }
    static private void firstOption(TextField temp, int x, int y, boolean flag) {
        temp.setLayoutX(x);
        temp.setLayoutY(y);
        temp.setVisible(flag);
        p.getChildren().add(temp);
    }
    static private void firstOption(Label temp, int x, int y, boolean flag) {
        temp.setLayoutX(x);
        temp.setLayoutY(y);
        temp.setVisible(flag);
        p.getChildren().add(temp);
    }
}
