
package ejbiblioteca;

import java.util.Objects;

public class Autor {

    private String nombre;
    private String pais;
    private Libro [] libro;
    static int [] listaFav = new int [10]; //Arreglo de libros favoritos 
    static int c; //Contador global de libros 
    static int c3; //Contador global de autores
    static boolean fav ; //Booleano que indicara cuando se ha encontrado coincidencia de autores 
    static int i =0; //Entero declarado e inicializado para poder tener un punto de partida en el bucle que itera por los favoritos 

    public Autor(String nombre, String pais, Libro[] libro) {
        this.nombre = nombre;
        this.pais = pais;
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Libro[] getLibro() {
        return libro;
    }

    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }





    @Override
    public String toString() {
        String b="\nAutor: " + this.nombre + "\nNacionalidad: " + this.pais;

        if(fav==true ){
        
            b += this.libro[c3];
        }else{
            b += this.libro[listaFav[i]];
        }
        
        
        return b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }






}

