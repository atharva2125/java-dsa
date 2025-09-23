class converttoRupees {
    public static int convertToRupees(String S) {
        // Trim any extra spaces and split the string into amount and currency
        S = S.trim();
        String[] parts = S.split(" ");
        
        // Extract amount and currency
        int amount = Integer.parseInt(parts[0]);
        char currency = parts[1].charAt(0);

        // Convert based on currency type
        switch (currency) {
            case 'Y': return amount * 10;     // Yuan
            case 'P': return amount * 100;    // Pound
            case 'D': return amount * 70;     // Dollar
            case 'R': return amount;          // Rupee
            default: 
                throw new IllegalArgumentException("Invalid currency: " + currency);
        }
    }

    // Sample test
    public static void main(String[] args) {
        System.out.println(convertToRupees("1000 R")); // 1000
        System.out.println(convertToRupees("5 Y"));    // 50
        System.out.println(convertToRupees("2 P"));    // 200
        System.out.println(convertToRupees("3 D"));    // 210
    }
}
