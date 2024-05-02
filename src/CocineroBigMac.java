//Implementación concreta del Builder
public class CocineroBigMac implements Cocinero {

    // Aplicando Singleton.
    private static CocineroBigMac instance;

    public static CocineroBigMac getInstance() {
        if (instance == null) {
            instance = new CocineroBigMac();
        }
        return instance;
    }
    // ------------------------------------------------


    //Aplicando patron de diseño "Builder"
    private Hamburguesa hamburguesa;

    private CocineroBigMac() {
        this.hamburguesa = new Hamburguesa();
    }

    public void newHamburguesa() {
        this.hamburguesa = new Hamburguesa();
    }


    //Setters
    public void setTEspecialidad(String tipoEspecialidad) {
        hamburguesa.setCarne(tipoEspecialidad);
    }
    public void setLechuga(boolean lechuga) {
        hamburguesa.setLechuga(lechuga);
    }
    public void setTomate(boolean tomate) {
        hamburguesa.setTomate(tomate);
    }
    public void setCebolla(boolean cebolla) {
        hamburguesa.setCebolla(cebolla);
    }
    public void setQueso(boolean queso) {
        hamburguesa.setQueso(queso);
    }
    //-------------------------------------------------------------

    public Hamburguesa build() {
        return hamburguesa;
    }

}
