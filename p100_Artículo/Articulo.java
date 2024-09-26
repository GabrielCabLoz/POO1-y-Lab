package p100_Artículo;

public class Articulo {
    int cantidad;
    String id,desc;
    double PrecioUnit;
    
    //Constructor
    public Articulo(String id,String desc,int cantidad,double PrecioUnit){
       this.id=id;
       this.cantidad=cantidad;
       this.desc=desc;
       this.PrecioUnit=PrecioUnit;

    }

    public String getId() {
        return id;
    }

    public int getCant() {
        return cantidad;
    }

    public void setCant(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrecioUnit() {
        return PrecioUnit;
    }

    public void setPrecioUnit(double PrecioUnit){
        this.PrecioUnit=PrecioUnit;
    }

    public double getTotal(){
        return PrecioUnit*cantidad;
    }

    @Override
    public String toString() {
        return "Articulo [id=" + id + ", cantidad=" + cantidad + ", desc=" + desc + ", PrecioUnit=" + PrecioUnit + "]";
    }

    

   



    
    
}
