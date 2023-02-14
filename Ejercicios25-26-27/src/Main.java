public class Main {
    public static void main(String[] args) {
    Coche coche1 = new CocheElectrico();
    ExtraCocheBD cocheBD = new ExtraCocheBD();
        coche1.getMark("Volvo");
        coche1.getModel("Classic");
        coche1.getYear(2023);

        cocheBD.guardarCoche(coche1);
    Coche coche2 = new Coche();
        coche2.getMark("Toyota");
        coche2.getModel("Corolla");
        coche2.getYear(2020);
        cocheBD.guardarCoche(coche2);
    Coche coche3 = new Coche();
        coche3.getMark("Audio");
        coche3.getModel("Fancy");
        coche3.getYear(2018);
        cocheBD.alertarDuplicado("coche3");
        cocheBD.guardarCoche(coche3);
    CocheHibrido coche4 = new CocheHibrido();
        coche4.getMark("Suzuki");
        coche4.getModel("Alto");
        coche4.getYear(2011);
        coche4.setVoltage(220);
        cocheBD.alertarDuplicado("coche1");
        cocheBD.guardarCoche(coche4);
    }

}
