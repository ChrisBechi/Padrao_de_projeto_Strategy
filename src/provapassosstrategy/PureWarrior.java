package provapassosstrategy;

public class PureWarrior {
    private String name;
    private int life;
    private int weapon;
    private int armor;
    
    public PureWarrior(String name, int life){
        this.life = life;
        this.name = name;
    }
    
    public String getNome(){
        return this.name;
    }
    
    public void setNome(String name){
        this.name = name;
    }
    
    public int getLife(){
        return this.life;
    } 
    
    public void setLife(int life){
        this.life = life;
    }
    
    public int getWeapon(){;
        return this.weapon;
    }
    
    public void setWeapon(int weapon){
        this.weapon = weapon;
    }
    
    public int getArmor(){
        return this.armor;
    }
    
    public void setArmor(int armor){
        this.armor = armor;
    }
}
