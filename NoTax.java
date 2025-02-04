// Concrete implementation for states with no tax
class NoTax implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return 0.0; // No sales tax
    }
}
