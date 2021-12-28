package n1exercici1;

public class Treballador {

    protected int souAnual;

    public Treballador(int souAnual) {
        this.souAnual = souAnual;
    }

    public int pagarNomina()
    {
        return souAnual;
    }

    public int getSouAnual() {
        return souAnual;
    }

    public void setSouAnual(int souAnual) {
        this.souAnual = souAnual;
    }
}
