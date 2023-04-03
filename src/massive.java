public class massive {
    public static void main(String[] args) {
        double[] testArray = new double[] {51.9, 26, 18, 3, 0};

        for (double arrayElement : testArray) {
            if (arrayElement % 3 == 0) {
                System.out.println(arrayElement);
            }
        }
    }
}
