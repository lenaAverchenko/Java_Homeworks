package de.telran.averchenko.elena.homework11.hospital;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;

public class Registration {

    Patient[] patients;
    private int maxNumberOfPatients = 10;

//    public Queue<Patient> registerThePatient(Queue<Patient> patients){
//        Queue<Patient> queueOfPatients = new ArrayDeque<>();
//        Patient[] restOfThePatients = new Patient[patients.size() - 10];
//        if (patients.size()<=10){
//            for (int i = 0; i < patients.size(); i++) {
//                queueOfPatients.add(patients[i]);
//            }
//        } else if (patients.size()>10){
//            System.out.println("На данный момент свободных мест нет.");
//            for (int i = 0; i < 10; i++){
//                queueOfPatients.add(patients[i]);
//            }
//            for (int i = 0; i < restOfThePatients.length; i++) {
//                restOfThePatients[i] = patients[i+10];
//            }
//
//        }
//        this.patients =  restOfThePatients;
//        return queueOfPatients;
//    }

    public Patient[] registerThePatient(Queue<Patient> queueOfPatients, Patient[] patients){
        Patient[] restOfThePatients = new Patient[patients.length - 10];
        if (patients.length<=10){
            for (int i = 0; i < patients.length; i++) {
                queueOfPatients.add(patients[i]);
            }
        } else if (patients.length>10){
            System.out.println("На данный момент свободных мест нет.");
            for (int i = 0; i < 10; i++){
            queueOfPatients.add(patients[i]);
            }
            for (int i = 0; i < restOfThePatients.length; i++) {
                restOfThePatients[i] = patients[i+10];
            }

        }
        this.patients =  restOfThePatients;
        return restOfThePatients;
    }

    public Patient[] registerTheNextPatient(Queue<Patient> queuePatients, Patient[] patients){
        Patient[] restOfThePatients = new Patient[patients.length - 1];
        if(queuePatients.size()<10 && patients.length !=0){
            if (patients.length == 1){
                queuePatients.add(patients[0]);
                System.out.println("Ожидающих в очередь в регистратуре больше нет.");
                restOfThePatients = new Patient[0];
                } else if (patients.length > 1){
                queuePatients.add(patients[0]);
                System.out.println("На данный момент свободных мест нет.");
                for (int i = 0; i < restOfThePatients.length; i++) {
                    restOfThePatients[i] = patients[i+1];
                }
            }

        }
        patients = restOfThePatients;
        return patients;
    }

}
