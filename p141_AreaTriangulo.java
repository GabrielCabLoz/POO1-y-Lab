import javax.swing.*;
import java.awt.event.*;

public class p141_AreaTriangulo extends JFrame implements ActionListener {

    JLabel lblBase,lblAltura,lblResultado;
    JTextField txtBase,txtAltura,txtResultado;
    JButton btnCalcular,btnSalir;

    public p141_AreaTriangulo(){
        super("Calcular el area del triangulo");
        setLayout(null);

        lblBase=new JLabel("Base");
        lblBase.setBounds(10,20,200,30);
        add(lblBase);
        txtBase=new JTextField();
        txtBase.setBounds(80,20,200,30);
        add(txtBase);

        lblAltura=new JLabel("Altura");
        lblAltura.setBounds(10,50,200,30);
        add(lblAltura);
        txtAltura=new JTextField();
        txtAltura.setBounds(80,50,200,30);
        add(txtAltura);

        lblResultado=new JLabel("Resultado aqui ");
        lblResultado.setBounds(90,80,200,30);
        add(lblResultado);

        lblResultado=new JLabel("Calcular ");
        lblResultado.setBounds(90,80,100,30);
        add(lblResultado);

        lblResultado=new JLabel("Salir ");
        lblResultado.setBounds(150, 100,100,40);
        add(lblResultado);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);

        
    }

    public float Calculararea(float base ,float altura){
        return (base*altura)/2;

    }


    public void actionPerformed(ActionEvent e){

        if (e.getSource()==btnCalcular){

            float base=Float.parseFloat(txtBase.getText());
            float altura=Float.parseFloat(txtAltura.getText());

            float area=Calculararea(base,altura);

            lblResultado.setText(String.format("%.2f",area));
        }else if (e.getSource()==btnSalir);{
            
            JOptionPane.showMessageDialog(this, "Ya caile compa");
            dispose();

        }

        
    }

    public static void main(String[] args) {

        p141_AreaTriangulo app =new p141_AreaTriangulo();
        app.setBounds(10,10,300,20);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);


        
    }

     
}
