package org.arpit.java2blog.algo;
 
import java.util.ArrayList;
import java.util.List;
 //Create a class named Vertex 
public class Vertex implements Comparable<Vertex> {
 /**
	 * label for Vertex
	 */
 private String name;// privet varible 
 private List<Edge> adjacenciesList;// ArrayList type from  class(Edge)
 private boolean visited;//privet boolean varible 
 private Vertex predecessor;// previous vertex
 /**
	 * length of shortest path from source
	 */
 private double distance = Double.MAX_VALUE;
// constrain class Vertex
 public Vertex(String name) {
 this.name = name;
 this.adjacenciesList = new ArrayList<>();
 }
 /**
  * function addNeighbour 
  * to add the Edges in adjacenciesList
  * @param edge 
  */
 public void addNeighbour(Edge edge) {
 this.adjacenciesList.add(edge);
 }
 // get for varible name 
 public String getName() {
 return name;
 }
 // set for varible name
 public void setName(String name) {
 this.name = name;
 }
 // get for AdjacenciesList ArrayList type from  class(Edge)
 public List<Edge> getAdjacenciesList() {
 return adjacenciesList;
 }
 // set for AdjacenciesList ArrayList type from  class(Edge)
 public void setAdjacenciesList(List<Edge> adjacenciesList) {
 this.adjacenciesList = adjacenciesList;
 }
 // return true if visited Vertex 
 public boolean isVisited() {
 return visited;
 }
 // set for varible Visited
 public void setVisited(boolean visited) {
 this.visited = visited;
 }
  // get for varible predecessor 
 public Vertex getPredecessor() {
 return predecessor;
 }
 // set for varible predecessor
 public void setPredecessor(Vertex predecessor) {
 this.predecessor = predecessor;
 }
 // get for varible Distance
 public double getDistance() {
 return distance;
 }
 // set for varible Distance
 public void setDistance(double distance) {
 this.distance = distance;
 }
 
 @Override
 public String toString() {
 return this.name;
 }
    /**
     * Compare object to be able to sort 
     *distance
     */
 @Override
 public int compareTo(Vertex otherVertex) {
 return Double.compare(this.distance, otherVertex.getDistance());
 }
}