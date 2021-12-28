package n1exercici2;

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

    @Deprecated
    public void augmentDeSou(int augment) {
        this.souAnual = this.souAnual + augment;
    }
}
