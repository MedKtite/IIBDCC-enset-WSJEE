package metier;

import doa.IDoa;

public class MetierImpl implements IMetier {
    private IDoa doa;
    @Override
    public double calcul() {
        double tmp=  doa.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setDoa(IDoa doa) {
        this.doa = doa;
    }
}
