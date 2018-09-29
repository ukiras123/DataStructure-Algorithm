package com.datastructure.treeNgraph.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Kiran on 9/26/18.
 */
public class AdjacencyListArray {


    int[][] graph = {
            {1},
            {0, 2, 3},
            {1, 3},
            {1, 2}
    };
    // We could also use a hash map where the keys represent the node and the values are the lists of neighbors.
    HashMap<Integer, List<Integer>> tree = new HashMap<Integer, List<Integer>>() {
        {
            put(0, Arrays.asList(1));
            put(1, Arrays.asList(0, 2, 3));
            put(2, Arrays.asList(1, 3));
            put(3, Arrays.asList(1, 2));
        }
    };
    //This would be useful if the nodes were represented by strings, objects, or otherwise didn't map cleanly to array indices.
}
