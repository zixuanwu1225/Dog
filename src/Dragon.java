public class Dragon {
    private int health = 100;
    private int strength = 1;
    private int level = 1;
    private int deathPrevention;
    private int storedDamage;
    public Dragon(){
    }
    public String takeDamage(int damage){
        health = health-damage;
        if (health>0){
            return "Your Dragons health is: "+health;
        }
        else
        {
            if (deathPrevention == 1) {
                return "Your Dragon is already Dead!";
            }
            deathPrevention++;
            return "Your Dragon is Dead.";
        }
    }
    public String attack(){
        int damage = strength*level;
        storedDamage = storedDamage+damage;
        if (storedDamage>50){
            storedDamage=storedDamage-50;
            level++;
            return "Your dragon is now level "+level;
        }
        return "Your dragon deals "+damage+" damage!";
    }
}
