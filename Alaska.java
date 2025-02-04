// Concrete State implementation for Alaska
class Alaska extends State {
    public Alaska() {
        this.name = "Alaska";
        this.taxBehavior = new NoTax();
    }
}
