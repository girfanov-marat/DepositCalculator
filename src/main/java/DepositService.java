public class DepositService {
    int calculate(int depositCents) {
        int rate = 3;
        int profit = depositCents * rate / 100;

        return profit;
    }
}
