package practice;

public class PhysicalPerson extends Client {

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake < amount) {
            amount -= amountToTake;
        }
    }
}
