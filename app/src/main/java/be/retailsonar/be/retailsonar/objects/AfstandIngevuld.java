package be.retailsonar.be.retailsonar.objects;

/**
 * Created by sander on 8/20/18.
 */

public class AfstandIngevuld {
    private int  filiaalId;
    private double waarde;

    public AfstandIngevuld(int filiaalId, double waarde){
        this.filiaalId=filiaalId;
        System.out.println("filiaalid: "+this.filiaalId);
        this.waarde=waarde;
    }

    public void setAfstand(double afstand ) {
        this.waarde = afstand;
    }

    public double getAfstand() {
        return waarde;
    }
}
