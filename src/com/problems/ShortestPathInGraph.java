package com.problems;

import java.util.*;

/**
 * Created by Kiran on 9/26/18.
 * <p>
 * Given information about active users on the network, find the shortest route for a message from one user (the sender)
 * to another (the recipient). Return an array of users that make up this route.
 * <p>
 * Map<String, String[]> network = new HashMap<String, String[]>() {{
 * put("Min",     new String[] { "William", "Jayden", "Omar" });
 * put("William", new String[] { "Min", "Noam" });
 * put("Jayden",  new String[] { "Min", "Amelia", "Ren", "Noam" });
 * put("Ren",     new String[] { "Jayden", "Omar" });
 * put("Amelia",  new String[] { "Jayden", "Adam", "Miguel" });
 * put("Adam",    new String[] { "Amelia", "Miguel", "Sofia", "Lucas" });
 * put("Miguel",  new String[] { "Amelia", "Adam", "Liam", "Nathan" });
 * put("Noam",    new String[] { "Nathan", "Jayden", "William" });
 * put("Omar",    new String[] { "Ren", "Min", "Scott" });
 * ...
 * }};
 * <p>
 * <p>
 * For the network above, a message from Jayden to Adam should have this route:
 * { "Jayden", "Amelia", "Adam" }
 */
public class ShortestPathInGraph {

    private static String[] reconstructPath(Map<String, String> previousNodes,
                                            String startNode, String endNode) {

        List<String> reversedShortestPath = new ArrayList<>();

        // start from the end of the path and work backwards
        String currentNode = endNode;

        while (currentNode != null) {
            reversedShortestPath.add(currentNode);
            currentNode = previousNodes.get(currentNode);
        }

        // reverse our path to get the right order
        // by flipping it around, in place
        Collections.reverse(reversedShortestPath);
        return reversedShortestPath.toArray(new String[reversedShortestPath.size()]);
    }

    public static String[] bfsGetPath(Map<String, String[]> graph, String startNode, String endNode) {

        if (!graph.containsKey(startNode)) {
            throw new IllegalArgumentException("Start node not in graph");
        }
        if (!graph.containsKey(endNode)) {
            throw new IllegalArgumentException("End node not in graph");
        }

        Queue<String> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(startNode);

        // keep track of how we got to each node
        // we'll use this to reconstruct the shortest path at the end
        // we'll ALSO use this to keep track of which nodes we've
        // already visited
        Map<String, String> howWeReachedNodes = new HashMap<>();
        howWeReachedNodes.put(startNode, null);

        while (!nodesToVisit.isEmpty()) {
            String currentNode = nodesToVisit.remove();

            // stop when we reach the end node
            if (currentNode.equals(endNode)) {
                return reconstructPath(howWeReachedNodes, startNode, endNode);
            }

            for (String neighbor : graph.get(currentNode)) {
                if (!howWeReachedNodes.containsKey(neighbor)) {
                    nodesToVisit.add(neighbor);
                    howWeReachedNodes.put(neighbor, currentNode);
                }
            }
        }

        // if we get here, then we never found the end node
        // so there's NO path from startNode to endNode
        return null;
    }
}
