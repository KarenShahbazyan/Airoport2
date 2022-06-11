import Model.Pleane;
import Service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Pleane p1 = service.parametrs();
        Pleane p2 = service.parametrs();
        Pleane[] pleanes = {p1, p2,};
        System.out.println("++++++++++++++++");
        service.Pleanes(pleanes);
        System.out.println("++++++++++++");
        service.isMilitary(pleanes);
        System.out.println("-+-+-+-+-+-+-+-+-+-");
        service.isNewer(pleanes);
        System.out.println("////||||????////");
        service.bigWings(pleanes);
        System.out.println("////////////////");
        service.manySeats(pleanes);
        System.out.println("++++++++++++++++++++");
        service.aierLarge(pleanes);
        System.out.println("+++++++++++++++++++");
        service.minWeight(pleanes);
        System.out.println("+++++++++++++++");
        service.essyCoast(pleanes);
        System.out.println("+++++++++++++++++++++");
        service.sot_Of_Year(pleanes);
        System.out.println("***************************************************************************************");
        System.out.println(" Thank you !!!! ");
    }
}
