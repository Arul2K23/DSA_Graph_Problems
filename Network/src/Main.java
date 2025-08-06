import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Nodes and Edges: ");
        int nodes = sc.nextInt(), edges = sc.nextInt();
        Graph g = new Graph(nodes);
        for(int i = 0;i<edges;i++) {
            System.out.print("Enter source and destination nodes of the edge: ");
            g.insert(sc.next().charAt(0), sc.next().charAt(0));
            System.out.println();
        }
        g.BFS();
    }
}