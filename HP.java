
package game.object;

public class HP {
    
    public double getMAX_HP(){
        return MAX_HP;
    }
    
    public void setMAX_HP(double MAX_HP){
        this.MAX_HP = MAX_HP;
    }
    
        public double getCurrent_HP(){
        return currentHp;
    }
    
    public void setCurrentHp(double currentHp){
        this.currentHp = currentHp;
    }
    
    public HP(double MAX_HP , double currentHp){
        this.MAX_HP = MAX_HP;
        this.currentHp = currentHp;
    }
    
    public HP(){
        
    }
    private double MAX_HP;
    private double currentHp;
    
}
