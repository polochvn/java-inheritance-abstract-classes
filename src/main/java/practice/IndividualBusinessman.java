package practice;

public class IndividualBusinessman extends Client {

    private final double commissionOnePercent = 0.01;
    private final double commissionHalfOnePercent = 0.005;

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0 && amountToPut < 1000) {
            amount += (amountToPut - amountToPut * commissionOnePercent);
        } else if (amountToPut >= 1000) {
            amount += (amountToPut - amountToPut * commissionHalfOnePercent);
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake < amount) {
            amount -= amountToTake;
        }
    }
}
