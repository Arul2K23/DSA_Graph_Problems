public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.insert('A','B',2);
        g.insert('A','C',3);
        g.insert('B','C',1);
        g.insert('B','D',4);
        g.insert('D','C',5);
        g.insert('D','E',7);
        g.insert('C','E',6);
        g.display();
        g.findMST();
    }
}