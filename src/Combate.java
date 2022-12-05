import java.util.Random;
import java.util.Scanner;

public class Combate {
    public static Scanner ler = new Scanner(System.in);
    public static Random rand = new Random();

    public static int[] GUERREIRO = {150,15};


    public static boolean iniciativa(){
        int iniciativa_Jogador = rand.nextInt(20)+1;
        int iniciativa_Inimigo = rand.nextInt(20)+1;

        if(iniciativa_Jogador > iniciativa_Inimigo){
            System.out.println("Você foi mais agil e sacou a espada para atacar primeiro");
            return true;

        } else{
            System.out.println("O inimigo te detectou antes de você puder vê-lo");
            return false;
        }
    }

    public static int ataque_Dado10(int dano){
        int d10 = rand.nextInt(10)+1;

        if(d10 > 2 && d10 < 9){
            System.out.println("Você acerta a criatura");
            return dano; //Ataque Normal
        } else if (d10 == 2) {
            System.out.println("A criatura consegue esquivar parcialmente do seu ataque");
            return (int) (dano *0.7); // Ataque fraco

        } else if (d10 == 1) {
            System.out.println("A criatura consegue esquivar totalmente do seu ataque");
            return 0; //errou o ataque

        } else if (d10 == 9) {
            System.out.println("Você acerta uma parte vital da criatura desferindo muito dano");
            return (int) (dano*1.5); //Ataque forte

        }  else {
            System.out.println("Você acertou diversos orgãos do corpo da criatura causando varios danos CRITICO!!!!");
            return dano*2; // critico
        }
    }

    public static int defesa_Dado10(int dano_Inimigo){
        int d10 = rand.nextInt(10)+1;

        if(d10 > 2 && d10 < 9){
            return dano_Inimigo; //Defesa normal
        } else if (d10 == 2) {
            return (int) (dano_Inimigo *0.7); // Defesa fraco

        } else if (d10 == 1) {
            return dano_Inimigo; //Sem defesa

        } else if (d10 == 9) {
            return (int) (dano_Inimigo*0.3); //Defesa forte

        }  else {
            return 0; // Defesa Perfeita
        }
    }

    public static void iniciarCombate (){
        while (GUERREIRO[0] != 0){

            System.out.println("1. ataque");
            System.out.println("2. defender");
            int condicao = ler.nextInt();
            switch (condicao){
                case 1:
                    ataque_Dado10();
                    break;
                case 2:
                    defesa_Dado10();

                default:
                    System.out.println("ação inexistente");
            }

        }

    }

    public static void main(String[] args) {

    }
}
