/*
 * Joaquin Bello
 */

public class Ejercicio03 {
  
  public static void main (String args[]) {
    
    int salario;
    
    System.out.print("Número del día de la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (dia){
      case 1:
        System.out.print("Lunes");
      break;
      case 2:
        System.out.print("Martes");
      break;
      case 3:
        System.out.print("Miércoles");
      break;
      case 4:
        System.out.print("Jueves");
      break;
      case 5:
        System.out.print("Viernes");
      break;
      case 6:
        System.out.print("Sábado");
      break;
      case 7:
        System.out.print("Domingo");
      break;
      default:
        System.out.print("Error, día de la semana incorrecto");
    }
  }
}

