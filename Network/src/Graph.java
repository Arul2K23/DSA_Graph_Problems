import java.util.*;

public class Graph {
    HashMap<Character, List<Character>> adj = new HashMap<>();
    int nodes;
    Graph(int size){
        this.nodes = size;
    }
    void insert(Character src,Character dest){
        adj.putIfAbsent((char)src,new ArrayList<>());
        adj.putIfAbsent((char)dest,new ArrayList<>());
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }
    void BFS(){
        Queue<Character> q = new LinkedList<>();
        System.out.println("Enter the Source Node: ");
        q.add(new Scanner(System.in).next().charAt(0));
        boolean[] vis = new boolean[26];
        while(!q.isEmpty()){
            Character node = q.poll();
            System.out.print(node+" ");
            vis[node-'A'] = true;
            for(char c : adj.get(node)){
                if(!vis[c-'A']){
                    q.add(c);
                }
            }
        }
    }
}
