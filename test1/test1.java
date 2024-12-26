
public class test1 {
    public static void main(String[] args) {
        Plane p1 =  new Plane("111", 10);
        p1.Start();


        Airport airport1 = new Airport("аэропорт");
        airport1.addAircraft(new Plane("боинг", 3000));
        airport1.addAircraft(new Plane("аэробус", 2500));
        airport1.addAircraft(new Helicopter("ми-8"));

        airport1.takeOffAll();
    }
}






class Airport {
    private String name;
    public Aircraft[] aircrafts;
    private int index;
    private int capacity;
    
    

    public Airport (String name) {
        this.name = name;
        this.index = 0;
        this.capacity = 100;
        this.aircrafts = new Aircraft[capacity];
    }
    
    public void addAircraft(Aircraft aircraft) {
        //if (index >= 0 && index < aircrafts.length) {
        //    aircrafts[index++] = aircraft;
        //}

        aircrafts[index++] = aircraft;
    }

    public void takeOffAll() {
        for (Aircraft aircraft : this.aircrafts) {
            if(this.index > 0 && this.index < aircrafts.length && aircraft!= null) {
                aircraft.Start();
            }
        }
    }
}









abstract class Aircraft {
    protected  String name;
    protected int capacity;

    public Aircraft(String name) {
        this.name = name;
    }

    public String GetName(){
        return this.name; 
    }

    public void SetName (String name) {
        this.name = name;
    }

    abstract public void Start();
}

class Plane extends Aircraft {
    private int stripLength;

    public Plane(String name, int stripLength) {
        super(name);
        this.stripLength = stripLength;
    }
    @Override 
    public void Start() {
        System.out.println(String.format( "%s. Разогреваю двигатели. Прохожу полосу разгона длиной %s. Взлетаю. Убираю шасси",name, stripLength));
    }
}

class Helicopter extends Aircraft {

    public Helicopter(String name) {
        super(name);
    }
    @Override 
    public void Start() {
        System.out.println(String.format( "%s. Разогреваю двигатели. Взлетаю",name));
    }
}






class Passenger {
    private String name;
    private String surname;
    private int seatNumber;

    public Passenger(String name, String surname, int seatNumber){
        this.name = name;
        this.surname = surname;
        this.seatNumber = seatNumber;
    }


}