package de.telran.averchenko.elena.homework18;

public class Theory {
    /*
    * 1. Дефолтные методы у Function:
    *    - compose() - сначала совместит функции (a.compose(b)), а потом применит к ним метод apply()
    *    - andThen() - сначала выполнит тело метода, а потом применит apply() к первой функу функции
    *    - identity() - фунция вернет саму себя (входной параметр)
    *
    * 2. Stream - это поток данных. Он не может изменить структуру данных, с которой работает, он ничего не хранит в себе,
    *    но работает и обрабатывает данные. По сути, комбинация методов для работы с коллекциями. Можно применить фунциональный
    *    стиль к коллекциям.
    *
    * 3. Императивный - это обычное программирование. Большой код, который описывает "как" нужно выполнить задачу.
    *    Декларативный - это способ привести код программы к читаемому виду, как книга. Описывает "что" нужно сделать, чтобы задача
    *    была выполнена. Вся логика лежит "внутри", но сам код выглядит как будто мы говорим "последовательность" четких действий,
    *    а программа сама знает, как их осуществить.
    *
    * 4. Optional - контейнер объекта, который позволяет работать с null. Благодаря ему можно делать условия, что будет, если значение null,
    *    как от него защититься. Можно задавать выброс exception, либо другое действие в зависимости от значения.
    *
    * 5. Predicate (в основном, применяется для фильтрации данных из потока Stream). Вернет логическое значение. Имеет методы:
    *    - test() - принял аргумент - вернул boolean
    *    - negate() - вернул обратное значение. Как бы зеркальная функция
    *    - isEquals() - равны ли Объекты?
    *    - and() - и
    *    - or() - или
    *
    * 6. Ссылка на метод - это упрощенный вариант записания лямбда выражений. Важно, чтобы параметры метода и лямбда совпадали.
    *    "::" - синтаксис.
    *
    * 7. identity() - фунция вернет саму себя (входной параметр)
    *
    *
    *
    *
    *
    * */
}
