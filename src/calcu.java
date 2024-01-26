import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu extends JFrame {
    private JButton MULTIPLICARButton;
    private JTextField textField1;
    private JButton SUMARButton;
    private JButton RESTARButton;
    private JButton DIVIDIRButton;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel cruyff;

    public calcu() {
        super("Mateo ");
        setContentPane(cruyff);
        SUMARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((textField2.getText()));
                    Double val2 = Double.parseDouble((textField3.getText()));
                    double recibe_resultado = val1 + val2;
                    textField1.setText(Double.toString((recibe_resultado)));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }
            }
        });
        RESTARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((textField2.getText()));
                    Double val2 = Double.parseDouble((textField3.getText()));
                    double recibe_resultado = val1 - val2;
                    textField1.setText(Double.toString((recibe_resultado)));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede divisir por cero");
                }
            }
        });

        MULTIPLICARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((textField2.getText()));
                    Double val2 = Double.parseDouble((textField3.getText()));
                    double recibe_resultado = val1 * val2;
                    textField1.setText(Double.toString((recibe_resultado)));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }
            }
        });
        DIVIDIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((textField2.getText()));
                    Double val2 = Double.parseDouble((textField3.getText()));
                    double recibe_resultado = val1 / val2;
                    textField1.setText(Double.toString((recibe_resultado)));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede divisir por cero");
                }
            }
        });
    }

}
