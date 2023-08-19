// Linked list using JCF(THE GAME CHANGER)

import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.addFirst(2);
        list.addLast(9);
        list.add(5);
        list.add(20);
        System.out.println(list);
        list.remove(); //remove first
        list.removeLast();
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.peek());

    }
}