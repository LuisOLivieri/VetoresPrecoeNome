import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Numeros de produtos
        Products[] vect = new Products[n]; //Declaracao Vetor

        for(int i = 0; i < vect.length; i++) { //vect.length
            sc.nextLine(); //Quebra de linha
            String name = sc.nextLine(); //Entrar nome
            double price = sc.nextDouble(); //Entrar valor
            vect[i] = new Products(name, price); //VECT[I] aponta o novo objeto stanciado. 
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice(); //Acessando o vetor na posição I
        }

        double avg = soma/vect.length;
        System.out.println("Average price: " + avg);


        sc.close();
    }
}
//EXEMPLO
//? Acessando o valor do vetor na posição i, e para pegar apenas o valor(price) do objeto usamos o get.price.
//Vetor na posição 0 = TV 900.00
