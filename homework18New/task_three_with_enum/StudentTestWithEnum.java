package de.telran.averchenko.elena.homework18New.task_three_with_enum;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StudentTestWithEnum {
    public static void main(String[] args) {
        List<StudentWithEnum> qaStudents = Arrays.asList(
                new QAStudentWithEnum("Vasia", 2.5,true,Type.QAStudent),
                new QAStudentWithEnum("Kostia", 5.0,false,Type.QAStudent),
                new QAStudentWithEnum("Masha", 4.6,false,Type.QAStudent),
                new QAStudentWithEnum("Olha", 3.0,true,Type.QAStudent),
                new QAStudentWithEnum("Nadia", 4.8,true,Type.QAStudent));

        List<StudentWithEnum> frontEndStudents = Arrays.asList(
                new FrontEndStudentWithEnum("Dima", 4.8,false,Type.FrontEndStudent),
                new FrontEndStudentWithEnum("Maks", 3.7,true,Type.FrontEndStudent),
                new FrontEndStudentWithEnum("Dasha", 4.2,false,Type.FrontEndStudent),
                new FrontEndStudentWithEnum("Steve", 3.9,true,Type.FrontEndStudent),
                new FrontEndStudentWithEnum("Aga", 4.6,false,Type.FrontEndStudent));

        List<StudentWithEnum> backEndStudents = Arrays.asList(
                new BackEndStudentWithEnum("Kris", 2.0,true,Type.BackEndStudent),
                new BackEndStudentWithEnum("Tonia", 5.0,true,Type.BackEndStudent),
                new BackEndStudentWithEnum("Gosha", 4.9,true,Type.BackEndStudent),
                new BackEndStudentWithEnum("Katia", 3.2,false,Type.BackEndStudent),
                new BackEndStudentWithEnum("Misha", 5.0,false,Type.BackEndStudent));

        List <List<StudentWithEnum>> listOfAllStudents = Arrays.asList(qaStudents, frontEndStudents, backEndStudents);

        /**
         *         Написать стрим для данного списка - списков, в котором выбрать все студентов с рейтом более 4.5
         *         и тех, кто закончил курс (поле finished), для каждого студента который попал под условие,
         *         в поле type установить значение типа FE,BE,QA в зависимости от того к какому типу класса
         *         он относится,переформировать всех в объекты класса ProjectStudentWithEnum,(на этой точке должен быть
         *         стрим студентов ProjectStudentWithEnum), вывести всю информацию о получившихся студентах в консоль,
         *         собрать данные в отдельный список.
         */


        Function<StudentWithEnum, ProjectStudentWithEnum> projectStudentFunction = student -> {
            String tempType = "";
            if (student.getType().equals(Type.QAStudent)){
                tempType = "QA";
            } else if (student.getType().equals(Type.BackEndStudent)) {
                tempType = "BE";
            } else if (student.getType().equals(Type.FrontEndStudent)) {
                tempType = "FE";
            }
            return new ProjectStudentWithEnum(student.getName(), student.getRate(), tempType);
        };

        List<ProjectStudentWithEnum> projectStudentList = listOfAllStudents.stream()
                .flatMap(list -> list.stream())
                .filter(st -> st.getRate() > 4.5)
                .filter(st -> st.isFinished())
                .map(projectStudentFunction)
                .toList();
        System.out.println(projectStudentList);

    }
}
