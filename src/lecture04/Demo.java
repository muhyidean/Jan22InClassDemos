package lecture04;

public class Demo {

    public static void main(String[] args) {

        Integer [] ints = new Integer[5];

        System.out.println(ints[0]);

        SingleLinkedList<String> list = new SingleLinkedList<>();

        list.add("Dean");
        list.add("Eggie");
        list.add(1,"Charles");
        list.set(1,"Charlie");
        System.out.println(list);


    }
}
