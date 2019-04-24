/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class PruebaLibro {
    public static void main(String[] args) {
        //Relacion de Dependencia
        ConjuntoLibro biblioteca = 
                new ConjuntoLibro();
        Libro libro = biblioteca.buscarMejorCalificado();
        if(libro !=null){
            System.out.println("El libro mejor calificado es " + libro.getTitulo());
        }else{
            System.out.println("No existen libros en su biblioteca");
        }
        //Dependencia
        Autor autor = new Autor("Gabriel", "Garcia");
        Libro nuevoLibro = new Libro("Cien", 300, 8);
        
        Autor autordos = new Autor("Pachito", "Cangrejo");
        Libro libro2 = new Libro("El libro pachito", 300, 10);
        libro2.setAutor(autordos);
        nuevoLibro.setAutor(autor);
        
        boolean resultado2 = biblioteca.anadirLibro(libro2);
        boolean resultado = biblioteca.anadirLibro(nuevoLibro);
        if(resultado == true){
            System.out.println("Insercion satisfactoria");
        }else{
            System.out.println("Problemas para insertar el libro");
        }
        libro = biblioteca.buscarMejorCalificado();
        if(libro !=null){
            System.out.println("El libro mejor calificado es " + libro.getTitulo());
        }else{
            System.out.println("No existen libros en su biblioteca");
        }
        
        
        //Listado de libros
        Libro [] libros = biblioteca.getLibros();
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] != null)
                System.out.println(libros[i].getTitulo());
        }
        
        //Eliminar libro
         resultado = biblioteca.eliminarLibroxTitulo("Cien");
         if(resultado == true)
             System.out.println("Se ha eliminado satisfactoriamente el libro");
         else 
             System.out.println("No se ha eliminado un libro con el titulo especificado");
        //...
        
        libros = biblioteca.getLibros();
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] != null)
                System.out.println(libros[i].getTitulo());
        }
        
    }
    
}
