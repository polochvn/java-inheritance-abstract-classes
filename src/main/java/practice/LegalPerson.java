package practice;

public class LegalPerson extends Client {

    private final double commission = 0.01;

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake < amount) {
            amount -= (amountToTake + amountToTake * commission);
        }
    }
}
