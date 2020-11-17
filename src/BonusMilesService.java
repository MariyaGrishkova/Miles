public class BonusMilesService {
    public int calculate(int price, float index) {
       int miles = (int) (price * index);

        return (int) miles;
    }
}

