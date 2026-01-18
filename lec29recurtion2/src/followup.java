public class followup {
    static int numberofdigite(int n) {
        if (n >= 0 && n <= 9) return 1;

        return 1 + numberofdigite(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(numberofdigite(8252354));
    }
}