
package provapassosstrategy;


public class TestPassosStrategy {

    public static void main(String[] args) {
        PureWarrior g = new PureWarrior("cavalo alado",50);
        PureWarrior g2 = new PureWarrior("unicornio alado",50);
        
        Fight f = new Fight(g,g2);
        f.defineStrategyFighter(new Axe(), new Titanio());
        f.defineStrategyFighter2(new Katana(), new Couro());
        f.fighting();
    }
    
}
