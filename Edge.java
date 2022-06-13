public class Edge{
    private int weight;
    private Vertex start,end;
    
    public Edge( Vertex start, Vertex end, int weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
    
    public Vertex getEnd(){
        return end;
    }
    
    public Vertex getStart(){
        return start;
    }
}