public class adder {

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(add(1,2));
    }


    public static double add(double... numbers) {
        double result = 0;
        for (double number : numbers) {
          result += number;
        }
        return result;
      }
    
}
