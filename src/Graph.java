import java.util.LinkedList;
import java.util.List;

public class Graph {

    int vertex;
    LinkedList<Integer> list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];

        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge (int source, int destination) {
        list[source].addFirst(destination);
        //list[destination].addFirst(source);
    }

    public void printGraph () {
        for (int i = 0; i < vertex; i++) {
            if(list[i].size() > 0) {
                System.out.println(i);
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println(list[i].get(j) + " ");
                }
            }
            System.out.println();
        }
    }

}
