package labs_examples.objects_classes_methods.labs.objects;


import sun.security.krb5.internal.crypto.Des;

public class AirplaneExercise{
    public static void main(String[] args) {
        Passengers a = new Passengers(120);
        Eta b = new Eta(1800);
        Destination c = new Destination("Honolulu, Hawaii");
        Departure d = new Departure("Atlanta, Georgia");
        Airplane e = new Airplane(a, b, c, d, 160.5, 122.3);

        System.out.println(e.toString());

    }

}

class Airplane {

    Passengers people;
    Eta arrival;
    Destination destination;
    Departure departure;
    double fuelCap;
    double currentFuelLevel;

    public Airplane(Passengers people, Eta arrival, Destination destination,
                    Departure departure, double fuelCap, double currentFuelLevel){
        this.people = people;
        this.arrival = arrival;
        this.destination = destination;
        this.departure = departure;
        this.fuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "people=" + people +
                ", arrival=" + arrival +
                ", destination=" + destination +
                ", departure=" + departure +
                ", fuelCap=" + fuelCap +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

class Passengers {
    int p;
    public Passengers(int p){
        this.p = p;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "p=" + p +
                '}';
    }
}

class Eta {
    int time;
    public Eta(int time){
        this.time = time;
    }

    @Override
    public String toString() {
        return "Eta{" +
                "time=" + time +
                '}';
    }
}

class Destination {
    String place;
    public Destination(String place){
        this.place = place;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "place='" + place + '\'' +
                '}';
    }
}

class Departure {
    String city;
    public Departure(String city){
        this.city = city;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "city='" + city + '\'' +
                '}';
    }
}