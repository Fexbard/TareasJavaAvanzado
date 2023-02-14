import java.util.ArrayList;

public class ExtraCocheBD implements Vehiculo, interfaceExtraCocheElectrico {
    ArrayList<Coche> list = new ArrayList<>();


    public void guardarCoche(Coche coche) {

        list.add(coche);
    }

    public void alertarDuplicado(String coche) {
        ArrayList<Coche> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mark.equalsIgnoreCase(coche)){
                System.out.println("Es un coche repetido");
            }
        }
    }
    public void imprimirListaCoches(ArrayList<String> list){
        String lista="";
        for (int i = 0; i < list.size(); i++) {
            lista = list.get(i);
        }
        System.out.println(lista);
    }

}
