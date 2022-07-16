
package com.mycompany.examenfinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) throws IOException {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalTime hora = LocalTime.now();
        ListaRecursivo list = new ListaRecursivo();
        Date fechaActual = new Date();
         int total = 0;
         Scanner leer = new Scanner(System.in); 
         PilaTramites pi = new PilaTramites();
        Cola colita = new Cola();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       String[][] nombre ={{"Silvestre","Andrés López","Andreina Gonzalez","Maria Perez","Armando Paredes"},
           {"8","1","5","0","10"}};
       String[][] per = new String[1][1];
       // Ejercicio 1
       System.out.println("0: el cliente no atendió.\n" +
                                  "1~4: no satisfecho.\n" +
                                  "5: neutro.\n" +
                                   "6~8: satisfecho.\n" +
                                   "9~10: muy satisfecho.");
           for (int i = 0; i < per.length; i++) {
               for (int j = 0; j < per.length; j++) {
                     if (nombre[1][0].equals("8") || nombre[1][0].equals("6") ||  nombre[1][0].equals("7") ) {
                   System.out.println("\n Silvestre esta satisfecho");
               }
               
               if (nombre[1][1].equals("1") ||nombre[1][1].equals("2") || nombre[1][1].equals("3") ||nombre[1][1].equals("4")) {
                    System.out.println("\n Andrés López no está satisfecho satisfecho");
               }
               
               if (nombre[1][2].equals("5")) {
                   System.out.println("\n Andreina Gonzalez es neutro");
               }
               if (nombre[1][3].equals("0")) {
                   System.out.println("\n Maria Perez no fue atendida");
               }
               
                if (nombre[1][4].equals("9") || nombre[1][4].equals("10")) {
                   System.out.println("\n Armando Paredes esta muy satisfecho");
               }          
               }
              
             
       }   
           // Aqui termina el ejercicio 1
           
           //Comienzo del ejercicio 2
           System.out.println("Ejercicio 2");
           list.GuardarRecursivo(list.L, "Luis");
             list.GuardarRecursivo(list.L, "Maria");
               list.GuardarRecursivo(list.L, "Chantal");
               list.GuardarRecursivo(list.L, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam pulvinar metus libero, in pretium massa molestie ac. Cras porttitor magna eget metus iaculis, sit amet");
               
               System.out.println("Los datos de la lista son: "+list.Imprimir(list.L)+"\n");
           
            //Termina el ejercicio 2
           //Comienzo del ejercicio 3
           int a = 0;
           int tiem1 = 0 ;
           int tiem2 = 0;
           int tiem3 = 0;
           int limite = 0;
           int limite2 = 0;
           int limite3 = 0;
        
           System.out.println("Ejercicio 3");
           do{
               System.out.println("1. Ingresar personas\n"
                       + "2. Hacer cedulación\n"
                       + "3. cita de pasaporte\n"
                       + "4. retiro de documentos\n"
                       + "5. Ver cola\n"
                       + "6. Atender \n"
                       + "0 Salir ");
               a = leer.nextInt();
               switch(a){
                   
                   case 1:
                       if (colita.vacio()) {
                             try (
                       
                            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\ExamenFinal\\src\\main\\java\\com\\mycompany\\examenfinal\\TramitesClientes.txt", true));
                            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\ExamenFinal\\src\\main\\java\\com\\mycompany\\examenfinal\\Clientes.in"));) {

                        bw.flush();
                        String linea;
                       
                    
                        while ((linea = br.readLine()) != null) {
                            colita.Encolar(linea);

                        }
                    } catch (IOException e) {
                        System.out.println("ERROR E/S: " + e);
                    }
                           break;
                       }else{
                           System.out.println("Espero que se atiendan a todos");
                       }
           
                           
                   case 2: 
                       if (limite < 1) {
                             if (!colita.vacio()) {
                              pi.Apilar("Cedulación");
                              limite++;
                       if (a == 2) {
                             tiem1 = 15;
                       }else{
                            tiem1 = 0;
                       }
                       }else{
                           System.out.println("No hay gente");
                       }
                       }else{
                           System.out.println("Solo puede solicitar un tramite de cada uno");
                       }
                     
                   
                    
                       break;
                       
                        case 3: 
                            if (limite2 < 1) {
                                 if (!colita.vacio()) {
                                  pi.Apilar("Cita de pasaporte");
                                  limite2++;
                            if (a == 3) {
                                 tiem2 = 20; 
                            }else{
                                tiem2 = 0; 
                            }
                            }else{
                                System.out.println("No hay gente");
                            }  
                            }else{
                                System.out.println("Solo puede solicitar un tramite de cada uno");
                            }
                         
                    
                       break;
                        case 4:
                            if (limite3 < 1) {
                                
                               
                                   if (!colita.vacio()) {
                                  pi.Apilar("Retiro de documentos");
                                   limite3++;
                            if (a == 4) {
                                    tiem3 = 3; 
                            }else{
                                tiem3 = 0;  
                            }
                            }else{
                                System.out.println("No hay gente");
                            }
                          
                                
                            }else{
                                 System.out.println("Solo puede solicitar un tramite de cada uno");
                            }
                         
                       
                            break;
                       
                        case 5:
                            if (!colita.vacio()) {
                                  System.out.println("Las personas son: "+colita.mostrar());
                            }else{
                                System.out.println("No hay gente");
                            }
                           
                            break;
                            
                        case 6:
                            if (!colita.vacio()) {
                                  try (
                       
                            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\ExamenFinal\\src\\main\\java\\com\\mycompany\\examenfinal\\TramitesClientes.txt", true));
                            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\ExamenFinal\\src\\main\\java\\com\\mycompany\\examenfinal\\Clientes.in"));) {
                                 total = tiem1 + tiem2 + tiem3;
                                   if (!colita.vacio()) {
                            bw.write("\r\n" + sdf.format(fechaActual) + " " + hora + "\r" + "\n");  
                          }
                                      if (pi.size == 0 && !colita.vacio()) {
                                           bw.write("El cliente: "+colita.Primero()+" No realizo ningun tramite"+"\r\n");
                                      }
                                 if (pi.size == 1) {
                                    bw.write("El cliente: "+colita.Primero()+" Solicito estos tramites: "+pi.pila1()+" El tiempo fue: "+total+"minutos"+"\r\n");
                                 }
                                 
                                 if (pi.size == 2) {
                                       bw.write("El cliente: "+colita.Primero()+" Solicito estos tramites: "+pi.pila1()+"-"+pi.pila2()+" El tiempo fue: "+total+"minutos"+"\r\n");
                                 }
                                  if (pi.size == 3) {
                                       bw.write("El cliente: "+colita.Primero()+" Solicito estos tramites: "+pi.pila1()+"-"+pi.pila2()+"-"+pi.pila3()+" El tiempo fue: "+total+"minutos"+"\r\n");
                                 }

                        bw.flush();
                        int valor = br.read();
                        while (valor != -1) {

                            valor = br.read();
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR E/S: " + e);
                    }
                     
                    colita.Atender();
                 
                    pi.borraRapido();
                    limite --;
                    limite2 --;
                    limite3--;
                     tiem1 = 0;
                     tiem2 = 0;
                     tiem3 = 0;
                     total = 0;
                     pi.size = 0;
                            }else{
                                System.out.println("No hay gente");
                            }
                           
                                
                            
                           break;
                           
               }
               
           }while(a != 0);
        
           
          
}
      
        
    }
    

