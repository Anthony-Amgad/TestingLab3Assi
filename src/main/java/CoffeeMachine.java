public class CoffeeMachine extends CoffeeRes{

    public String state = "VENDING";

    public Boolean input(char c){
        if(this.state.equals("VENDING")){
            if(c == 'c'){ //coffee
                return (this.useWater() && this.useBeans());
            }else if(c == 'l'){ //latte
                return (this.useWater() && this.useBeans() && this.useMilk());
            }else if(c == 'm'){ //mocha
                return (this.useMilk() && this.useBeans() && this.useChoco());
            }
            else if(c == 'r'){
                this.state = "REFILL";
                return true;
            }
        }else if(this.state.equals("REFILL")){
            if(c == 'b'){ //beans
               this.refillBeans(1);
               return true;
            }else if(c == 'w'){ //water
                this.refillWater(1);
                return true;
            }else if(c == 'm'){ //milk
                this.refillMilk(1);
                return true;
            }else if(c == 'c'){ //choco
                this.refillChoco(1);
                return true;
            }
            else if(c == 'v'){
                this.state = "VENDING";
                return true;
            }
        }
    return false;
    }
}
