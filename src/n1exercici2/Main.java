package n1exercici2;

@SuppressWarnings("deprecation")
public class Main {

    public static void main(String[] args) {
        TreballadorExtra treballadorExtra= new TreballadorExtra(100, 10);
        System.out.println("sou = " + treballadorExtra.pagarNomina());

        treballadorExtra.augmentDeSou(100);
        System.out.println("sou = " + treballadorExtra.pagarNomina());
    }

}
