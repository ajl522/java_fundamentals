package labs_examples.objects_classes_methods.labs.objects;


import sun.security.krb5.internal.crypto.Des;

public class AirplaneExercise1_4{
    public static void main(String[] args) {
        Passengers a = new Passengers(120);
        Eta b = new Eta(1800);
        Destination c = new Destination("Honolulu, Hawaii");
        Departure d = new Departure("Atlanta, Georgia");
        Airplane e = new Airplane(a, b, c, d, 160.5, 122.3);

        System.out.println(e.toString());

        Passengers a2 = new Passengers(160);
        Eta b2 = new Eta(750);
        Destination c2 = new Destination("Los Angeles, CA");
        Departure d2 = new Departure("Atlanta, GA");

        Airplane g = new Airplane(a2, b2, c2,d2, 175.2, 130.5);

        Passengers a3 = new Passengers(80);
        Eta b3 = new Eta(1120);
        Destination c3 = new Destination("New York, NY");
        Departure d3 = new Departure("Atlanta, GA");

        Airplane f = new Airplane(a3,b3, c3, d3, 125.7, 60.3 );

        Passengers a4 = new Passengers(110);
        Eta b4 = new Eta(1045);
        Destination c4 = new Destination("Denver, CO");
        Departure d4 = new Departure("Atlanta, GA");

        Airplane i = new Airplane(a4, b4, c4, d4, 115.8, 95.6);

        System.out.println(g.toString());
        System.out.println(f.toString());
        System.out.println(i.toString());

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