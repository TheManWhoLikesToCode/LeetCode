import java.util.ArrayList;

public class defangIPaddr {

    public static void main(String[] args) {
        String a = defangIPaddr("1.1.1.1");
        System.out.println(a);
    }

    public static String defangIPaddr(String address){

        ArrayList<Character> addressLinkedList = new ArrayList<>();
        String alot = "";

        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                addressLinkedList.add('[');
                addressLinkedList.add('.');
                addressLinkedList.add(']');
            }else{
                addressLinkedList.add(address.charAt(i));
            }
        }

        for(int i = 0; i < addressLinkedList.size(); i++){
            alot += addressLinkedList.get(i);
        }

        return alot;
    }

}
