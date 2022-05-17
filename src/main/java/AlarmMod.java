public class AlarmMod {

    public boolean set = false;

    public boolean setA(){
        if(this.set){
            return false;
        }
        this.set = true;
        return true;
    }

    public boolean unsetA(){
        if(!this.set){
            return false;
        }
        this.set = false;
        return true;
    }

    public boolean checkA(){
        boolean tem = this.set;
        this.set = false;
        return tem;
    }

}
