import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[100];
        String[] name = {
                "Toyota Camry", "Honda Accord", "Ford Focus", "Chevrolet Malibu", "Nissan Altima",
                "Hyundai Sonata", "Kia Optima", "Mazda 6", "Volkswagen Passat", "Subaru Legacy",
                "BMW 3 Series", "Mercedes-Benz C-Class", "Audi A4", "Lexus IS", "Acura TLX",
                "Infiniti Q50", "Jaguar XE", "Volvo S60", "Cadillac CT5", "Tesla Model 3",
                "Porsche Panamera", "Ferrari 488", "Lamborghini Huracan", "McLaren 720S", "Bugatti Chiron",
                "Aston Martin DB11", "Rolls-Royce Ghost", "Bentley Continental", "Alfa Romeo Giulia", "Maserati Ghibli",
                "Toyota Corolla", "Honda Civic", "Ford Fiesta", "Chevrolet Spark", "Nissan Sentra",
                "Hyundai Elantra", "Kia Forte", "Mazda 3", "Volkswagen Jetta", "Subaru Impreza",
                "BMW 5 Series", "Mercedes-Benz E-Class", "Audi A6", "Lexus ES", "Acura RLX",
                "Infiniti Q70", "Volvo S90", "Jaguar XF", "Cadillac CT6", "Tesla Model S",
                "Porsche 911", "Ferrari SF90", "Lamborghini Aventador", "McLaren Artura", "Bugatti Veyron",
                "Aston Martin Vantage", "Rolls-Royce Phantom", "Bentley Flying Spur", "Alfa Romeo Stelvio", "Maserati Levante",
                "Toyota RAV4", "Honda CR-V", "Ford Escape", "Chevrolet Equinox", "Nissan Rogue",
                "Hyundai Tucson", "Kia Sportage", "Mazda CX-5", "Volkswagen Tiguan", "Subaru Forester",
                "BMW X5", "Mercedes-Benz GLE", "Audi Q7", "Lexus RX", "Acura MDX",
                "Infiniti QX60", "Volvo XC90", "Jaguar F-PACE", "Cadillac XT5", "Tesla Model Y",
                "Toyota Highlander", "Honda Pilot", "Ford Explorer", "Chevrolet Traverse", "Nissan Pathfinder",
                "Hyundai Palisade", "Kia Telluride", "Mazda CX-9", "Volkswagen Atlas", "Subaru Ascent",
                "Jeep Grand Cherokee", "Land Rover Range Rover", "GMC Acadia", "Lincoln Navigator", "Dodge Durango",
                "Ram 1500", "Ford F-150", "Chevrolet Silverado", "Toyota Tacoma", "Nissan Frontier"
        };
        for (int i = 1; i < cars.length; i++) {

            cars[i] = new Car(name[i], i);

            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }
}