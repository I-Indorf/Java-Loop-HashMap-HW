import java.util.HashMap;
import java.util.Scanner;

import javafx.scene.input.InputEvent;

public class HashMapHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        HashMap<String, String> cars = new HashMap<>();

        cars.put("Wrangler", "Jeep");
        cars.put("Bug", "Volkswagon");
        cars.put("H3", "Hummer");
        cars.put("QX60", "Infiniti");

        String desiredCar = scan.nextLine();

        cars.get(desiredCar);
        System.out.println(cars.get(desiredCar));

      



    scan.close();
    }
}
