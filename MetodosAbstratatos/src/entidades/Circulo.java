package entidades;

import entidades.enums.Color;

public class Circulo extends Forma {

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    private Double raio;

   public Circulo(){
       super();
   }

   public  Circulo(Color color, Double raio){
       super(color);
       this.raio = raio;
   }







    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
