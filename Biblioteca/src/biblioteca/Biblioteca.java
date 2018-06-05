/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.Scanner; 
/**
 *
 * @author ESFOT
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan= new Scanner (System.in); 
        Libro [] lista_libros = new Libro[10];  
        Libro [] lista_fav= new Libro[10]; 
        Autor [] lista_aut = new Autor[10]; 
       // Autor [] datos_autor = new Autor [20];
        int i=0; 
        int opc=0;
        int num_fav=0; 
        do{
        System.out.println("###BIBLIOTECA###");
        System.out.println("1. Ingresar nuevo libro");
        System.out.println("2. Lista de favoritos");
        System.out.println("3. Lista autores");
         System.out.println("4. Salir");
        System.out.println("Ingrese la opcion deseada: ");
       
        opc= scan.nextInt(); 
        switch(opc){
        
        case 1: 
                
                if(i==2){
                   System.out.println("NO PUEDE INGRESAR MÁS LIBROS!");
                   System.out.println("");
                   break; 
               }
                
               scan.nextLine(); 
               do{
                   System.out.println("Ingreso de nuevo libro");
                   System.out.println("Libro" + (i+1));
                   System.out.println("Titulo: ");
                   String titulo= scan.nextLine();
                   System.out.println("Autor: ");
                   System.out.println("Nombre: ");
                   String nombreAutor= scan.nextLine();
                   System.out.println("Pais: ");
                   String pais= scan.nextLine(); 
                   lista_aut[i] = new Autor(nombreAutor, pais); 
                   System.out.println("Año: ");
                   int anio= scan.nextInt();
                   scan.nextLine(); 
                   System.out.println("Favorito: " + "Digite 1 si es favorito, 0 si no lo es");
                   int fav= scan.nextInt(); 
                   lista_libros[i]= new Libro(titulo, lista_aut[i], anio, fav); 
                   
                   if(fav==1){
                       System.out.println("Añadido a favoritos");
                       num_fav++; 
                       lista_fav[i]= new Libro(titulo, lista_aut[i], anio); 
                       System.out.println("Libro " + (i+1));
                       System.out.println(lista_fav[i]);
                   }
                   
                   i++;
                   System.out.println("Numero de libros: " + i);
               }while(i<1);
               
               
               break;
        case 2:
            System.out.println("Lista de favoritos");
             for(int j=0; j<lista_fav.length;j++){
             System.out.println(lista_fav[j]);
        }
             break; 
             
        case 3: 
           System.out.println("Lista de autores: "); 
            for(int k=0; k<lista_aut.length; k++){
          
            System.out.println(lista_aut[k]);
            
            }
    }
        }while(opc!=4 && i<10);  
        
    }
}
    

