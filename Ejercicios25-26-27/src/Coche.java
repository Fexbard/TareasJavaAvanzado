public class Coche implements Vehiculo{

    String mark;
    String model;
    int year;
    public void Coche(String mark, String model, int year){
    this.mark = mark;
    this.model = model;
    this.year = year;
    }

    public String getMark(String mark) {
        return mark;
    }

    public String getModel(String model) {
        return model;
    }
    public int getYear(int year) {
        return year;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
