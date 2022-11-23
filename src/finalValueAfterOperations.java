public class finalValueAfterOperations {

    public static void main(String[] args){
        String[] test = {"++X","++X","X++"};
        System.out.print(method(test));
    }
    public static int method(String[] operations){
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("--X") || operations[i].equals("X--") ){
                x--;
                continue;
            } else if(operations[i].equals("++X") || operations[i].equals("X++") ){
                x++;
            }
        }
        return x;
    }
}
