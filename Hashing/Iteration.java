import java.util.*;

import org.w3c.dom.Node;
public class Iteration{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int size;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];
            for(int i=0; i <4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % size;
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key);
        }
        public boolean containsKey(K key, V value){
            return false;
        }
    }
    public static void main(String a[]){
    }
}