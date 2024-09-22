public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность " + getSuperAbilityType());
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
        System.out.println("Medic увеличил опыт лечения, теперь он лечит на " + healPoints + " единиц");
    }
}