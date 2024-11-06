import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class p140_HolamundoGrafico extends JFrame {

    private JLabel lblsaludo;
    
    public p140_HolamundoGrafico(){

        setLayout(null);
        lblsaludo=new JLabel("Hola mundo Cruel "); //Texto en la ventana 
        lblsaludo.setFont(new Font("Times New Roman",Font.BOLD, 30));
        lblsaludo.setBounds(270,100,400,50); //Es el tamaño de la etiqueta
        add(lblsaludo); //Se agrega a la ventana
        setTitle("Mi primer programa en Interfaz grafica ");//Titulo de la ventana 
    }

    public static void main(String[] args) {
        p140_HolamundoGrafico Main=new p140_HolamundoGrafico();
        Main.setBounds(20,20,800,300);
        Main.setLocationRelativeTo(null);
        Main.setLocale(null);
        Main.setVisible(true);
        Main.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        

    
    
}
