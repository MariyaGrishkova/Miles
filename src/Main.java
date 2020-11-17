    public class Main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int price = 40_000;
            float index = 0.05F;
            int miles = service.calculate(price, index);
            System.out.println(miles);
    }
}
