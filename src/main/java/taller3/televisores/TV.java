package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private Boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;

    public TV(Marca marca, Boolean estado){
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
        numTV++;
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
    public void setCanal(int canal){if (canal>0 && canal<120 && this.getEstado()){this.canal = canal;}}
    public void setPrecio(int precio){this.precio = precio;}
    public void setControl(Control control){this.control = control;}
    public void setVolumen(int volumen){
        if(this.getVolumen()< 7 && this.getVolumen()>0 && this.getEstado()){this.volumen = volumen;}
    }
    public void turnOn(){this.estado = true;}
    public void turnOff(){this.estado = false;}
    public static void setNumTV(int numTV){TV.numTV = numTV;}


    //TV CONTROL
    public void canalUp(){if (this.canal<120 && this.getEstado()){setCanal(this.canal+1);}}
    public void canalDown(){setCanal(this.canal-1);}

    public void volumenUp(){setVolumen(this.volumen+1);}
    public void volumenDown(){setVolumen(this.volumen-1);}
}
