public class Mängija {
    private String nimi;
    private boolean algtingimus;
    private int [] visketulemus = new int[5];
    private int puktideSumma;

//konstruktor, mis loob mängija isendi
    public Mängija(String nimi) {
        this.nimi = nimi;
        this.visketulemus = visketulemus;
        this.puktideSumma = puktideSumma;
        algtingimus = false;
    }

    // tavalised meetodid
    // tagastab ühe viisiku viske tulemused massiivina
    public int[] viienevise() {
        int[] viienevise = new int[5];
        for (int i = 0; i < viienevise.length; i++) {
            int suvaline1_6 = (int) ((Math.random() * 10 * 0.6) + 1);
            viienevise[i] = suvaline1_6;
        }
    return viienevise;
    }




    //get ja set meedotid
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int[] getVisketulemus() {
        return visketulemus;
    }

    public void setVisketulemus(int[] visketulemus) {
        this.visketulemus = visketulemus;
    }

    public int getPuktideSumma() {
        return puktideSumma;
    }

    public void setPuktideSumma(int puktideSumma) {
        this.puktideSumma = puktideSumma;
    }

    public boolean isAlgtingimus() {
        return algtingimus;
    }

    public void setAlgtingimus(boolean algtingimus) {
        this.algtingimus = algtingimus;
    }

    @Override
    public String toString() {
        return nimi;
    }
}
