package org.arpit.java2blog.algo;
 
public class DijkstraMain {
 
 public static void main(String[] args) {
 // declaration the vertex
 Vertex vertexJeddah = new Vertex("Jeddah");//vertex Jeddah
 Vertex vertexMakkah = new Vertex("Makkah");//vertex Makkah
 Vertex vertexMadinah = new Vertex("Madinah");//vertex Madinah
 Vertex vertexRiyadh = new Vertex("Riyadh");//vertex Riyadh
 Vertex vertexDammam = new Vertex("Dammam");//vertex Dammam
 Vertex vertexTaif = new Vertex("Taif");//vertex Taif
 Vertex vertexAbha = new Vertex("Abha");//vertex Abha
 Vertex vertexTabuk = new Vertex("Tabuk");//vertex Tabuk
 Vertex vertexQasim = new Vertex("Qasim");//vertex Qasim
 Vertex vertexHail = new Vertex("Hail");//vertex Hail
 Vertex vertexJizan = new Vertex("Jizan");//vertex Jizan
 Vertex vertexNajran = new Vertex("Najran");//vertex Najran
 
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Jeddah
 vertexJeddah.addNeighbour(new Edge(79,vertexJeddah,vertexMakkah));//2
 vertexJeddah.addNeighbour(new Edge(420,vertexJeddah,vertexMadinah));//3
 vertexJeddah.addNeighbour(new Edge(949,vertexJeddah,vertexRiyadh));//4
 vertexJeddah.addNeighbour(new Edge(1343,vertexJeddah,vertexDammam));//5
 vertexJeddah.addNeighbour(new Edge(167,vertexJeddah,vertexTaif));//6
 vertexJeddah.addNeighbour(new Edge(625,vertexJeddah,vertexAbha));//7
 vertexJeddah.addNeighbour(new Edge(1024,vertexJeddah,vertexTabuk));//8
 vertexJeddah.addNeighbour(new Edge(863,vertexJeddah,vertexQasim));//9
 vertexJeddah.addNeighbour(new Edge(777,vertexJeddah,vertexHail));//10
 vertexJeddah.addNeighbour(new Edge(710,vertexJeddah,vertexJizan));//11
 vertexJeddah.addNeighbour(new Edge(905,vertexJeddah,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Makkah
 vertexMakkah.addNeighbour(new Edge(358,vertexMakkah,vertexMadinah));//3
 vertexMakkah.addNeighbour(new Edge(870,vertexMakkah,vertexRiyadh));//4
 vertexMakkah.addNeighbour(new Edge(1265,vertexMakkah,vertexDammam));//5
 vertexMakkah.addNeighbour(new Edge(88,vertexMakkah,vertexTaif));//6
 vertexMakkah.addNeighbour(new Edge(627,vertexMakkah,vertexAbha));//7
 vertexMakkah.addNeighbour(new Edge(1037,vertexMakkah,vertexTabuk));//8
 vertexMakkah.addNeighbour(new Edge(876,vertexMakkah,vertexQasim));//9
 vertexMakkah.addNeighbour(new Edge(790,vertexMakkah,vertexHail));//10
 vertexMakkah.addNeighbour(new Edge(685,vertexMakkah,vertexJizan));//11
 vertexMakkah.addNeighbour(new Edge(912,vertexMakkah,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Madinah
 vertexMadinah.addNeighbour(new Edge(848,vertexMadinah,vertexRiyadh));//4
 vertexMadinah.addNeighbour(new Edge(1343,vertexMadinah,vertexDammam));//5
 vertexMadinah.addNeighbour(new Edge(446,vertexMadinah,vertexTaif));//6
 vertexMadinah.addNeighbour(new Edge(985,vertexMadinah,vertexAbha));//7
 vertexMadinah.addNeighbour(new Edge(679,vertexMadinah,vertexTabuk));//8
 vertexMadinah.addNeighbour(new Edge(518,vertexMadinah,vertexQasim));//9
 vertexMadinah.addNeighbour(new Edge(432,vertexMadinah,vertexHail));//10
 vertexMadinah.addNeighbour(new Edge(1043,vertexMadinah,vertexJizan));//11
 vertexMadinah.addNeighbour(new Edge(1270,vertexMadinah,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Riyadh
 vertexRiyadh.addNeighbour(new Edge(395,vertexRiyadh,vertexDammam));//5
 vertexRiyadh.addNeighbour(new Edge(782,vertexRiyadh,vertexTaif));//6
 vertexRiyadh.addNeighbour(new Edge(1064,vertexRiyadh,vertexAbha));//7
 vertexRiyadh.addNeighbour(new Edge(1304,vertexRiyadh,vertexTabuk));//8
 vertexRiyadh.addNeighbour(new Edge(330,vertexRiyadh,vertexQasim));//9
 vertexRiyadh.addNeighbour(new Edge(640,vertexRiyadh,vertexHail));//10
 vertexRiyadh.addNeighbour(new Edge(1272,vertexRiyadh,vertexJizan));//11
 vertexRiyadh.addNeighbour(new Edge(950,vertexRiyadh,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Dammam
 vertexDammam.addNeighbour(new Edge(1177,vertexDammam,vertexTaif));//6
 vertexDammam.addNeighbour(new Edge(1495,vertexDammam,vertexAbha));//7
 vertexDammam.addNeighbour(new Edge(1729,vertexDammam,vertexTabuk));//8
 vertexDammam.addNeighbour(new Edge(725,vertexDammam,vertexQasim));//9
 vertexDammam.addNeighbour(new Edge(1035,vertexDammam,vertexHail));//10
 vertexDammam.addNeighbour(new Edge(1667,vertexDammam,vertexJizan));//11
 vertexDammam.addNeighbour(new Edge(1345,vertexDammam,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Taif
 vertexTaif.addNeighbour(new Edge(561,vertexTaif,vertexAbha));//7
 vertexTaif.addNeighbour(new Edge(1204,vertexTaif,vertexTabuk));//8
 vertexTaif.addNeighbour(new Edge(936,vertexTaif,vertexQasim));//9
 vertexTaif.addNeighbour(new Edge(957,vertexTaif,vertexHail));//10
 vertexTaif.addNeighbour(new Edge(763,vertexTaif,vertexJizan));//11
 vertexTaif.addNeighbour(new Edge(864,vertexTaif,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Abha
 vertexAbha.addNeighbour(new Edge(1649,vertexAbha,vertexTabuk));//8
 vertexAbha.addNeighbour(new Edge(1488,vertexAbha,vertexQasim));//9
 vertexAbha.addNeighbour(new Edge(1402,vertexAbha,vertexHail));//10
 vertexAbha.addNeighbour(new Edge(202,vertexAbha,vertexJizan));//11
 vertexAbha.addNeighbour(new Edge(280,vertexAbha,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Tabuk

 vertexTabuk.addNeighbour(new Edge(974,vertexTabuk,vertexQasim));//9
 vertexTabuk.addNeighbour(new Edge(664,vertexTabuk,vertexHail));//10
 vertexTabuk.addNeighbour(new Edge(1722,vertexTabuk,vertexJizan));//11
 vertexTabuk.addNeighbour(new Edge(1929,vertexTabuk,vertexNajran));//12
 
 //=====================================================================================
 
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Qasim
 
 vertexQasim.addNeighbour(new Edge(310,vertexQasim,vertexHail));//10
 vertexQasim.addNeighbour(new Edge(1561,vertexQasim,vertexJizan));//11
 vertexQasim.addNeighbour(new Edge(1280,vertexQasim,vertexNajran));//12
 //=====================================================================================
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Hail
 
 vertexHail.addNeighbour(new Edge(1475,vertexHail,vertexJizan));//11
 vertexHail.addNeighbour(new Edge(1590,vertexHail,vertexNajran));//12
 //=====================================================================================
 
 /*
 formation Adjency vertex for the graph 
 */
// all Neighbour for vertex Jizan
 vertexJizan.addNeighbour(new Edge(482,vertexJizan,vertexNajran));//12
 
 
 
 //  declaration object shortestPath from class DijkstraShortestPath
 DijkstraShortestPath shortestPath = new DijkstraShortestPath();
 shortestPath.computeShortestPaths(vertexJeddah); //compute the shot is path  from vertex Jeddah to all Neighbour
 // print statement
 System.out.println("======================================");
 System.out.println("Calculating minimum distance");
 System.out.println("======================================");
 //Print a statement /print Distance for each cities
 System.out.println("Minimum distance from Jeddah to Makkah: "+vertexMakkah.getDistance());
 System.out.println("Minimum distance from Jeddah to Madinah: "+vertexMadinah.getDistance());
 System.out.println("Minimum distance from Jeddah to Riyadh: "+vertexRiyadh.getDistance());
 System.out.println("Minimum distance from Jeddah to Dammam: "+vertexDammam.getDistance());
 System.out.println("Minimum distance from Jeddah to Taif: "+vertexTaif.getDistance());
 System.out.println("Minimum distance from Jeddah to Abha: "+vertexAbha.getDistance());
 System.out.println("Minimum distance from Jeddah to Tabuk: "+vertexTabuk.getDistance());
 System.out.println("Minimum distance from Jeddah to Qasim: "+vertexQasim.getDistance());
 System.out.println("Minimum distance from Jeddah to Hail: "+vertexHail.getDistance());
 System.out.println("Minimum distance from Jeddah to Jizan: "+vertexJizan.getDistance());
 System.out.println("Minimum distance from Jeddah to Najran: "+vertexNajran.getDistance());
 // print statement
 System.out.println("======================================");
 System.out.println("Calculating Paths");
 System.out.println("======================================");
 // Print a statement/ print the shortest path for each cities
 System.out.println("Shortest Path from Jeddah to Makkah: "+shortestPath.getShortestPathTo(vertexMakkah));
 System.out.println("Shortest Path from Jeddah to Madinah: "+shortestPath.getShortestPathTo(vertexMadinah));
 System.out.println("Shortest Path from Jeddah to Riyadh: "+shortestPath.getShortestPathTo(vertexRiyadh));
 System.out.println("Shortest Path from Jeddah to Dammam: "+shortestPath.getShortestPathTo(vertexDammam));
 System.out.println("Shortest Path from Jeddah to Taif: "+shortestPath.getShortestPathTo(vertexTaif));
 System.out.println("Shortest Path from Jeddah to Abha: "+shortestPath.getShortestPathTo(vertexAbha));
 System.out.println("Shortest Path from Jeddah to Tabuk: "+shortestPath.getShortestPathTo(vertexTabuk));
 System.out.println("Shortest Path from Jeddah to Qasim: "+shortestPath.getShortestPathTo(vertexQasim));
 System.out.println("Shortest Path from Jeddah to Hail: "+shortestPath.getShortestPathTo(vertexHail));
 System.out.println("Shortest Path from Jeddah to Jizan: "+shortestPath.getShortestPathTo(vertexJizan));
 System.out.println("Shortest Path from Jeddah to Najran: "+shortestPath.getShortestPathTo(vertexNajran));
 }
}