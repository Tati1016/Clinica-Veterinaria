public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro(
                "Machas",
                4,
                "Tatiana",
                "Beagle",
                "001"
        );

        Gato gato = new Gato(
                "Milo",
                3,
                "Angel",
                true,
                "002"
        );

        Ave ave = new Ave(
                "Kiko",
                2,
                "Mayerlis",
                180
        );

        Conejo conejo = new Conejo(
                "Blanco",
                1,
                "Maria"
        );

        Animal[] animales = {perro, gato, ave, conejo};

        for (Animal animal : animales) {
            animal.imprimirFicha();
            System.out.println();
        }

        perro.registrarVacuna("Vacuna contra parvovirus");
        perro.registrarVacuna("Vacuna contra la rabia");
        gato.registrarVacuna("Vacuna contra rinotraqueitis");

        System.out.println("Vacunas aplicadas a Machas: " + perro.getVacunasAplicadas());
        System.out.println("Vacunas aplicadas a Milo: " + gato.getVacunasAplicadas());

        System.out.println();

        Clinica clinica = new Clinica(
                "VetCare",
                "Bogota"
        );

        Asegurable[] asegurables = {perro, gato, clinica};

        for (Asegurable asegurable : asegurables) {
            System.out.println("Poliza: " + asegurable.obtenerNumeroPoliza());
            System.out.println("Prima anual: $" + asegurable.calcularPrimaSeguro());
            System.out.println();
        }
    }
}