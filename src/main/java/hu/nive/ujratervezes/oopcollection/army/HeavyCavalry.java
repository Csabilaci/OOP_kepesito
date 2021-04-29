package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean attacked;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (!attacked) {
            attacked = true;
            return super.doDamage() * 3;
        }
        return super.doDamage();
    }
}