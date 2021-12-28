package n1exercici1;

public class Main {

    public static void main(String[] args) {
        Treballador treballador = new Treballador(100);
        System.out.println("sou = " + treballador.pagarNomina());

        treballador = new TreballadorExtra(100, 10);
        System.out.println("sou = " + treballador.pagarNomina());
    }

}
