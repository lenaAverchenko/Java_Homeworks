package de.telran.averchenko.elena.homework11.hospital;

import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Doctor {
    private List<Prescription> listOfPrescriptions;

    public Doctor(List<Prescription> listOfPrescriptions) {
        this.listOfPrescriptions = listOfPrescriptions;
    }

    public List<Prescription> getListOfPrescriptions() {
        return listOfPrescriptions;
    }

    public void setListOfPrescriptions(List<Prescription> listOfPrescriptions) {
        this.listOfPrescriptions = listOfPrescriptions;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "listOfPrescriptions=" + listOfPrescriptions +
                '}';
    }

    public void cureThePatient(Queue<Patient> queue, List<Prescription> listOfPrescriptions, Registration registration, Patient[] patients) {
        Random random = new Random();
//        Patient[] patientToRegister = patients;
        while (!queue.isEmpty()){
            Patient toBeCured = queue.poll();
            System.out.println(toBeCured);
            System.out.println(listOfPrescriptions.get(random.nextInt(listOfPrescriptions.size())));
            if (patients.length>0){
            patients = registration.registerTheNextPatient(queue, patients);}

        }
    }
}
