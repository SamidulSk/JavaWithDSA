import java.util.ArrayList;

// Stuck data structure using arrayList
public class Stuck1 {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>(); // create a arraylist
        // perform all operation of stuck using arralist
        // 1st isempty?
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // 2nd push
        public void push(int data) {
            list.add(data);
        }

        // 3rd pop
      public static int pop()
        {
            if (isEmpty()) {
                return -1;
            }
            else{
                int top=list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    

    }

    public static void main(String args[]) {
    Stack s=new Stack();
    s.push(4);
    s.push(9);
    s.push(2);
    
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
        
    }
    }
}