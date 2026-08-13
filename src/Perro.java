public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + (3000 * edad);
    }
}