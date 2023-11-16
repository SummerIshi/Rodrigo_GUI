package Calculator;

import javax.swing.*;

public class Calculator extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JTextField lblResult;
    private JButton btnCompute;
    private JPanel jpanel;

    public Calculator(){
        btnCompute.addActionListener(e->{
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int operation = cbOperations.getSelectedIndex();

            switch(operation) {
                case 0:
                    lblResult.setText(String.valueOf(num1 + num2));
                    break;

                case 1:
                    lblResult.setText(String.valueOf(num1 - num2));
                    break;
                case 2:
                    lblResult.setText(String.valueOf(num1 * num2));
                    break;
                case 3:
                    lblResult.setText(String.valueOf(num1 / num2));
                    break;
                default:
                    break;
            }

        });
    }
 public static void main (String[]args) {
     Calculator app = new Calculator();
     app.setContentPane(app.jpanel);
     app.setSize(250, 750);
     app.setDefaultCloseOperation(EXIT_ON_CLOSE);
     app.setVisible(true);
     app.setTitle("Simple Calculator");

 }
}