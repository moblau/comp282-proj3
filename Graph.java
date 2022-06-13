
import java.util.*;

public class Graph{
    private LinkedList<Edge>[] adjList;
    private int size;
    private boolean[] visited;
    
    public Graph(int size){
        this.size = size;
        adjList = new LinkedList[size];
        visited = new boolean[size];
        for ( int i = 0; i < size; i ++){
            adjList[i] = new LinkedList<Edge>();
            visited[i] = false;
        }    
    }
    
    public void addEdge(Vertex a, Vertex b, int weight){
        Edge ab = new Edge(a,b,weight);
        adjList[a.getLabel()].add(ab);
        
        Edge ba = new Edge(b,a,weight);
        adjList[b.getLabel()].add(ba);
    }
    
    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print(i + ": ");
            
            System.out.println(adjList[i]);
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public void DFS(Vertex v){
        visited[v.getLabel()] = true;
        System.out.print(v.getLabel() + " ");
        Iterator<Edge> i = adjList[v.getLabel()].listIterator();
        while (i.hasNext()){            
            Vertex a = i.next().getEnd();          
            if (visited[a.getLabel()] == false){
                DFS(a);
            }
        }
    }
    
    public void BFS(Vertex v){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[v.getLabel()] = true;
        queue.add(v.getLabel());
        
        while (queue.size() != 0){
            int a = queue.poll();
            System.out.print(a + " ");
            Iterator<Edge> b = adjList[a].listIterator();
            
            while (b.hasNext()){
                int c = b.next().getEnd().getLabel();
                if (visited[c] == false){
                    visited[c] = true;
                    queue.add(c);
                }
            }
        }
    }
    
    public void resetVisited(){
        for ( int i = 0; i < size; i ++){
            visited[i] = false;
        }
    }
    
}