package P98_Circulo;

public class radio_circulo {
double radio;

//Constructor
public radio_circulo(double radio){
    this.radio=radio;

}
public double getRadio(){
    return radio;
}

public void setRadio(double radio){
   this.radio=radio;

}

public double getArea(){
    return (radio*radio)*3.1416;
}

 public double getCircunferencia(){
     return (2*3.1416)*radio;
 }

//toString
public String toString() {
    return "radio_circulo [radio=" + radio + "]";
}

  
}


