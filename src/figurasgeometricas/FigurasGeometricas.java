package figurasgeometricas;

/**
 *
 * @author ekt
 */
import java.util.Scanner;
public class FigurasGeometricas {
double area;
    
public void areacirculo(double radio){
    area= ((3.1416)*(radio*radio));
    System.out.println("El area del Circulo es: " + area);
}

public void areacuadrado(double lado){
    area= lado*lado;
    System.out.println("El area del Cuadrado es: " + area);
}
public void areatriangulo(double base, double altura){
    area= (base*altura)/2;
    System.out.println("El area del Triangulo es: " + area);
}

public void arearectangulo(double ancho,double largo){
    area= ancho* largo;
    System.out.println("El area del Rectangulo es: " + area);
}

public void areaesfera(double radio){
    area= ((4*3.1416)*(radio*radio));
    System.out.println("El area de la Esfera es: " + area);
}

public void areacubo(double lado){
    area= (6*(lado*lado));
    System.out.println("El area del circulo es: " + area);
}
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
      boolean salir = false;
       int Opc;
       
      while (!salir){
       System.out.println("Este programa te ayuda a calcular el area de algunas Figuras geometricas");
       System.out.println("");
       System.out.println("-- Menu --");
       System.out.println("1- Area del Circulo");
       System.out.println("2- Area del Cuadrado");
       System.out.println("3- Area del Triangulo");
       System.out.println("4- Area del Rectangulo");
       System.out.println("5- Area del Esfera");
       System.out.println("6- Area del Cubo");
       System.out.println("7- Salir");
       System.out.println("");
       System.out.println("Ingrese la opcion deseada");
       Opc=s.nextInt();
       
       switch(Opc){
           case 1:
               System.out.println("Ingrese el radio del Circulo: ");
               
               FigurasGeometricas areacirculo= new FigurasGeometricas();
               areacirculo.areacirculo(s.nextDouble());
               break;
           case 2:
               System.out.println("Ingrese cuanto mide el lado del cuadrado: ");
               
               FigurasGeometricas areacuadrado = new FigurasGeometricas();
               areacuadrado.areacuadrado(s.nextDouble());
                break;
           case 3:
               System.out.println("Ingrese la base del triangulo: ");
               System.out.println("Ingrese la altura del triangulo: ");
               
               FigurasGeometricas areatriangulo= new FigurasGeometricas();
               areatriangulo.areatriangulo(s.nextDouble(),s.nextDouble());  
                break;
           case 4:
               System.out.println("Ingrese el ancho del rectangulo: ");
               System.out.println("Ingrese el largo del rectangulo: ");
               
               FigurasGeometricas arearectangulo= new FigurasGeometricas();
               arearectangulo.arearectangulo(s.nextDouble(),s.nextDouble());
                break;
           case 5:
               System.out.println("Ingrese el radio de la esfera: ");
               
               FigurasGeometricas areaesfera= new FigurasGeometricas();
               areaesfera.areaesfera(s.nextDouble());
                break;
           case 6:
               System.out.println("Ingrese la medida de la arista del cubo: ");
               
               FigurasGeometricas areacubo= new FigurasGeometricas();
               areacubo.areacubo(s.nextDouble());
                break;
           case 7:
               salir=true;
               break;
           default:
               System.out.println("Error");
               System.out.println("Opcion invalida");
               break;
       }
       
      }
    System.out.println("Muchas gracias por usar el programa");
    System.out.println("Vuelva pronto... :3");
    }
    
}