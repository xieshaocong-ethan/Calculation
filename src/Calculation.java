import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Jan 13 10:25:58 CST 2019
 */



/**
 * @author Ethantse
 */
public class Calculation extends JFrame {
    public static void main(String[] args) {
        new Calculation();
    }
    public Calculation() {
        initComponents();
    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
        if (e.getStateChange() == ItemEvent.SELECTED) {
            textField1.setEditable(false);
            double start = Double.parseDouble(textField1.getText());
            String item = String.valueOf(e.getItem());
            try {
            if (item == "+") {
                double result = start + Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(result));
                System.out.println("+");
            } else if (item == "-") {
                System.out.println("-");
                double result = start - Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(result));
            } else if (item == "*") {
                System.out.println("*");
                double result = start * Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(result));
            } else if (item == "/") {
                System.out.println("/");
                double result = start / Double.parseDouble(textField2.getText());
                textField1.setText(String.valueOf(result));
            }
        } catch (NumberFormatException e11){
                System.out.println("未填入数字");
            comboBox1.setSelectedIndex(0);
        }

        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        comboBox1 = new JComboBox<>();
        textField1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        setVisible(true);
        Container contentPane = getContentPane();

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "\u9009\u62e9\u8fd0\u7b97\u7b26 ",
            "+",
            "-",
            "*",
            "/"
        }));
        comboBox1.addItemListener(e -> comboBox1ItemStateChanged(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comboBox1)))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(229, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JComboBox<String> comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
