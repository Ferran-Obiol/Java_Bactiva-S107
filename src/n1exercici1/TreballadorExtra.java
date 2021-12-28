package n1exercici1;

public class TreballadorExtra extends Treballador {

    protected int pagaExtra;

    public TreballadorExtra(int souAnual, int pagaExtra) {
        super(souAnual);
        this.pagaExtra = pagaExtra;
    }

    @Override
    public int pagarNomina() {
        return super.pagarNomina() + pagaExtra;
    }

}
