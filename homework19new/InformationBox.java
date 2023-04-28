package de.telran.averchenko.elena.homework19new;

import java.util.*;
import java.util.stream.Collectors;

public class InformationBox {

    private List<Trip> trips;

    public InformationBox(List<Trip> trips) {
        this.trips = trips;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "InformationBox{" +
                "trips=" + trips +
                '}';
    }

    public void getInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick the command: 'A', 'B', 'C', 'D', 'E', 'F', 'G'");
        String command = scanner.nextLine();
        List<String> strExamples = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
        List<String> sourceCities = trips.stream()
                .map(t -> t.getSource())
                .distinct()
                .collect(Collectors.toList());
        List<String> destinationCities = trips.stream()
                .map(t -> t.getDestination())
                .distinct()
                .collect(Collectors.toList());
        double minPrice = trips.stream()
                .mapToDouble(t -> t.getPrice())
                .min().orElse(0.0);
        double maxPrice = trips.stream()
                .mapToDouble(t -> t.getPrice())
                .max().orElse(0.0);
        while (!strExamples.contains(command)) {
            System.out.println("This command doesn't exist! Please, try again!");
            command = scanner.nextLine();
        }
        if (strExamples.contains(command)) {
            if ("A".equals(command)) {
                trips.stream().forEach(System.out::println);
            } else if ("B".equals(command)) {
                trips.stream().sorted(new PriceComparator()).forEach(System.out::println);
            } else if ("C".equals(command)) {
                trips.stream().sorted(new PriceComparator().reversed()).forEach(System.out::println);
            } else if ("D".equals(command)) {
                double askedMinPrice = 0.0;
                double askedMaxPrice = 0.0;
                try{
                System.out.println("Please, enter the minimum price for your trip in '00,00' or '000' format: ");
                askedMinPrice = scanner.nextDouble();
                System.out.println("Please, enter the maximum price for your trip in '00,00' or '000' format: ");
                askedMaxPrice = scanner.nextDouble();
                } catch (Exception e){
                    System.out.println("Wrong format of the price");
                }
                double finalAskedMinPrice = askedMinPrice;
                double finalAskedMaxPrice = askedMaxPrice;
                List<Trip> tmpTrips = trips.stream()
                        .filter(t -> (t.getPrice() >= finalAskedMinPrice && t.getPrice() <= finalAskedMaxPrice))
                        .collect(Collectors.toList());
                if (tmpTrips.isEmpty()){
                    System.out.println("There are no results for your request!");
                } else if (!tmpTrips.isEmpty()) {
                    System.out.println(tmpTrips);
                }
                //после считывания дабл, к сожалению, нужно считать еще одну строку, иначе он считывает пустой символ,
                // и полагает, что я ввела неверный ответ на вопрос "Would you like to know more information? Y/N"
                // так происходит только в этом моменте - после считывания строки после дабл.
                String justToEraseExtraString = scanner.nextLine();
            } else if ("E".equals(command)) {
                System.out.println("Please, enter the city to begin your trip with. You can pick one of the following:");
                sourceCities.forEach(System.out::println);
                String city = scanner.nextLine();
                while (!sourceCities.contains(city)) {
                    System.out.println("Pick the one of the following cities:");
                    sourceCities.forEach(System.out::println);
                    city = scanner.nextLine();
                }
                if (sourceCities.contains(city)) {
                    //эту переменную заставляет сделать сама среда
                    String finalCity = city;
                    trips.stream()
                            .filter(t -> t.getSource().equals(finalCity))
                            .forEach(System.out::println);
                }
            } else if ("F".equals(command)) {
                System.out.println("Please, enter the city to begin your trip. You can pick one of the following:");
                destinationCities.forEach(System.out::println);
                String city = scanner.nextLine();
                while (!destinationCities.contains(city)) {
                    System.out.println("Pick the one of the following cities:");
                    destinationCities.forEach(System.out::println);
                    city = scanner.nextLine();
                }
                if (destinationCities.contains(city)) {
                    String finalCity = city;
                    trips.stream()
                            .filter(t -> t.getDestination().equals(finalCity))
                            .forEach(System.out::println);
                }
            } else if ("G".equals(command)) {
                long amountOfTrips = trips.stream().count();
                System.out.printf(("The amount of available trips is %d. \nThe prices are in the range from %.2f to %.2f, " +
                        "\nStarting from following cities: " + sourceCities + "\nto the following cities: " + destinationCities + "\n"), amountOfTrips, minPrice, maxPrice);
            }
            System.out.println("Would you like to know more information? Y/N");
            String answer = scanner.nextLine();
            List<String> answerExamples = Arrays.asList("Y", "N");
            while (!answerExamples.contains(answer)) {
                System.out.println("Try again! Would you like to know more information? Y/N");
                answer = scanner.nextLine();
            }
            if (answerExamples.contains(answer)) {
                if ("Y".equals(answer)) {
                    getInformation();
                } else if ("N".equals(answer)) {
                    return;
                }
            }
            scanner.close();
        }
    }
}
