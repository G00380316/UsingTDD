package ie.atu.week5;

public class Counter {
    private int countValue;

        public Counter() {
            countValue = 0;
        }
        public Counter(int startingValue) {
            if (startingValue > 5){
                countValue = startingValue;
                throw new IllegalArgumentException("This number is valid");
            }
            else{
                throw new IllegalArgumentException("This number is not valid");
            }
        }

        public int increment() {
            countValue++;
            return countValue;
        }
}
