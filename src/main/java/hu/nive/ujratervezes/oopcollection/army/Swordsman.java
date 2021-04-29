package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean suffering;

    public Swordsman(boolean isArmored) {
        super(100, 10, isArmored);
        suffering = false;
    }

    @Override
    public void sufferDamage(int cut) {
        if (!suffering) {
            suffering = true;
            super.sufferDamage(0);
            return;
        }
        super.sufferDamage(cut);
    }
}