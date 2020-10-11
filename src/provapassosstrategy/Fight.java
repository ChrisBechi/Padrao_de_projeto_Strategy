
package provapassosstrategy;

import java.util.Scanner;

public class Fight {
    private StrategyFight sf;
    private PureWarrior fighter1;
    private PureWarrior fighter2;
    
    public Fight(PureWarrior fighter, PureWarrior fighter2){
        this.fighter1 = fighter;
        this.fighter2 = fighter2;
    }
    
    public void defineStrategyFighter(StrategyFight weapon, StrategyFight armor){
        this.fighter1.setWeapon(weapon.dano());
        this.fighter1.setArmor(armor.dano());
    }
    
    public void defineStrategyFighter2(StrategyFight weapon, StrategyFight armor){
        this.fighter2.setWeapon(weapon.dano());
        this.fighter2.setArmor(armor.dano());
    }
    
    public void refreshLife(){
        for(int i=0;i<20;i++)System.out.println("");
        System.out.println("==========================================================");
        System.out.println("        "+this.fighter1.getNome()+" x "+this.fighter2.getNome());
        System.out.println("==========================================================\n");

        System.out.print("Lutador 1: "+this.fighter1.getLife()+" ");
            for(int i=0 ; i<fighter1.getLife() ; i++){
                System.out.print("|");
            }
        System.out.print("   -   Lutador 2: "+this.fighter2.getLife()+" ");
            for(int i=0 ; i<fighter2.getLife() ; i++){
                System.out.print("|");
        }
    }
    
    public void fighting(){  
        while(fighter1.getLife() > 0 && fighter2.getLife() > 0){
            if(fighter1.getLife() > 0)
                this.fighter2.setLife(this.fighter2.getLife() + (this.fighter1.getWeapon()+this.fighter2.getArmor()));
            
            if(fighter2.getLife() > 0)
                this.fighter1.setLife(this.fighter1.getLife() + (this.fighter2.getWeapon()+this.fighter1.getArmor()));
            refreshLife();
            
        }
        System.out.println("\n\n====================================================");
        if(fighter1.getLife() > 0){
            System.out.println("O vencedor da batalha é: "+this.fighter1.getNome());
        }else{
            System.out.println("O vencedor da batalha é: "+this.fighter2.getNome());
        }
        System.out.println("====================================================");

        
        
    }
}
