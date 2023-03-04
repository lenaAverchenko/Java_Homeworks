package de.telran.averchenko.elena.homework14.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Graph {
    Map<Character, List<Side>> nodes = new TreeMap<>();

    public class Node {
        public char value;
        public List<Character> sides;

    }

    public class Side {
        public char from;
        public char to;

        public Side(char from, char to) {
            this.from = from;
            this.to = to;
        }
    }
    // прошу прощения за комментарии - это я для себя
    public void add (char from, char to){
        // берем по ключу from список ребер, исходящих из данной ноды
        List<Side> currentNode = nodes.get(from);
        // если по текущему ключу не задан лист из ребер
        if (currentNode == null){
            // создаем в нем новый динамический лист
            currentNode = new ArrayList<>();
            //и записываем в нашу мапу, которая представляет собой граф данные о ноде
            nodes.put(from,currentNode);
        }
        // в то же время, нам нужно записать данные о ребрах, связанных текущей нодой, и если вершина уже записана, то нужно
        // просто дописать туда данные об очередном ребре
        currentNode.add(new Side(from, to));
            }

}
