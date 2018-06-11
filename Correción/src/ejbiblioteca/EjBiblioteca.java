package ejbiblioteca;

import java.util.Scanner;

public class EjBiblioteca {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int opc=0;
        Autor.c=0; //Contador de libros 
        int c2=0; //Contador de libros favoritos 
        boolean canterior;
        Autor [] listaAut = new Autor[10]; //Arreglo de autores 
        int nlibros []= new int [10]; //Arreglo de libros de un mismo autor
        int r =0; 
        //int t ;
        Libro [] libro = new Libro [10]; //Arreglo de libros 
        int contador =0; //Contador de libros de un mismo autor

        do{
            System.out.println("\tRegistro de Biblioteca");
            System.out.println("1. Ingresar nuevo libro");
            System.out.println("2. Ver favoritos");
            System.out.println("3. Ver autores con sus libros");
            System.out.println("4. Salir");
            System.out.println("Digite la opción deseada: ");

            opc=scan.nextInt();


            switch(opc){
                case 1:
                    if(Autor.c<=10){
                        System.out.println("\tINGRESO DE NUEVO LIBRO");
                        System.out.println("***Libro #" + (Autor.c+1));
                        scan.nextLine();
                        System.out.println("Nombre del Autor: ");
                        String nombreAutor= scan.nextLine();
                        System.out.println("Nacionalidad: ");
                        String pais= scan.nextLine();
                        
                        System.out.println("Nombre del libro " + (Autor.c+1)+ ": ");
                        String nombreLibro= scan.nextLine();
                        System.out.println("Año: ");
                        int anio= scan.nextInt();
                        System.out.println("Favorito: ");
                        String dec= scan.next();

                        if(dec.equals("si") || dec.equals("SI") || dec.equals("sI") || dec.equals("Si")){
                            Autor.listaFav[c2]=Autor.c; //Almacenamos la posicion en la que se encuentra el favorito
                            c2++; //Aumentamos c2 para agrandar el tamaño del arreglo de favoritos
                            System.out.println("Añadido a favoritos"); 
                            System.out.print("\n");
                        }


                        libro[Autor.c]= new Libro(nombreLibro,anio); //Almacenamos el libro en el arreglo de libros con su nombre y año
                        listaAut[Autor.c]= new Autor(nombreAutor, pais, libro); //Almacenamos el autor en el arreglo de autores con su nombre, pais 
                                                                                 //libro se refiere al arreglo de libros de la linea 58
                        Autor.c++; //Aumentamos en 1 el contador de libros 

                    }

                    break;

                case 2:
                    
                    Autor.fav = false;
                    
                    System.out.println("\tLISTA DE FAVORITOS ");
                    

                    for ( Autor.i=0 ; Autor.i<c2 ; Autor.i++){ //Criterio de parada c2 que es la cantidad de favoritos contabilizados en el caso 1.
                        
                        System.out.println("***Libro favorito #" + (Autor.i+1));
                        System.out.println(listaAut[Autor.listaFav[Autor.i]]); //Imprimimos la lista de autores que ya viene con los libros todo esto en la posicion i.
                        System.out.print("\n");
                    }

                    break;

                case 3:
                    Autor.c3=0; //Contador de autores 

                    Autor.fav = true;
                    for(int j =0; j<Autor.c ; j++){ //El bucle va a iterar hasta la cantidad de libros ingresados (Todos los libros tienen autores, repetidos o no) 

                        System.out.println("Libro #" +(j+1));
                        System.out.println(listaAut[j]); 
                        Autor.c3++;
                        System.out.print("\n");
                    }
                    
                    r=0;
                    for ( int k = 0; k < Autor.c; k++) { //Bucle que compara los autores
                        
                        contador=0;
                        canterior =true;
                        
                        for (int m = 0; m < k; m++) { 
                                   
                            
                            if (listaAut[k].equals(listaAut[m])){ //Compara los autores, en nombre, pais y libros 
                                canterior = false; //Si son iguales el bool cambia a false lo que hace que deje de volver a comparar con posiciones anteriores                       
                            }
                               
                        }
                        
                        if (canterior == true){ //Si no son iguales el  bool sigue en true e ingresa en este if
                        for (int o = k; o < Autor.c; o++) {
                            
                            if (listaAut[k].equals(listaAut[o])){ //Vuelve a comparar los autores y si son iguales
                                contador++; //Aumenta el contador 
                                nlibros [r]=contador; //Almacena el valor de contador, es decir el numero de autores repetidos 
                                
                            }
                            
                        }
                        
                        r++; //Aumenta r para agrandar el espacio de nlibros, el arreglo de libros de un mismo autor     
                        
                        }
                    }
                    
                   
                    for (int n = 0; n < r; n++) {
                                
                                System.out.println("Número de Libros de autor #" + (n+1) + ":"+nlibros [n] ); //Impresion del numero de libros de cada autor
                                
                            }

                    break;
                case 4:
                    
                    System.out.println("Adios");
                    break;
                default:

                    break;
            }
        }while(opc!=4);


    }

}
