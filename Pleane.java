package Model;

public class Pleane {

    private String name;
    private String country;
    private int year;
    private long hour;
    private boolean military;
    private int weight;
    private int topSpeed;
    private int seats;
    private double cost;
    private int wingsPane;

    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }public String getCountry() {
        return country;
    }public void setCountry(String country) {
        this.country = country;
    }public int getYear() {
        return year;
    }public void setYear(int year) {
        this.year = year;
    }public long getHour() {
        return hour;
    }public void setHour(long hour) {
        this.hour = hour;
    }public boolean isMilitary() {
        return military;
    }public void setMilitary(boolean military) {
        this.military = military;
    }public int getWeight() {
        return weight;
    }public void setWeight(int weight) {
        this.weight = weight;
    }public int getTopSpeed() {
        return topSpeed;
    }public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }public int getSeats() {
        return seats;
    }public void setSeats(int seats) {
        this.seats = seats;
    }public double getCost() {
        return cost;
    }public void setCost(double cost) {
        this.cost = cost;
    }public int getWingsPane() {
        return wingsPane;
    }public void setWingsPane(int wingsPane) {
        this.wingsPane = wingsPane;
    }

    public Pleane(String name, String country, int year, long hour, boolean military,
                  int weight, int topSpeed, int seats, double cost) {
        this.name = name;
        this.country = country;
        this.year = year;
        this.hour = hour;
        this.military = military;
        this.weight = weight;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
        this.wingsPane = wingsPane;
    }
public void printInfo(){
    System.out.println("Name: " + name);
    System.out.println("Country: " + country);
    System.out.println("Year: " + year);
    System.out.println("Hours: " + hour);
    System.out.println("Military: " + (military ? "yes" : "no"));
    System.out.println("Top Speed: " + topSpeed);
    System.out.println("How many seats: " + seats);
    System.out.println("How much the cost: " + cost);
    System.out.println("Wings Pane: " + wingsPane);
}
}
