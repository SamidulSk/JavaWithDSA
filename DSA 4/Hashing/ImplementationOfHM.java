// this is a copied code but important practice it logic is easy , on notebook
import java.util.*;

public class ImplementationOfHM {
    static class HashMap<K, V> {

        private class Node {
            String key;
            String value;
            Node next;

            public Node(String key, String value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

        private int size;
        private LinkedList<Node>[] map;

        public HashMap(int size) {
            this.size = size;
            this.map = new LinkedList[size];
            for (int i = 0; i < size; i++) {
                map[i] = new LinkedList<>();
            }
        }

        private int hashFunction(String key) {
            return Math.abs(key.hashCode() % size);
        }

        public void put(String key, String value) {
            int index = hashFunction(key);
            LinkedList<Node> list = map[index];
            for (Node node : list) {
                if (node.key.equals(key)) {
                    // Key already exists, update the value
                    node.value = value;
                    return;
                }
            }
            // Key not found, add a new node
            list.add(new Node(key, value));
        }

        public String get(String key) {
            int index = hashFunction(key);
            LinkedList<Node> list = map[index];
            for (Node node : list) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
            // Key not found
            return null;
        }

        public void remove(String key) {
            int index = hashFunction(key);
            LinkedList<Node> list = map[index];
            list.removeIf(node -> node.key.equals(key));
        }

        public boolean isEmpty() {
            for (LinkedList<Node> list : map) {
                if (!list.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        public int size() {
            int count = 0;
            for (LinkedList<Node> list : map) {
                count += list.size();
            }
            return count;
        }

        public boolean containsKey(String key) {
            int index = hashFunction(key);
            LinkedList<Node> list = map[index];
            for (Node node : list) {
                if (node.key.equals(key)) {
                    return true;
                }
            }
            return false;

        }

        public static void main(String[] args) {
            HashMap<String, String> hashMap = new HashMap<>(10);
            hashMap.put("key1", "value1");
            hashMap.put("key2", "value2");
            hashMap.put("key3", "value3");

            System.out.println(hashMap.get("key1")); // Output: value1
            System.out.println(hashMap.get("key2")); // Output: value2

            hashMap.remove("key2");
            System.out.println(hashMap.get("key2")); // Output: null

            System.out.println("Is empty: " + hashMap.isEmpty()); // Output: false
            System.out.println("Size: " + hashMap.size()); // Output: 2
            System.out.println("Contains key 'key1': " + hashMap.containsKey("key1")); // Output: true
            System.out.println("Contains key 'key2': " + hashMap.containsKey("key2")); // Output: false
        }
    }
}