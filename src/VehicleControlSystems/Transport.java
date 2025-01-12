package VehicleControlSystems;

public abstract class Transport {

    public String move(){
        return "движение";
    }

    public String stop(){
        return "остановка";
    }

    public String info(){
        return  "вывод информации о транспортном средстве";
    }
}
