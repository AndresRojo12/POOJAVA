
package Actividad_de_Aprendizaje2;
 
import java.util.Scanner;

public class Menu_opciones {
    private String[]menuopcion={"Ingrese datos de personas","Mostrar nombres","Retornar Promedio","Retornar Genero","Retornar Nombre","Retornar numero de personas del genero masculino","Retornar numero de personas del genero femenino"};
    
     public void show(){
  try{
  Scanner entrada = new Scanner (System.in);
  int numero;
  String nombre,apellido,genero;
  int edad;
  int suma=0;
  int promedio_edad=0;
  int genero_masculino=1;
  int genero_femenino=1;
  Persona[] personas = new Persona[5];
  do {
			System.out.println("Gestion de Personas");
			System.out.println("=======================");
			System.out.println("Datos de Personas\n\n");
			System.out.println("Menu de opciones");
			numero = 0;
			for (String menu : menuopcion) {
				System.out.println("\t" + ++numero + "." +menu);
			}
			System.out.println("\t0. Salir");
			System.out.println("Ingrese opcion : ");
		  numero = entrada.nextInt();
                  
		  switch (numero) {
		    case 1: 
        for (int i=0; i < personas.length; 
        i++){
              System.out.println("Ingrese nombre de  persona " + (i+1));
              nombre = entrada.next();
              System.out.println("Ingrese apellido de persona " + (i+1));
              apellido = entrada.next();
              System.out.println("Ingrese genero de persona(M:Hombre,F:Mujer ) " + (i+1));
              genero = entrada.next();
              System.out.println("Ingrese edad de persona " + (i+1));
              edad = entrada.nextInt();
              personas[i] = new Persona(nombre,apellido,genero, edad);
          }
		    	break;
		    case 2:
          for (int i=0; i < personas.length; i++){ 
            System.out.println(personas[i].getNombre());
              System.out.println(personas[i].getApellido());
              System.out.println(personas[i].getGenero());
              System.out.println(personas[i].getEdad());
          }
          break;
          case 3:
           suma=0;
             for (int i=0; i < personas.length; i++){
                 suma=suma+(personas[i].getEdad());
                 promedio_edad=(int)suma/5;
          }
           System.out.println("La suma de las edades es:"+suma);
              System.out.println("La edad promedio es:"+promedio_edad);
              
          { 
            
          }
         break;
         case 4:
         for (int i=0; i < personas.length;i++){
             System.out.println(personas[i].getGenero());
         }
      
         break;
	 case 5:
         for (int i=0; i < personas.length;i++){
             System.out.println(personas[i].getNombre());
         }    
             
         break;
         case 6:
             genero_masculino=0;
             for(int i=0; i< personas.length;i++){
                 genero_masculino=(int)i++;  
             }
             System.out.println("la cantidad de hombres es"+genero_masculino);
          break;
         case 7:
             genero_femenino=0;
          for(int i=0; i< personas.length;i++){
                genero_femenino=(int)i++;
             }
            System.out.println("la cantidad de mujeres es"+genero_femenino);
		    }
		} while (numero != 0);
}
catch (Exception e)
{
    
}
}

    }

   
   

     
  
   
   
  

