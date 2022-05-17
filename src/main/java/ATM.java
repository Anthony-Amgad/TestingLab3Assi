public class ATM extends ATMRes{

    public String state = "LOGGEDOUT";

    public Boolean input(char c){
        if(this.state.equals("LOGGEDOUT")){
            if(c == 'l'){
                this.state = "LOGGEDIN";
                return true;
            }else if(c == 'u'){
                this.state = "UNLOCKED";
                return true;
            }
        }else if(this.state.equals("LOGGEDIN")){
            if(c == 'w'){
                return this.withdraw();
            }else if(c == 'd') {
                this.fill(1);
                return true;
            }else if(c == 'o') {
                this.state = "LOGGEDOUT";
                return true;
            }
        }else if(this.state.equals("UNLOCKED")){
            if(c == 'f'){
                this.fill(1);
                return true;
            }else if(c == 'l') {
                this.state = "LOGGEDOUT";
                return true;
            }
        }
        return false;
    }
}
