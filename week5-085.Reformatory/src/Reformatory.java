public class Reformatory {
    private int totalWeightsMeasured = 0;
    public int weight(Person person){
        // return the weight of the person
        totalWeightsMeasured++;
        return person.getWeight();

    }

    public void feed(Person person){
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }

    public int totalWeightsMeasured(){

        return totalWeightsMeasured;
    }


}
