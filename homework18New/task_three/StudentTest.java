package de.telran.averchenko.elena.homework18New.task_three;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> qaStudents = Arrays.asList(
                new QAStudent("Vasia", 2.5,true,"QAStudentWithEnum"),
                new QAStudent("Kostia", 5.0,false,"QAStudentWithEnum"),
                new QAStudent("Masha", 4.6,false,"QAStudentWithEnum"),
                new QAStudent("Olha", 3.0,true,"QAStudentWithEnum"),
                new QAStudent("Nadia", 4.8,true,"QAStudentWithEnum"));

        List<Student> frontEndStudents = Arrays.asList(
                new FrontEndStudent("Dima", 4.8,false,"FrontEndStudentWithEnum"),
                new FrontEndStudent("Maks", 3.7,true,"FrontEndStudentWithEnum"),
                new FrontEndStudent("Dasha", 4.2,false,"FrontEndStudentWithEnum"),
                new FrontEndStudent("Steve", 3.9,true,"FrontEndStudentWithEnum"),
                new FrontEndStudent("Aga", 4.6,false,"FrontEndStudentWithEnum"));

        List<Student> backEndStudents = Arrays.asList(
                new BackEndStudent("Kris", 2.0,true,"BackEndStudentWithEnum"),
                new BackEndStudent("Tonia", 5.0,true,"BackEndStudentWithEnum"),
                new BackEndStudent("Gosha", 4.9,true,"BackEndStudentWithEnum"),
                new BackEndStudent("Katia", 3.2,false,"BackEndStudentWithEnum"),
                new BackEndStudent("Misha", 5.0,false,"BackEndStudentWithEnum"));

        List <List<Student>> listOfAllStudents = Arrays.asList(qaStudents, frontEndStudents, backEndStudents);

        /**
         *         Написать стрим для данного списка - списков, в котором выбрать все студентов с рейтом более 4.5
         *         и тех, кто закончил курс (поле finished), для каждого студента который попал под условие,
         *         в поле type установить значение типа FE,BE,QA в зависимости от того к какому типу класса
         *         он относится,переформировать всех в объекты класса ProjectStudentWithEnum,(на этой точке должен быть
         *         стрим студентов ProjectStudentWithEnum), вывести всю информацию о получившихся студентах в консоль,
         *         собрать данные в отдельный список.
         */

        Function<Student,Student> rateFunction = student -> {
            if (student.getType().equals("QAStudentWithEnum")){
                student.setType("QA");
            } else if (student.getType().equals("BackEndStudentWithEnum")) {
                student.setType("BE");
            } else if (student.getType().equals("FrontEndStudentWithEnum")) {
                student.setType("FE");
            }
            return student;
        };

        Function<Student,ProjectStudent> projectStudentFunction = student -> {
            return new ProjectStudent(student.getName(), student.getRate(), student.type);
        };

        List<ProjectStudent> projectStudentList = listOfAllStudents.stream()
                .flatMap(list -> list.stream())
                .filter(st -> st.getRate() > 4.5)
                .filter(st -> st.isFinished())
                .map(rateFunction)
                .map(projectStudentFunction)
                .toList();
        System.out.println(projectStudentList);

    }
}
