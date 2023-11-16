package FoodOrder;

import javax.swing.*;

public class FoodOrder extends JFrame {
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrink;
    private JCheckBox cIcedTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel jpanel;

    public FoodOrder(){
        btnOrder.addActionListener(e -> {
            double total = 0;
            double disc = 0;

            if(cPizza.isSelected()){
                total+= 100;
            }
            if(cBurger.isSelected()){
                total+= 80;
            }
            if(cFries.isSelected()){
                total+= 65;
            }
            if(cSoftDrink.isSelected()){
                total+= 55;
            }
            if(cIcedTea.isSelected()){
                total+= 50;
            }
            if(cSundae.isSelected()){
                total+= 40;
            }
            if(rbNone.isSelected()){
                disc = 0;

            }
            else if(rb5.isSelected()){
                disc = 0.05;

            }
            else if(rb10.isSelected()){
                disc = 0.10;

            }
            else if(rb15.isSelected()){
                disc = 0.15;
            }
            double amnt = total - (total * disc);
            JOptionPane.showMessageDialog(null,"The total price is Php " + amnt);

        });
    }

    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.jpanel);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
