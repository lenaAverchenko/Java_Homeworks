package de.telran.averchenko.elena.homework21;

public class Theory {
    /*
    * 1. Throwable - это класс - родитель исключений и ошибок. Он говорит о том, что возможно выбрасываение какого-то вида
    *    исключений. Т.е есть вероятность, что ход работы нашей программы будет не таким, как ожидается либо не таким, как,
    *    предположительно, должно было быть.
    *
    * 2. Error - класс - наследник Throwable. Это те проблемы, которые не зависят от логики нашей программы. Могут быть проблемы с JVM,
    *    с операционной системой, которые никак не зависят от нашего кода, и его исправление (изменением логики кода) невозможно.
    *    Это может быть серьезная проблема инфраструктурного характера.
    *
    * 3. checked и unchecked. Поймать можно любое из этих исключений, только в случае с unchecked исключениями, их обработка
    *    не является обязательной.
    *    checked - исключения, проверяемые в ходе компиляции. Если возможно такое исключение, мы должны явно сказать, как его
    *    нужно обработать, если с ним столкнемся.
    *    unchecked исключения, которые не требуют описания поимки и обработки. Но это возможно. Они, в свою очередь могут быть
    *    Runtime Exception и Error.
    *
    * 4. throw - команда непосредственно для выброски конкретного исключения "вручную".
    *    throws - при определении метода мы должны явно указать, что в ходе его работы может быть выкинуто исключение. При этом мы знаем,
    *    что исключение само по себе не может быть обработано, нужно описать, как это будет сделано.
    *
    * 5. В catch можно поймать что угодно, что будет Throwable, но не может поймать какой-то обычный Объект.
    *    Обработка catch в try/catch/finally происходит в указанном порядке, поэтому нужно ставить выше обработку подклассов,
    *    а уже потом - их родителей.
    *
    * 6. finally - в его блок нужно вставить ту часть кода, которая должна быть отработана, независимо от того, была ли какая-то
    *    ошибка на пути, или нет. Он обработает практически в любой ситуации, если не считать те, когда произошло какое-то
    *    влияние извне - принудительное закрытие программы. Например, мог быть выключен свет, мог быть сделан
    *    принудительный вызов закрытия программы типа System.exit(), могла появиться проблема с ОС.
    *
    * 7. final - помечая класс этим модификатором, мы говорим, что он не может быть перезаписан, метод - нельзя переопределить,
    *            переменная не может быть изменена.
    *    finally - блок для обязательного выполнения определенной части кода после блоков try / catch
    *    finalize() - метод, который запускается после Garbage Collector, он может подчистить некоторые действия, но далеко не всегда
    *            обязателен для выполнения. Его можно переопределять, но он не может нести в себе глобальную логику, поскольку
    *            неизвестно, будет ли вооще вызван Garbage Collector, и дойдет ли очередь до finalize().
    *
    * 8. OutOfMemoryError - это ошибка, которая, как я понимаю, может возникнуть не по причине того, что мы программно переполнили
    *    память, и это не может быть исправлено внутри кода.
    *
    *    А также System.gc() - в теории, это принудительный вызов Garbage Collector. Но, на самом деле, он так не вызовется. Будет
    *    только принято к сведению, что мы попытались его вызвать.
    *    Garbage Collector будет вызван тогда, когда будут существовать объекты, переменные к удалению, и удалены они могут быть
    *    тоже в том случае, если к ним никто не будет обращаться, либо в зависимости от типа ссылок на них.
    *
    * 9. Exception внутрь Exception положить можно. Возможно сделать вложенные блоки try/catch.
    *    Может быть такое, что одно исключение вызовет другое.
    *
    *
    * */
}
