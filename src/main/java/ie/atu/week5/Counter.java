package ie.atu.week5;

public class Counter {
    private int countValue;

        public Counter() {
            countValue = 0;
        }
        public int increment() {
            countValue++;
            return countValue;
        }
}
