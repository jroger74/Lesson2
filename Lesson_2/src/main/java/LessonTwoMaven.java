public class LessonTwoMaven {
        public static void main(String[] args) {
            int firstNum;
            int secondNum;
            int oneNum;
            int a;
            int b;
            String nameName;



                printRangeSum (firstNum = 8,secondNum = 11);
                printPositiveOrNegative (oneNum = 2);
                retrievePositiveOrNegative(a = -1);
                printName(b = 5, nameName = "Tirion");


        }
    public static boolean printRangeSum(int firstNum, int secondNum) {


        return firstNum + secondNum >= 10 && firstNum + secondNum <= 20;
    }
    public static void printPositiveOrNegative(int oneNum) {

        if (oneNum >= 0) {
            System.out.println("Positive");
    } else {
        System.out.println("Negative");
        }
    }
    public static boolean retrievePositiveOrNegative(int a) {

                return a < 0;
        }
    public static void printName(int b, String nameName) {
            for (int i = 0; i < b; i++) {
                System.out.println(nameName);
        }
    }


}
