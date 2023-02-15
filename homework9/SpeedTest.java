package de.telran.averchenko.elena.homework9;

import java.util.*;

public class SpeedTest {
    public static void main(String[] args) {

        //Уровень 1 задание 5

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        Random random = new Random();

        System.out.println("ArrayList without bounds: ");
        long beforeListIterator = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(random.nextInt());
        }
        long afterListIterator = System.currentTimeMillis();
        System.out.println(afterListIterator - beforeListIterator);


        System.out.println("LinkedList without bounds: ");
        long beforeListIterator1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(random.nextInt());
        }
        long afterListIterator1 = System.currentTimeMillis();
        System.out.println(afterListIterator1 - beforeListIterator1);

        System.out.println("HashSet without bounds: ");
        long beforeListIterator2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(random.nextInt());
        }
        long afterListIterator2 = System.currentTimeMillis();
        System.out.println(afterListIterator2 - beforeListIterator2);

        System.out.println("TreeSet without bounds: ");
        long beforeListIterator3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treeSet.add(random.nextInt());
        }
        long afterListIterator3 = System.currentTimeMillis();
        System.out.println(afterListIterator3 - beforeListIterator3);

        //ArrayList without bounds:
        //646
        //LinkedList without bounds:
        //1662
        //HashSet without bounds:
        //4114
        //TreeSet without bounds:
        //7357


        // Периодически ArrayList должен создавать и делать копии массивов, когда заканчиваются пустые места для заполнения,
        // но поскольку каждый раз он добавляет в 1,5 раз большее число пустых элементов (при окончании пустых мест),
        // получается, что время будет относительно постоянным (если говорить о большом числе элементов). Во время
        // перезаписи и обновлении размера тратиться больше времени, но в остальном - элементы просто записываются определенную ячейку.

        // LinkedList - тут происходит добавление ссылок для добавляемоего на null в конце, и на предыдущий
        // элемент, а также для предыдущего элемента нужно поменять ссылку, которая ссылалась прежде на null, а теперь на
        // добавленный элемент. В целом, время постонно, но при большом числе элементов мы тратим некоторое время на обновление
        // ссылок. Т.е., чем больше элементов, тем ArrayList будет быстрее.

        // HashSet на порядок быстрее, чем TreeSet, из-за того
        // что нет лишних сортировок, нет лишних порядков, т.е. HashSet - это таблица уникальных данных с уникальными "номерами".

        // TreeSet должен медленее также и потому, что ему нужно найти четкое место, куда положить
        // текущий случайный элемент, а HashSet просто производит быструю функцию и кидает элемент в таблицу, присвоив ему какой-то
        // "номер ячейки".

        // Если будут границы для рандомного числа, то многие элементы будут повторяться в течении 1 млн вызовов, и значит они могут повториься неравномерно
        // повторы не будут записаны еще раз во множества, им не нужно будет искать места, не нужно производить над ними
        // никаких функций. (проверено))))
        // В итоге, такой вариант был бы непригодет для статистики) Его рандомный характер "затирает результат"

        // Однако, в текущем четко видно разницу, а пояснение такое, каким должно быть в теории.

        // Set дольше, чем List, потому как они не могут добавить одни и те же элементы в коллекцию. Значит должна быть праверка
        // на то, чтобы элемент не повторился, а в случае с TreeSet, чтобы не был еще и null.
    }
}
