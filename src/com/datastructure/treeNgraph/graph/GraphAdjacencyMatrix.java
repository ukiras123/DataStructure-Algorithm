package com.datastructure.treeNgraph.graph;


import java.util.Scanner;

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
 * <p>
 * <p>
 * <p>
 * /**
 * Adjacency Matrix:
 * Adjacency Matrix is a 2D array of size V x V where V is the number of vertices in a graph.
 * Let the 2D array be adj[][], a slot adj[i][j] = 1 indicates that there is an edge from vertex i to vertex j.
 * Adjacency matrix for undirected graph is always symmetric.
 * Adjacency Matrix is also used to represent weighted graphs. If adj[i][j] = w,
 * then there is an edge from vertex i to vertex j with weight w.
 * <p>
 * Pros: Since its all based on 2d array, easy representation and takes O(1) time to check for value
 * Cons: It takes space of O(V^2). Even the graph is sparse it contains same size
 */

public class GraphAdjacencyMatrix {


    /*
      int[][] graph = {
                        {0, 1, 0, 0},
                        {1, 0, 1, 1},
                        {0, 1, 0, 1},
                        {0, 1, 1, 0},
                      };
     */
    private final int vertices;
    private int[][] adjacency_matrix;

    public GraphAdjacencyMatrix(int v) {
        vertices = v;
        adjacency_matrix = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            adjacency_matrix[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("The vertices does not exists");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return adjacency_matrix[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("The vertices does not exists");
        }
        return -1;
    }

    public static void main(String args[]) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);

        GraphAdjacencyMatrix graph;
        try {
            System.out.println("Enter the number of vertices: ");
            v = sc.nextInt();
            System.out.println("Enter the number of edges: ");
            e = sc.nextInt();

            graph = new GraphAdjacencyMatrix(v);

            System.out.println("Enter the edges: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }

            System.out.println("The adjacency matrix for the given graph is: ");
            System.out.print("  ");
            for (int i = 1; i <= v; i++)
                System.out.print(i + " ");
            System.out.println();

            for (int i = 1; i <= v; i++) {
                System.out.print(i + " ");
                for (int j = 1; j <= v; j++)
                    System.out.print(graph.getEdge(i, j) + " ");
                System.out.println();
            }

        } catch (Exception E) {
            System.out.println("Somthing went wrong");
        }

        sc.close();
    }


}
