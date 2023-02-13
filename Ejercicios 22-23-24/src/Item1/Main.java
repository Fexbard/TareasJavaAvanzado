package Item1;

public class Main {
    public static void main(String[] args) {
    Coche coche1 = new CocheElectrico();
        coche1.getMark("Volvo");
        coche1.getModel("Classic");
        coche1.getYear(2023);
        coche1.almacenarCoche(coche1);
    Coche coche2 = new Coche();
        coche2.getMark("Toyota");
        coche2.getModel("Corolla");
        coche2.getYear(2020);
        coche2.almacenarCoche(coche2);
    Coche coche3 = new Coche();
        coche3.getMark("Audio");
        coche3.getModel("Fancy");
        coche3.getYear(2018);
        coche3.almacenarCoche(coche3);
    CocheHibrido coche4 = new CocheHibrido();
        coche4.getMark("Suzuki");
        coche4.getModel("Alto");
        coche4.getYear(2011);
        coche4.setVoltage(220);
        coche4.almacenarCoche(coche4);
    }

}
