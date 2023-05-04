/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeo;

/**
 *
 * @author jg702
 */
public class TiposTriangulo {
    double base;
    double altura;

    TiposTriangulo(double base, double altura){
        this.base=base;
        this.altura=altura;

    }
    double calcularArea(){
        return (base * altura / 2);

    }
    double calcularPerimetro(){
        return (base+altura+calcularHipotenusa());

    }
    double calcularHipotenusa(){
        return (Math.pow(base*base+altura*altura, 0.5));
    }
    String determinarTipoTriangulo(){
        if ((base==altura) && (base==calcularHipotenusa()) && (altura==calcularHipotenusa())){
            return("El triangulo es equilatero.");
        }else if((base!=altura) && (base!=calcularHipotenusa()) && (altura!=calcularHipotenusa())){
            return("El triangulo es escaleno.");
        }else{
            return("El triangulo es isosceles.");
        }
    }
}
