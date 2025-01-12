package VehicleControlSystems;

public class Car extends Transport{

    @Override
    public String move(){
        return "Машина едет по дороге";
    }

    @Override
    public String stop(){
        return "Машина остановилась";
    }

    @Override
    public String info(){
        return "Машина: нет данных";
    }

    public String info(int n){
        return "Машина: количество пассажиров - " + n;
    }
}
