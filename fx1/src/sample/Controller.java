package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    int index = 1;
    String amaliat = "";
    String numbers1 = "";
    String numbers2 = "";

    public void makeNumber(String number) {
        if (index == 1) {
            resultShow.setText(numbers1 += number);
        } else if (index == 2) {
            resultShow.setText(numbers2 += number);
        }
    }


    @FXML
    private TextField resultShow;

    @FXML
    void button_0(ActionEvent event) {
        makeNumber("0");
    }

    @FXML
    void button_1(ActionEvent event) {
        makeNumber("1");
    }

    @FXML
    void bottun_2(ActionEvent event) {
        makeNumber("2");
    }

    @FXML
    void button_3(ActionEvent event) {
        makeNumber("3");
    }

    @FXML
    void button_4(ActionEvent event) {
        makeNumber("4");
    }

    @FXML
    void button_5(ActionEvent event) {
        makeNumber("5");
    }

    @FXML
    void button_6(ActionEvent event) {
        makeNumber("6");
    }

    @FXML
    void button_7(ActionEvent event) {
        makeNumber("7");
    }

    @FXML
    void button_8(ActionEvent event) {
        makeNumber("8");
    }

    @FXML
    void button_9(ActionEvent event) {
        makeNumber("9");
    }

    @FXML
    void calc(ActionEvent event) {

        if (amaliat.equalsIgnoreCase("sum")) {
            int result = Integer.parseInt(numbers1) + Integer.parseInt(numbers2);
            String res = String.valueOf(result);
            resultShow.setText(res);
            amaliat = "";
        } else if (amaliat.equalsIgnoreCase("sub")) {
            int result = Integer.parseInt(numbers1) - Integer.parseInt(numbers2);
            String res = String.valueOf(result);
            resultShow.setText(res);
            amaliat = "";
        } else if (amaliat.equalsIgnoreCase("zarb")) {
            int result = Integer.parseInt(numbers1) * Integer.parseInt(numbers2);
            String res = String.valueOf(result);
            resultShow.setText(res);
            amaliat = "";
        } else if (amaliat.equalsIgnoreCase("divide")) {
            float result = Float.parseFloat(numbers1) / Float.parseFloat(numbers2);
            String res = String.valueOf(result);
            resultShow.setText(res);
            amaliat = "";
        } else if (amaliat.equalsIgnoreCase("sin")) {
            float sin = (float) Math.sin(Math.toRadians(Double.parseDouble(numbers1)));
            String res = String.valueOf(sin);
            resultShow.setText(res);
            amaliat = "";
        } else if (amaliat.equalsIgnoreCase("cos")) {
            float cos = (float) Math.cos(Math.toRadians(Double.parseDouble(numbers1)));
            String res = String.valueOf(cos);
            resultShow.setText(res);
            amaliat = "";
        } else if (amaliat.equalsIgnoreCase("tan")) {
            float tan = (float) Math.tan(Math.toRadians(Double.parseDouble(numbers1)));
            String res = String.valueOf(tan);
            resultShow.setText(res);
            amaliat = "";
        } else if (amaliat.equalsIgnoreCase("pow")) {
            int pow = (int) Math.pow(Double.parseDouble(numbers1), Double.parseDouble(numbers2));
            String res = String.valueOf(pow);
            resultShow.setText(res);
        } else if (amaliat.equalsIgnoreCase("sqrt")) {
            float pow = (float) Math.sqrt(Double.parseDouble(numbers1));
            String res = String.valueOf(pow);
            resultShow.setText(res);
        }
        index = 1;
    }

    @FXML
    void pow(ActionEvent event) {
        amaliat = "pow";
        index++;

    }

    @FXML
    void sqrt(ActionEvent event) {
        amaliat = "sqrt";
        index++;
    }

    @FXML
    void clearAC(ActionEvent event) {
        numbers1 = "";
        numbers2 = "";
        amaliat = "";
        resultShow.clear();


    }

    @FXML
    void cos(ActionEvent event) {

        amaliat = "cos";
        index++;
    }

    @FXML
    void divide(ActionEvent event) {
        amaliat = "divide";
        index++;
    }

    @FXML
    void dott(ActionEvent event) {

    }

    @FXML
    void sin(ActionEvent event) {
        amaliat = "sin";
        index++;
    }

    @FXML
    void sub(ActionEvent event) {
        amaliat = "sub";
        index++;
    }

    @FXML
    void sum(ActionEvent event) {
        amaliat = "sum";
        index++;
    }

    @FXML
    void tan(ActionEvent event) {
        amaliat = "tan";
        index++;
    }

    @FXML
    void zarb(ActionEvent event) {
        amaliat = "zarb";
        index++;
    }

}
