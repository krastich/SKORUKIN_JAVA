public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int position = 1;
        int multPosition = 1;
        int sum;
        boolean isPrime;
        int divider;
        while (value != -1) {
            sum = 0;
            divider = 2;
            while (value != 0) {
                sum = sum+value % 10;
                value /= 10;
            }
            if (sum == 1 ){
                isPrime = false;
            }
            else{
                isPrime = true;
                if (sum != 2) {
                    while (divider * divider <= sum) {
                        if (sum % divider == 0) {
                            isPrime = false;
                            break;
                        }
                        divider++;
                    }
                }
            }
            if (isPrime) {
                multPosition *= position;
            }
            value = scanner.nextInt();
            position++;
        }
        System.out.println("Answer:" + multPosition);
    }
}