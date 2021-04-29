package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private final List<MilitaryUnit> army;

    public Army() {
        this.army = new ArrayList<>();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {}

    public int getArmyDamage() {
        return 1;
    }

    public int getArmySize() {
        return army.size();
    }

}