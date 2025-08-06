import java.util.*;

public class Graph {
    int nodes;
    HashMap<Character,List<Node>> adj = new HashMap<>();
    Graph(int nodes){
        this.nodes=nodes;
        for(int i = 65;i<nodes+65;i++){
            adj.put((char)i,new ArrayList<>());
        }
    }
    void insert(char src, char dest, int weight){
        adj.get(src).add(new Node(src,dest,weight));
        adj.get(dest).add(new Node(dest,src,weight));
    }
    void display(){
        for(char i : adj.keySet()){
            for(Node n : adj.get(i)){
                System.out.print(n.src+" "+n.dest+" "+n.weight+"\n");
            }
            System.out.println();
        }
    }
    void findMST(){

        boolean[] vis = new boolean[nodes];
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a->a.weight));
        pq.offer(new Node('-','A',0));
        int totalWeight = 0;
        while(!pq.isEmpty()){
            Node temp = pq.poll();

                if(!vis[temp.dest-'A']){
                    vis[temp.dest-'A'] = true;
                    totalWeight+= temp.weight;
//                    System.out.println("")
//                    System.out.println(Arrays.toString(vis));
                    for(Node i : adj.get(temp.dest)){
                        if(!vis[i.dest-'A']){
                            pq.add(i);
                        }
                    }

                }

        }
        System.out.println(totalWeight);
//
//        queue.sort(Comparator.comparing(a->a.weight));
//        int totalWeight = 0;
//        Queue<Node> q = new LinkedList<>();
//        while(!q.isEmpty()){
//            Node cur = q.poll();
//            if(cur.src== '-'){
//                System.out.println("Src = "+cur.dest);
//                continue;
//            }
//            else{
//                if(!vis[cur.src-'A']){
//                    vis[cur.src-'A'] = true;
//                    for(Node i:queue){
//                        if(i.src == cur.dest && !vis[i.dest-'A']){
//                            vis[i.dest-'A'] = true;
//                            q.add(i);
//                            totalWeight+=i.weight;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(totalWeight);
    }
}
