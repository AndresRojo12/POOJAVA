
package Actividad_de_Aprendizaje2;

import java.util.Scanner;


public class Persona {

   private String nombre;
   private String apellido;
   private String genero;
   private int edad;
   private String genero_masculino;
   private String genero_femenino;
   
    public Persona(String nombre,String apellido,String genero,int edad){
        
        this.nombre=nombre;
        this.apellido= apellido;
        this.genero= genero;
        this.edad= edad;
        
    } 
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
       return this.nombre;
    }
    public void setApellido(){
        this.apellido=apellido;
    }
    public String getApellido(){
       return this.apellido;
    }
         
    public void setEdad(int edad){
        this.edad=edad;    
    }   
    public int getEdad(){
       return this.edad; 
    }       
    public void setGenero(){
      this.genero=genero;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero_masculino(){
    this.genero_masculino=genero_masculino;
    }
    public String getGenero_masculino(){
    return this.genero_masculino;
    }
     public void setGenero_femenino(){
    this.genero_femenino=genero_femenino;
    }
    public String getGenero_femenino(){
    return this.genero_femenino;
    }      
}   

 
