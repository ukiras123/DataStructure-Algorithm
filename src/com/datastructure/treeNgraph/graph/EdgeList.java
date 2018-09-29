package com.datastructure.treeNgraph.graph;

/**
 * Created by Kiran on 9/26/18.
 */
public class EdgeList {

    int[][] graph = {{0, 1}, {1, 2}, {1, 3}, {2, 3}};
    // Since node 3 has edges to nodes 1 and 2, {1, 3} and {2, 3} are in the edge list.
    // Sometimes it's helpful to pair our edge list with a list of all the nodes.
    // For example, what if a node doesn't have any edges connected to it? It wouldn't show up in our edge list at all!

}
