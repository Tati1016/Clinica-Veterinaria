import java.util.ArrayList;

public class Perro extends Animal implements Vacunable, Asegurable {

    private String raza;
    private ArrayList<String> vacunasAplicadas;
    private String numeroPoliza;

    public Perro(String nombre, int edad, String nombreDueno, String raza, String numeroPoliza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        this.vacunasAplicadas = new ArrayList<>();
        this.numeroPoliza = numeroPoliza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + (3000 * edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunasAplicadas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}