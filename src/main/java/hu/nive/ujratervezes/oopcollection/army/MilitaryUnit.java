package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int bleeding;
    private final int attacked;
    private final boolean isArmed;

    public MilitaryUnit(int bleeding, int attacked, boolean isArmed) {
        this.bleeding = bleeding;
        this.attacked = attacked;
        this.isArmed = isArmed;
    }

    public int doDamage() {
        return attacked;
    }

    public void sufferDamage(int cut) {
        if(isArmed) {
            this.bleeding = bleeding - cut / 2;
        } else {
            this.bleeding = bleeding - cut;
        }
    }

    public int getBleeding() {
        return bleeding;
    }
}
