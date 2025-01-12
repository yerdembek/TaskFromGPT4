package VehicleControlSystems;

public class Bicycle extends Transport{

    @Override
    public String move(){
        return "Велосипед движется по велосипедной дорожке";
    }

    @Override
    public String stop(){
        return "Велосипед остановился";
    }

    @Override
    public String info(){
        return "Велосипед: нет данных";
    }

    public  String info(boolean info){
        if(info){ return "Велосипед: есть корзина — Да"; }
        else{ return "Велосипед: есть корзина — Нет"; }
    }
}
