package models.utility;

public class Item {
    private Integer dexterity;
    private Integer energy;
    private Integer strength;
    private Integer intellect;
    private Integer health;

    public Item(Integer dexterity, Integer energy, Integer strength, Integer intellect, Integer health) {
        this.dexterity = dexterity;
        this.energy = energy;
        this.strength = strength;
        this.intellect = intellect;
        this.health = health;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
