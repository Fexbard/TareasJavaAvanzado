public class CocheHibrido extends  Coche{
    String combustible;
    int voltage;

    public void CocheHibrido(int voltage) {
        this.voltage = voltage;
    }
    public void CocheHibrido(String combustible, int voltage) {
        this.combustible = combustible;
        this.voltage = voltage;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}
