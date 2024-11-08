import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class p144_Temperaturas extends JFrame implements ActionListener, ChangeListener {

    JPanel p1;
    JLabel lblfarenheit, lblcentigrados;
    JTextField txtfarenheit, txtcentigrados ;
    ButtonGroup grpOpciones;
    JRadioButton rbtfarenheit, rbtcentigrados;
    JButton btnCalcular, btnSalir;

    public p144_Temperaturas() {
        super("Calcular temperatura");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        lblfarenheit = new JLabel(" Ingresa los grados f : ", JLabel.RIGHT);
        p1.add(lblfarenheit);
        txtfarenheit = new JTextField();
        p1.add(txtfarenheit);
        lblcentigrados = new JLabel(" Ingresa los grados c : ", JLabel.RIGHT);
        p1.add(lblcentigrados);
        txtcentigrados = new JTextField();
        p1.add(txtcentigrados);
        

        grpOpciones = new ButtonGroup();
        rbtfarenheit = new JRadioButton(" farenheit");
        rbtcentigrados = new JRadioButton(" centigrados");
       
        grpOpciones.add(rbtfarenheit);
        grpOpciones.add(rbtcentigrados);
       
        p1.add(rbtfarenheit);
        p1.add(rbtcentigrados);
        
        add(p1);
        btnCalcular = new JButton("Aceptar");
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        add(btnSalir);

        rbtfarenheit.addChangeListener(this);
        rbtcentigrados.addChangeListener(this);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        txtfarenheit.setEnabled(true);
        txtcentigrados.setEnabled(true);
      
        if (rbtfarenheit.isSelected()) {
            txtfarenheit.setEnabled(false);
        } else if (rbtcentigrados.isSelected()) {
            txtcentigrados.setEnabled(false);
        } 
        
        
    }

    public void actionPerformed(ActionEvent e) {
        float f, c;
        if (e.getSource() == btnCalcular) {
            try {
                if (rbtfarenheit.isSelected()) {
                    c = Float.parseFloat(txtcentigrados.getText());
                    f =  ( c * 9 / 5 ) + 32;
                    txtfarenheit.setText(String.format("%.2f", f));
                } else if (rbtcentigrados.isSelected()) {
                    f = Float.parseFloat(txtfarenheit.getText());
                    c = ( f - 32 ) * 5 / 9;
                    txtcentigrados.setText(String.format("%.2f", c));
                } 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Faltan valores", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        p144_Temperaturas app = new p144_Temperaturas();
        app.setBounds(10, 10, 300, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  

}