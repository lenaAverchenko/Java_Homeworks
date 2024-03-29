package de.telran.averchenko.elena.homework19;

public class Theory {
    /*
    * 1. Stream не имеет внутреннего состояния - одна из самых важных особенностей. Если по чем-то можно итерироваться,
    *    то его можно представить в виде потока. И благодаря использованию стримов повышается читабельность кода.
    *
    * 2. Основные типы операций в стримах:
    *    - Intermediate (промежуточные) - набор "инструкций" для того, как обработать поток,
    *    - Terminal (конечные) - только с этой операцией будет вызвана вся цепочка промежуточных.
    *
    * 3. Терминальную операцию можно вызвать только 1 раз на стрим. Если мы ее вызвали 1 раз, то поток будет закрыт, и больше не
    *    будет использоваться. Вторая терминальная операция не может быть вызвана.
    *
    * 4. Intermediate operations:
    *    - filter() - отфильтровать по какому-то параметру (ограничениям)
    *    - map() - произвести действие
    *    - limit() - установить какой-то предел, до которого будут доставаться элементы
    *    - peek() - для проверки (вернет само себя, но ожет выполнить действие)
    *    - sorted() - отсортирует весь поток
    *    - distinct() - выбрасывает все повторы
    *    - skip() - пропускает какое-то число элементов
    *    - takeWhile() - с 9 версии; выполнять, пока какое-то действие будет верно
    *
    * 5. Terminal operations:
    *    - forEach() - пройтись по каждому элементу
    *    - collect(Collectors.toList) - собрать в список
    *    - collect(Collectors.toSet) - собрать в множество
    *    - toArray() - вернет результат в виде массива объектов, если явно не указать ссылку на массив, например, интов.
    *    - findFirst() - вернет первый элемент Optional
    *    - reduce() - оператор, который может проделать дополнительное действие и вернуть, например Integer - сумму элементов
    *
    * 6. Обычно обрабатываются все поочередно на один объект, и так работают с каждым из тех, что в стриме. Но, если есть
    *    сотрировщик, то обрабатывается каждый объект поочередно только до этого сортировщика; когда к нему пришли все элементы
    *    он их отсортирует, и пустит дальше по одному по цепочке задач.
    *
    * 7. sorted(), как описано выше, собирает у себя элементы, сортирует их и отпускает дальше.
    *
    * 8. Не все операции являются stateless. Некоторый могут иметь состояние:
    *    - takeWhile()
    *    - sorted() - должен иметь представление о тех, кто был до и после
    *    - distinct() - также имеет состояние - знает о тех, кто был до
    *    - peek() - также может поментяь состояние
    *
    * 9. stateless операции позволяют безопасно работать с параллельными потоками.
    *
    * 10. peek() изначально представлен в документации, как оператор для дебага. Логика из peek может быть просто не выполнена.
    *
    *
    *
    *
    * */
}
