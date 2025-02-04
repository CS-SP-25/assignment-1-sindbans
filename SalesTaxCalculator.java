class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <State> <SaleAmount>");
            return;
        }

        String stateInput = args[0];
        double saleAmount;

        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Sale amount must be a numeric value.");
            return;
        }

        State state;
        switch (stateInput.toLowerCase()) {
            case "indiana":
                state = new Indiana();
                break;
            case "alaska":
                state = new Alaska();
                break;
			 case "hawaii":
                state = new Hawaii();
                break;
            default:
                System.out.println("Error: Unsupported state. Use 'Indiana', 'Hawaii' or 'Alaska'.");
                return;
        }
        
        state.showTax(saleAmount);
    }
}