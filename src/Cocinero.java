//Interfaz Builder para construir el objeto
public interface Cocinero {
    void setTEspecialidad(String tipoEspecialidad);
    void setLechuga(boolean lechuga);
    void setTomate(boolean tomate);
    void setCebolla(boolean cebolla);
    void setQueso(boolean queso);

    Hamburguesa build();
}
