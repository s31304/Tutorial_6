public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 1968, 15000, 600);
        Truck truck = new Truck("Scania", "S410", 2019, 8000, 400, 10);

        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " mil na galon");
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " mil na galon");
    }
}
