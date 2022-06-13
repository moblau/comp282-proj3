import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many vertices would you like the graph to be? ");
        int size = sc.nextInt();
        
        Graph graph1 = new Graph(size);
        System.out.println("How many edges would you like to add?");
        int numEdges = sc.nextInt();
        
        for ( int i = 0; i < numEdges; i ++){
            System.out.println("Enter the starting vertex, ending vertex, and weight: ");
            Vertex start = new Vertex(sc.nextInt());
            Vertex end = new Vertex (sc.nextInt());
            graph1.addEdge(start,end,sc.nextInt());            
        }     
        graph1.print();
        
        System.out.println("Which vertex would you like to start with BFS?");
        Vertex a = new Vertex(sc.nextInt());
        graph1.BFS(a);
        System.out.println();
        graph1.resetVisited();
        
        System.out.println("Which vertex would you like to start with DFS?");
        Vertex b = new Vertex(sc.nextInt());
        graph1.DFS(b);
        System.out.println();
        
        System.out.print("How many vertices would you like the graph to be? ");
        size = sc.nextInt();
        
        Graph graph2 = new Graph(size);
        System.out.println("How many edges would you like to add?");
        numEdges = sc.nextInt();
        
        for ( int i = 0; i < numEdges; i ++){
            System.out.println("Enter the starting vertex, ending vertex, and weight: ");
            Vertex start = new Vertex(sc.nextInt());
            Vertex end = new Vertex (sc.nextInt());
            graph2.addEdge(start,end,sc.nextInt());            
        }     
        graph2.print();
        
        System.out.println("Which vertex would you like to start with BFS?");
        Vertex c = new Vertex(sc.nextInt());
        graph2.BFS(c);
        System.out.println();
        graph2.resetVisited();
        
        System.out.println("Which vertex would you like to start with DFS?");
        Vertex d = new Vertex(sc.nextInt());
        graph2.DFS(d);
        System.out.println();
        
        System.out.print("How many vertices would you like the graph to be? ");
        size = sc.nextInt();
        
        Graph graph3 = new Graph(size);
        System.out.println("How many edges would you like to add?");
        numEdges = sc.nextInt();
        
        for ( int i = 0; i < numEdges; i ++){
            System.out.println("Enter the starting vertex, ending vertex, and weight: ");
            Vertex start = new Vertex(sc.nextInt());
            Vertex end = new Vertex (sc.nextInt());
            graph3.addEdge(start,end,sc.nextInt());            
        }     
        graph3.print();
        
        System.out.println("Which vertex would you like to start with BFS?");
        Vertex e = new Vertex(sc.nextInt());
        graph3.BFS(e);
        System.out.println();
        graph3.resetVisited();
        
        System.out.println("Which vertex would you like to start with DFS?");
        Vertex f = new Vertex(sc.nextInt());
        graph3.DFS(f);
        System.out.println();
            
        System.out.print("How many vertices would you like the graph to be? ");
        size = sc.nextInt();
        
        Graph graph4 = new Graph(size);
        System.out.println("How many edges would you like to add?");
        numEdges = sc.nextInt();
        
        for ( int i = 0; i < numEdges; i ++){
            System.out.println("Enter the starting vertex, ending vertex, and weight: ");
            Vertex start = new Vertex(sc.nextInt());
            Vertex end = new Vertex (sc.nextInt());
            graph4.addEdge(start,end,sc.nextInt());            
        }     
        graph4.print();
        
        System.out.println("Which vertex would you like to start with BFS?");
        Vertex g = new Vertex(sc.nextInt());
        graph4.BFS(g);
        System.out.println();
        graph4.resetVisited();
        
        System.out.println("Which vertex would you like to start with DFS?");
        Vertex h = new Vertex(sc.nextInt());
        graph4.DFS(h);
        System.out.println();
        
        System.out.print("How many vertices would you like the graph to be? ");
        size = sc.nextInt();
        
        Graph graph5 = new Graph(size);
        System.out.println("How many edges would you like to add?");
        numEdges = sc.nextInt();
        
        for ( int i = 0; i < numEdges; i ++){
            System.out.println("Enter the starting vertex, ending vertex, and weight: ");
            Vertex start = new Vertex(sc.nextInt());
            Vertex end = new Vertex (sc.nextInt());
            graph5.addEdge(start,end,sc.nextInt());            
        }     
        graph5.print();
        
        System.out.println("Which vertex would you like to start with BFS?");
        Vertex i = new Vertex(sc.nextInt());
        graph5.BFS(i);
        System.out.println();
        graph5.resetVisited();
        
        System.out.println("Which vertex would you like to start with DFS?");
        Vertex j = new Vertex(sc.nextInt());
        graph5.DFS(j);
        System.out.println();
        
        
        
        
        
        
        
        
    }
}