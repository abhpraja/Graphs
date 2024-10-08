import java.util.*;

class Main {
    
    //Decalre all the components of the Graph
    static void Edge {
        int src; //source
        int dest; //destinaton
        
        public Edge(int s, int d){
            this.src = s; 
            this.dest = d;
        }
    }
    
    //Creating a graph
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i < graph.length; i++) //For loop for each vertex of graph
        {
            graph[i] = new ArrayList<Edge>(); //Adding a Arraylist to each vertex
        }
        
        //Adding graph Edges (src, dest)
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    
    
    public static void main(String[] args){
        int v = 4;
        
        ArrayList<Edge> graph[] = new ArrayList[v]
        createGraph[];
        
        for(int i=0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
    }
}
