package BAITAP1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("toi");
        list.add("ten");
        list.add("la");
        list.add("Ha");
        list.display();
        System.out.println(list.get(3));
        System.out.println(list.remove(3));



        list.display();


    }


}
