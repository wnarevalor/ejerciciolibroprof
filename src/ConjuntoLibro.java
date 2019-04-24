/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    //Asociacion cardinalidad 10 
    //(Tamano Maximo conocido)
    private Libro[] libros;

    public ConjuntoLibro() {
       //Liberando la memoria maxima
       this.libros = new Libro[10];
    }
    
    public boolean anadirLibro(Libro libro){
        for (int i = 0; i < this.libros.length; i++) {
            if(this.libros[i]==null){
              this.libros[i] = libro;
              return true;
            }
        }
        return false;
    }
    
    public boolean eliminarLibroxTitulo(String titulo){
        for (int i = 0; i < this.libros.length; i++) {
            if(this.libros[i]!=null && this.libros[i].getTitulo().equals(titulo)){
               this.libros[i] = null;
               return true;
            }
        }
        return false;
    }
    
    public Libro buscarMejorCalificado(){
      Libro mejor = null;
        for (int i = 0; i < this.libros.length; i++) {
            if(this.libros[i]!=null) {
               if(mejor == null) mejor = this.libros[i];
               else{
                   if(this.libros[i].getCalificacion() > mejor.getCalificacion()){
                       mejor = this.libros[i];
                    }
                }  
            }
         }
       return mejor;
    }
    public Libro[] getLibros(){
      return this.libros;
    }
}
