// Concrete State implementation for Hawaii
class Hawaii extends State {
    public Hawaii() {
        this.name = "Hawaii";
        this.taxBehavior = new FourPointFivePercent();
    }
}