package Item1;

public class Main {
    public static void main(String[] args) {
        EdadHumanadelPerro edad = new EdadHumanadelPerro();

    int edadPoroto = 0;
    int edadCoco = 0;
    int edadElisa =0;
    String estado= "";
    for (int i = 0; i< args.length; i++) {
        switch (args[i]) {
            case "Poroto":
            edadPoroto = Integer.valueOf(args[i+1]);
                i++;
            break;
        case "Coco":
            edadCoco = Integer.valueOf(args[i+1]);
                i++;
            break;
        case "Elisa":
            edadElisa = Integer.valueOf(args[i+1]);
                 i++;
            break;
        }
    }
        System.out.println("Poroto tiene: "+ edadPoroto+ " años, y su edad humana es "+ edad.calculoEdad(edadPoroto));
        System.out.println("Elisa tiene: "+ edadElisa+ " años, y su edad humana es "+ edad.calculoEdad(edadElisa));
        System.out.println("Coco tiene: "+ edadCoco+ " años, y su edad humana es "+ edad.calculoEdad(edadCoco));
    }
}