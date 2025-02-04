// Concrete implementation for states with 7% tax
class SevenPercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.07; // 7% sales tax
    }
}
