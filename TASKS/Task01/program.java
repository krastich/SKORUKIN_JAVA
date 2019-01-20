class Program {
	public static void main(String[] args) {
		int sum = 15867;
		int fiveThousand = sum/5000;
		sum %= 5000;
		int twoThousand = sum/2000;
		sum %= 2000;
		int oneThousand = sum/1000;
		sum %= 1000;
		int fiveHundred = sum/500;
		sum %= 500;
		int oneHundred = sum/100;
		sum %= 100;
		int fifty = sum/50;
		sum %= 50;
		int coins = sum%50;
		System.out.println("5000 - " + fiveThousand);
		System.out.println("2000 - " + twoThousand);
		System.out.println("1000 - " + oneHundred);
		System.out.println("500 - " + fiveHundred);
		System.out.println("100 - " + oneHundred);
		System.out.println("50 - " + fifty);
		System.out.println("coins - " + coins);
	}
}