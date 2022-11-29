package unifatecie;
import java.util.Scanner;
public class Lista8ex10 {
 
 public static void main(String[] args) {
 
 Scanner input = new Scanner(System.in);
 
 String senha = "alfa2012";
 String tentativa;
 
 for(int x = 1; x <= 3; x++){
 
 System.out.print("Digite a senha: ");
 
 tentativa = input.nextLine();
 
 if(senha.equals(tentativa)){
 
 System.out.println("ACESSO PERMITIDO");
 break;
 
 } else{
 System.out.println("ACESSO NEGADO");
 }
 
 }
 
 }
 
}
