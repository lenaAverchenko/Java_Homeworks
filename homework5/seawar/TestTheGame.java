package de.telran.averchenko.elena.homework5.seawar;

public class TestTheGame {
    public static void main(String[] args) {

        // Для меня 1 день - это мало, чтобы прописать всю игру. Тем более, работая)

        // Должен быть игрок, который задает координаты, и в соответствии с ними рисует корабль.Он может рисовать их поочередно сам
        // (и тогда тоже должна быть проверка, чтобы на указанном элементе не было корабля либо обязательного пропуска),
        // может указать начало и конец, а между ними автоматом зарисуется в нужные данные.
        // Будет много условий, поскольку должны быть пропуски между кораблями, уже установленные корабли нельзя переписать
        // и их нельзя разделить.

        // В целом, даже проще было бы указывать в методе просто ячейки с координатами, в качестве аргументов. И тогда
        //задача метода была бы просто поменять значения элементов массива. Это самое красивое, и можно согнуть корабли,
        // но проверка, так или иначе, должна быть.

        // Для игрока компьютерного - предполагалось рандомно выбрать начальные координаты каждого корабля.
        // Если корабль можно изогнуть, то так проще обойти столкновение с ненужным кораблем, который уже нарисован.

        //В самой игре
        // Действия компьютера задать легко - он будет рандомно в пределах 10 (0-9) давать координаты, и значение лежащее по
        // адресу ячейки можно сравнить с 1,2,3,4 или 0 - тогда игрок не угадал. Каждое выбранное значение может переписать
        // наш массив и закраситься крестиком, если был промах, либо, например 9, если попадание

        //Аналогично, координаты игрока можно принимать на вход из сканера, и убивать корабли компьютера той же проверкой.

        //Конечное условие игры. После каждого попадания (либо вообще хода), нужно проверять массив на наличипе 4,3,2,1.
        // если их не осталось - игрок выиграл
        //Логически - все ясно. Реализация, лично для меня, на данном этапе, слишком долгая.))

        SeaWarTable seaWarTable = new SeaWarTable();
        HumanPlayer humanPlayer = new HumanPlayer();
        int[][] initialTable = seaWarTable.createSeaWarTable();
        seaWarTable.showTheSeaWarTable(initialTable);
        System.out.println("");

        int[][] newTable4 = humanPlayer.putFourDeckShipToTheTable(initialTable);
        seaWarTable.showTheSeaWarTable(newTable4);
        System.out.println("");
        int[][] newTable43 = humanPlayer.putThreeDeckShipToTheTable(newTable4);
        seaWarTable.showTheSeaWarTable(newTable43);
        System.out.println("");
        int[][] newTable433 = humanPlayer.putThreeDeckShipToTheTable(newTable43);
        seaWarTable.showTheSeaWarTable(newTable433);
        System.out.println("");
        int[][] newTable4332 = humanPlayer.putTwoDeckShipToTheTable(newTable433);
        seaWarTable.showTheSeaWarTable(newTable4332);
        System.out.println("");
        int[][] newTable43322 = humanPlayer.putTwoDeckShipToTheTable(newTable4332);
        seaWarTable.showTheSeaWarTable(newTable43322);
        System.out.println("");
        int[][] newTable433222 = humanPlayer.putTwoDeckShipToTheTable(newTable43322);
        seaWarTable.showTheSeaWarTable(newTable433222);
        System.out.println("");
        int[][] newTable4332221 = humanPlayer.putOneDeckShipToTheTable(newTable433222);
        seaWarTable.showTheSeaWarTable(newTable4332221);
        System.out.println("");
        int[][] newTable43322211 = humanPlayer.putOneDeckShipToTheTable(newTable4332221);
        seaWarTable.showTheSeaWarTable(newTable43322211);
        System.out.println("");
        int[][] newTable433222111 = humanPlayer.putOneDeckShipToTheTable(newTable43322211);
        seaWarTable.showTheSeaWarTable(newTable433222111);
        System.out.println("");
        int[][] newTable4332221111 = humanPlayer.putOneDeckShipToTheTable(newTable433222111);
        seaWarTable.showTheSeaWarTable(newTable4332221111);
        System.out.println("");



    }
}
