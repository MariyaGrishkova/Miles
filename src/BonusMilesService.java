public class BonusMilesService {
    public int calculate(int amount) {
        long ticket = 20_000L;
        float index = 0.05F;

        int miles;
        miles = (int) (ticket * index);

        return miles;
    }
}

