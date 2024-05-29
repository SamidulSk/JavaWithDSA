
// insertion in heap
import java.util.*;

public class Heap1 {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);
            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2; // parent index
            while (arr.get(x) < arr.get(par)) { // O(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x=par; // for continue loop
                par=(x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) { // for fix the heap  O(logn)
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;  // root index al usual min so...

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if(minIdx !=i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public int remove() {  //O(logn)
            int data = arr.get(0);
            // step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            // step 2 - delete last
            arr.remove(arr.size() - 1);
            // step 3-> heapify
            heapify(0); // call heapify for root
            return data;

        }
        public boolean isEmpty(){
            return arr.size()==0;
        }

    }

    public static void main(String args[]) {
         Heap h= new Heap();
         h.add(6);
         h.add(7);
         h.add(12);
         h.add(10);
         h.add(15);
         h.add(17);
         while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
         }
    }
}