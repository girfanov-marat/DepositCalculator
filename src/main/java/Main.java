public class Main {
    public static void main(String[] args) {
        DepositService service = new DepositService();

        int profit = service.calculate(1_000_00);

        System.out.println(profit);
    }
}
