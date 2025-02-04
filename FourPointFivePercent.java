// Concrete implementation for states with 4.5% tax
class FourPointFivePercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.045; // 4.5% sales tax
    }
}