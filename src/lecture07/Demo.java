package lecture07;

import lecture04_05.SingleLinkedList;

public class Demo {

    public static void main(String[] args) {

//        StackInterface<String> stack = new SingleLinkedList<>();
        StackInterface<String> stack = new StackArray<>();


        stack.push("Dean");
        stack.push("Eggie");
        stack.push("Charles");
        stack.push("Patrick");
        stack.push("Hagos");

//        while(!stack.empty()){
//            System.out.println(stack.pop());
//        }

        System.out.println(stack.empty()); // false
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty()); // true
        System.out.println(stack.getSize());

        StackInterface<String> s = new SingleLinkedList<>();


        StackInterface<String> revWord = new StackArray<>();

        String name = "Dean";
        System.out.println(name);
        for (int i = 0; i < name.length(); i++) {
            revWord.push( String.valueOf(name.charAt(i)));
        }

        while(!revWord.empty()){
            System.out.print(revWord.pop());
        }



    }
}
