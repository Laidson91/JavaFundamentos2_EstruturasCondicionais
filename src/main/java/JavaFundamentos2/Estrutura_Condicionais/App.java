/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JavaFundamentos2.Estrutura_Condicionais;

import static java.time.Instant.now;
import static java.time.LocalDate.now;
import static java.time.LocalDateTime.now;
import static java.time.OffsetDateTime.now;

public class App {
   

    public static void main(String[] args) {
       // IF
       
       int num1 = 10, num2 = 30;
       if(num1 < num2){
           System.out.println("Número 1 é menor que número 2");
       }
       
       System.out.println("---------------------------------------");
       
       if(num1 > num2){
           System.out.println("Número 1 é maior que número 2");
       } else {
           System.out.println("Número 1 é menor que número  2");
       }
       
       System.out.println("---------------------------------------");
       
       //Condição composta - situação num1 < num2
        if(num1 > num2) {
            System.out.println("Número 1 é maior que número 2");
        } else if(num1 < num2) {
            System.out.println("Numero 1 e menor que número 2");
        } else {
            System.out.println("Número 1 é igual ao número 2");
        }
        
        System.out.println("---------------------------------------");
       
       //Condição composta - situação num1 = num2
       num1 = 10;
       num2 = 10;
        if(num1 == num2) {
            System.out.println("Número 1 é igual ao número 2");
        } else if(num1 < num2) {
            System.out.println("Numero 1 e menor que número 2");
        } else {
            System.out.println("Número 1 é maior que número 2");
        }
        
         System.out.println("---------------------------------------");
        // COMANDO CONDICIONAL SWITCH
        char opcao = '5';
        switch (opcao){
            case '1': {
                System.out.println("Chame programa de Inclusão");
                break;
            }
            case '2': {
                System.out.println("Chame programa de Alteração");
                break;
            }
            case '3': {
                System.out.println("Chame programa de Exclusão");
                break;
            }
            case '4': {
                System.out.println("Chame programa de Consulta");
                break;
            }
            default:
                System.err.println("Opção Inválida: " + opcao + ". Redigite!");           
            
        }
        
         System.out.println("---------------------------------------");
         
        // Laços de repetição
        //Comando WHILE laço pré-testado
        System.out.println("Comando WHILE");
        int qtdVezes = 1;
        while (qtdVezes <= 10) {
            System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
            qtdVezes++; // qtdVezes = qtdVezes + 1
        }
        System.out.println("Saí do laço e executei " + (qtdVezes-1) + " vezes");
        
        
        System.out.println("---------------------------------------");
        
        // Do WHILE laço pós-testado
        System.out.println("Comando DO ... WHILE");
        qtdVezes = 1;
        do {
            System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
            qtdVezes++; // qtdVezes = qtdVezes + 1
            
        } while(qtdVezes <= 10);  
          System.out.println("Saí do laço e executei " + (qtdVezes-1) + " vezes");
          
          
           System.out.println("---------------------------------------");
        
        // For
        System.out.println("Comando FOR");
        qtdVezes = 0;
        for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
             System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
             qtdVezes = qtdVezes1;
        }
          System.out.println("Saí do laço e executei " + (qtdVezes) + " vezes");
          
       
           System.out.println("---------------------------------------");
           
          for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
             System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
             if (qtdVezes1 == 5) {
                 System.out.println("Parei na " + qtdVezes1 + "ª vez");
                 break;
             }
        }
         
                
        
        
    }
 }

