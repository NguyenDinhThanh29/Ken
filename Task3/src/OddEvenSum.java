public class OddEvenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound=1000;
        int sumOdd=0;
        int sumEven=0;
        int number = lowerbound;
        while (number<=upperbound){
            if (number%2==0){
                sumEven += number;
            }else {
                sumOdd+=number;
            }
            ++number;
        }
        System.out.println("The sum of odd numbers from "+ lowerbound + " to " + upperbound);
        System.out.println("The sum of even number from "+ lowerbound + " to " + upperbound);
        System.out.println("The difference between the two sums is " + (sumOdd - sumEven));
    }
}
