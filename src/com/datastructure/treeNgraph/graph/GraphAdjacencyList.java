package com.datastructure.treeNgraph.graph;

import java.util.LinkedList;

/**
 * Created by Kiran on 9/20/18.
 * <p>
 * <p>
 * i. A graph G is an ordered pair of a set V of vertices and a set E of edges. G = (V,E)
 * ii. Number of Edges:
 * 1. Directed: |V| = n then 0 <= |E| <= n (n-1)
 * 2. Undirected: O <= |E| <= n(n-1)/2
 * <p>
 * 1. Adjacency Matrix
 * 2. Adjacency List
 *
 *
 /**
 * An array of lists is used. Size of the array is equal to the number of vertices.
 * Let the array be array[]. An entry array[i] represents the list of vertices adjacent to the ith vertex.
 * This representation can also be used to represent a weighted graph.
 * The weights of edges can be represented as lists of pairs.
 *
 */
public class GraphAdjacencyList {

    // A user define class to represent a graph.
    // A graph is an array of adjacency lists.
    // Size of array will be V (number of vertices
    // in graph)
    static class Graph
    {
        int V;
        LinkedList<Integer> adjListArray[];

        // constructor
        Graph(int V)
        {
            this.V = V;

            // define the size of array as
            // number of vertices
            adjListArray = new LinkedList[V];

            // Create a new list for each vertex
            // such that adjacent nodes can be stored
            for(int i = 0; i < V ; i++){
                adjListArray[i] = new LinkedList<Integer>();
            }
        }
    }

    // Adds an edge to an undirected graph
    static void addEdge(Graph graph, int src, int dest)
    {
        // Add an edge from src to dest.
        graph.adjListArray[src].addFirst(dest);

        // Since graph is undirected, add an edge from dest
        // to src also
        graph.adjListArray[dest].addFirst(src);
    }

    // A utility function to print the adjacency list
    // representation of graph
    static void printGraph(Graph graph)
    {
        for(int v = 0; v < graph.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: graph.adjListArray[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

    // Driver program to test above functions
    public static void main(String args[])
    {
        // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // print the adjacency list representation of
        // the above graph
        printGraph(graph);
    }


}
