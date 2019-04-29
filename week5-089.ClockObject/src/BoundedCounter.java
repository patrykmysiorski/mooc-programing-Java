public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        value = 0;
        this.upperLimit = upperLimit;
    }

    public void next(){
        if(value < upperLimit){
            value++;
        }
        else{
            value = 0;
        }
    }

    public String toString(){
        if(value >= 10){
            return "" + value;
        }
        else{
            return "0" + value;
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int limit){
        if(limit >= 0 && limit <= upperLimit){
            value = limit;
        }
    }
}
