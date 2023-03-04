package de.telran.averchenko.elena.homework14.ways_graph;


public class GraphTest {
    public static void main(String[] args) {
        //Level 2 Task 2

        WaysGraph graph = new WaysGraph();
        graph.add('А','Б');
        graph.add('А','В');
        graph.add('В','Г');
        graph.add('В','Д');
        graph.add('Д','Ж');
        graph.add('Г','Д');
        graph.add('Г','Ж');
        graph.add('Е','Г');
        graph.add('Е','Ж');
        graph.add('Б','Г');
        graph.add('Б','Е');

        graph.findDFSWays('А','Ж');






    }
}
