import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //cria os bichos e os armazena num ArrayList
        ArrayList<Bicho> bichos = new ArrayList<>();

        bichos.add(new Bicho("avestruz", 1));
        bichos.add(new Bicho("aguia", 2));
        bichos.add(new Bicho("burro", 3));
        bichos.add(new Bicho("borboleta", 4));
        bichos.add(new Bicho("cachorro", 5));
        bichos.add(new Bicho("cabra", 6));
        bichos.add(new Bicho("carneiro", 7));
        bichos.add(new Bicho("camelo", 8));
        bichos.add(new Bicho("cobra", 9));
        bichos.add(new Bicho("coelho", 10));
        bichos.add(new Bicho("cavalo", 11));
        bichos.add(new Bicho("elefante", 12));
        bichos.add(new Bicho("galo", 13));
        bichos.add(new Bicho("gato", 14));
        bichos.add(new Bicho("jacare", 15));
        bichos.add(new Bicho("leao", 16));
        bichos.add(new Bicho("macaco", 17));
        bichos.add(new Bicho("porco", 18));
        bichos.add(new Bicho("pavao", 19));
        bichos.add(new Bicho("peru", 20));
        bichos.add(new Bicho("touro", 21));
        bichos.add(new Bicho("tigre", 22));
        bichos.add(new Bicho("urso", 23));
        bichos.add(new Bicho("veado", 24));
        bichos.add(new Bicho("vaca", 25));
        
        // sorteia a dezena
        int sorteado = random.nextInt(100);

        //se inicia o jogo
        System.out.println("JOGO DO BICHO\n");
        System.out.println("Digite o animal que quer apostar: ");

        String aposta = scanner.nextLine();
        String vencedor = null;
        
        //definido o animal vencedor apos o sorteio da dezena
        for (Bicho bicho : bichos) {
            ArrayList<Integer> getted = bicho.getDz();
            if(getted.contains(sorteado)){
                vencedor = bicho.nome;
            }
        }

        System.out.println("--------------------------------");

        if (aposta == vencedor) {
            System.out.println("Parabens! Você venceu!");
        } else{
            System.out.println("Poxa :( você perdeu.");
        }

        System.out.println("Dezena sorteada: " + sorteado);
        System.out.printf("Deu %s !", vencedor);
    }
}