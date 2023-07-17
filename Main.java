import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         boolean verificador = false;
        while(true){
        System.out.println("Digite o acontecimento");
        String response = scanner.nextLine();
        response = response.replaceAll("\\s+", "");
        if(response.length() % 2 == 0){
            verificador = true;
        } else{
            verificador = false;
        }
        System.out.println(verificador);
    }
    }
}