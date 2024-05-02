//Clase que representa el objeto que queremos construir
public class Hamburguesa {
    String carne = "";
    boolean lechuga = false;
    boolean tomate = false;
    boolean cebolla = false;
    boolean queso = false;

    //Constructor
    public Hamburguesa(){}

    //Setters
    public void setCarne(String carne) {
        this.carne = carne;
    }
    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }
    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }
    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }
    public void setQueso(boolean queso) {
        this.queso = queso;
    }
    

    public String toString(){
        return ("Carne: " + carne + "\nLechuga: " + lechuga + "\nTomate: " + tomate + "\nCebolla: " + cebolla + "\nQueso: " + queso);
    }
}
