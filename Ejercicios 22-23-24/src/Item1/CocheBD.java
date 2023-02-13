package Item1;

import java.util.ArrayList;

public class CocheBD extends Vehiculo{
    ArrayList<Coche> list = new ArrayList<>();


    public void guardarCoche(Coche coche) {

        list.add(coche);

    }
}
