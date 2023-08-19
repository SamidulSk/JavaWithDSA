// create a Trie
public class Trie1{
    static class Node{
        Node children[]=new Node[26];
        boolean endOfWord=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    // insert
    public static void insert(String word){  //O(L)-> where L is length of largest word
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int index=word.charAt(level)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            curr=curr.children[index];
        }
        curr.endOfWord=true;
    }
    // search
    public static boolean search(String key){  //O(L)-> where L is length of largest word
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int index=key.charAt(level)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
       return curr.endOfWord=true;
    }
    public static void main(String args[]){
     String word[]={"the","a","there","their","any","thee"};
     for(int i=0;i<word.length;i++){
        insert(word[i]);
     }
     System.out.println(search("thee"));
     System.out.println(search("thor"));
    }
}