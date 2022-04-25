public class car {
    int distanse = 10;
    public void start(){
        System.out.println("вперед");}
    public void stop(){
        System.out.println("стоп");}

    public void drive(int howlong){
        distanse = distanse * 6;
        System.out.println("Мы проехали " + distanse + " km");
    };

}

class jamesBondCar extends car {
    public void drive (int howlong){
        distanse = distanse * 180;
        System.out.println("А я проехал " + distanse + " km. Ваш, сука, бонд");
    };
    }

