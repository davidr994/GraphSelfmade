public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(0, 3);
        graph.addEdge(0,4);
        graph.addEdge(3,5);

        graph.printGraph();




    }
}
