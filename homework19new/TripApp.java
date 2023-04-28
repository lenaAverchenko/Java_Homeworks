package de.telran.averchenko.elena.homework19new;

import java.util.Arrays;
import java.util.List;

public class TripApp {
    public static void main(String[] args) {
        List<Trip> trips = Arrays.asList(
                new Trip("Berlin", "Gdansk","06:30",123.55,"12.04.23", "15.04.23"),
                new Trip("Berlin", "Warsaw","05:00",299.99,"22.05.23", "28.05.23"),
                new Trip("Luban", "Wroclaw","04:15",50.45,"17.06.23", "29.06.23"),
                new Trip("Vienna", "Gdansk","12:00",500.00,"15.02.23", "20.02.23"),
                new Trip("Gdansk", "Praha","09:45",425.00,"13.05.23", "01.06.23"),
                new Trip("Berlin", "Drezden","00:20",20.50,"10.04.23", "26.04.23"),
                new Trip("Wroclaw", "Praha","15:00",250.00,"19.10.23", "30.10.23"),
                new Trip("London", "Wroclaw","22:50",789.99,"05.12.23", "30.12.23"),
                new Trip("Toronto", "Frankfurt","13:00",1250.00,"08.09.23", "25.09.23"),
                new Trip("Praha", "Vienna","08:00",510.00,"01.01.23", "24.01.23"),
                new Trip("Frankfurt", "Wroclaw","18:00",700.80,"08.06.23", "27.06.23")
                );

        InformationBox informationBox = new InformationBox(trips);
        informationBox.getInformation();
    }
}
