// Concrete State implementation for Indiana
class Indiana extends State {
    public Indiana() {
        this.name = "Indiana";
        this.taxBehavior = new SevenPercent();
    }
}