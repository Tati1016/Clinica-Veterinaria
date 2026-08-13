import java.util.ArrayList;

public class Gato extends Animal implements Vacunable, Asegurable {

    private boolean esEsterilizado;
    private ArrayList<String> vacunasAplicadas;
    private String numeroPoliza;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado, String numeroPoliza) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        this.vacunasAplicadas = new ArrayList<>();
        this.numeroPoliza = numeroPoliza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
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
        if (esEsterilizado) {
            return 120000;
        }

        return 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}