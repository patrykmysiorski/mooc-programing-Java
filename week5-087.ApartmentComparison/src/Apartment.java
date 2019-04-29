
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int priceDifference;
    private int priceThis;
    private int priceOther;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        priceDifference = this.squareMeters * this.pricePerSquareMeter - otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if(priceDifference > 0){
            return priceDifference;
        }
        else{
            return priceDifference * -1;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        priceThis = this.squareMeters * this.pricePerSquareMeter;
        priceOther = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if(priceThis > priceOther){
            return true;
        }
        return false;
    }
    
}
