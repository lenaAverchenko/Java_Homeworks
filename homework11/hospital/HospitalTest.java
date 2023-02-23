package de.telran.averchenko.elena.homework11.hospital;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class HospitalTest {
    public static void main(String[] args) {
        List<Prescription> listOfPrescriptions = Arrays.asList(new Prescription("Грипп", "Жаропонижающие, противовирусные"),
                new Prescription("Ветрянка", "Противовирусные"),
                new Prescription("Ковид", "Противовирусные, ИВЛ"),
                new Prescription("Ангина", "Жаропонижающие, антибиотики"),
                new Prescription("Сахарный диабет", "Инсулин"),
                new Prescription("Аутоиммунный тиреоидит", "Гармональные"),
                new Prescription("Расстройство желудка", "Лекарства от боли"),
                new Prescription("Воспаление легких", "Антибиотики"),
                new Prescription("Мигрень", "Лекарства от головной боли"));
        Registration registration = new Registration();
        Doctor doctor = new Doctor(listOfPrescriptions);
        Hospital hospital = new Hospital(doctor,registration);

        Patient patient1 = new Patient("Николай");
        Patient patient2 = new Patient("Диана");
        Patient patient3 = new Patient("Галина");
        Patient patient4 = new Patient("Виталий");
        Patient patient5 = new Patient("Виктор");
        Patient patient6 = new Patient("Татьяна");
        Patient patient7 = new Patient("Виктория");
        Patient patient8 = new Patient("Зинаида");
        Patient patient9 = new Patient("Патриция");
        Patient patient10 = new Patient("Петр");
        Patient patient11 = new Patient("Феодосия");
        Patient patient12 = new Patient("Григорий");
        Patient patient13 = new Patient("Евгений");
        Patient patient14 = new Patient("Аннет");
        Patient patient15 = new Patient("Беата");
        Patient[] patients = {patient1,patient2,patient3,patient4,patient5,patient6,patient7,patient8,patient9,patient10,patient11,patient12,patient13,patient14,patient15};
        Queue<Patient> patientsToTreat = new ArrayDeque<>();
        Patient[] patientsNotInAQueue = registration.registerThePatient(patientsToTreat,patients);
        System.out.println("Not In A Queue");
        System.out.println(Arrays.toString(patientsNotInAQueue));
        System.out.println("Waiting for cure");
        System.out.println(patientsToTreat);
        doctor.cureThePatient(patientsToTreat,listOfPrescriptions, registration, patientsNotInAQueue);
    }
}
