public abstract class Figura {
private String color;

    public Figura(String color) { //Constructor
        this.color = color;
    }

    public String getColor() {
        return color;
    } //Metodo Getter
public abstract double calcularArea();


}
