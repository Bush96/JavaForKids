public class carOwner {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.start();
        mycar.drive(3);
        mycar.stop();

        System.out.println();

        jamesBondCar jb = new jamesBondCar();
        jb.drive(3);

    }
}
