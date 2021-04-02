package org.arpit.java2blog.algo;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
 
public class DijkstraShortestPath {
 /**
  *  method computeShortestPaths
  * @param sourceVertex 
  */
    public void computeShortestPaths(Vertex sourceVertex) {//Accepted varible sourceVertex type from Vertex class 
        sourceVertex.setDistance(0);//call setDistance from class Vertex
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();// declaration priority queue type from class Vertex
        priorityQueue.add(sourceVertex); // add to priority queue sourceVertex
        sourceVertex.setVisited(true);// check if is viseted the Vertex
// while loop to check the priority queue is Empty
        while (!priorityQueue.isEmpty()) {
            // Getting the minimum distance vertex from priority queue
            Vertex actualVertex = priorityQueue.poll();

            for (Edge edge : actualVertex.getAdjacenciesList()) {

                Vertex v = edge.getTargetVertex();
                if (!v.isVisited()) {
                    double newDistance = actualVertex.getDistance() + edge.getWeight();

                    if (newDistance < v.getDistance()) {
                        priorityQueue.remove(v);
                        v.setDistance(newDistance);
                        v.setPredecessor(actualVertex);
                        priorityQueue.add(v);
                    }
                }
            }
            actualVertex.setVisited(true);
        }
    }
 // function to return ShortestPath from  list of Vertex
    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> path = new ArrayList<>();// ArrayList type from  class(Vertex)
        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }

}
 