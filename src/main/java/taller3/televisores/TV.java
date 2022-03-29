package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private Boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;

    TV(Marca marca, Boolean estado){
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
    }

    //metodos get y set
    public Marca getMarca(){return this.marca;}
    public int getCanal(){return this.canal;}
    public int getPrecio(){return this.precio;}
    public int getVolumen(){return this.volumen;}
    public Control getControl(){return this.control;}
    public static int getNumTV(){return TV.numTV;}
    public Boolean getEstado(){return this.estado;}

    public void setMarca(Marca marca){this.marca = marca;}
    public void setCanal(int canal){this.canal = canal;}
    public void setPrecio(int precio){this.precio = precio;}
    public void setControl(Control control){this.control = control;}
    public void setVolumen(int volumen){this.volumen = volumen;}
    public void turnOn(){this.estado = true;}
    public void turnOff(){this.estado = false;}
    public static void setNumTV(int numTV){TV.numTV = numTV;}


}
