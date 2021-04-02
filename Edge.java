package org.arpit.java2blog.algo;
 
public class Edge {
 /**
	 * label for Edge
	 */
 private double weight;//private varible weight
 private Vertex startVertex;//private varible type from class Vertex startVertex
 private Vertex targetVertex;////private varible type from class Vertex targetVertex
 // constrain class Edge
 public Edge(double weight, Vertex startVertex, Vertex targetVertex) {
 this.weight = weight;
 this.startVertex = startVertex;
 this.targetVertex = targetVertex;
 }
 //get of Weight varible 
 public double getWeight() {
 return weight;
 }
 //set of Weight varible
 public void setWeight(double weight) {
 this.weight = weight;
 }
 //get of StartVertex varible
 public Vertex getStartVertex() {
 return startVertex;
 }
 //set of StartVertex varible
 public void setStartVertex(Vertex startVertex) {
 this.startVertex = startVertex;
 }
 //get of TargetVertexnvarible
 public Vertex getTargetVertex() {
 return targetVertex;
 }
  //set of TargetVertexnvarible
 public void setTargetVertex(Vertex targetVertex) {
 this.targetVertex = targetVertex;
 }
}