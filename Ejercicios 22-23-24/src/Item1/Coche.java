package Item1;

public class Coche extends Vehiculo{
    CocheBD cocheBD = new CocheBD();


    public void Coche(){}

    public void almacenarCoche(Coche coche){
     cocheBD.guardarCoche(this);
    }
}