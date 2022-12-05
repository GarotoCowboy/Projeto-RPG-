import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Cenario {


    public static Scanner ler = new Scanner(System.in);
    public static Random rand = new Random();

    public static int[] GUERREIRO = {150,15};
    //indice 0 é a vida.
    //indice 1 é o ataque.

    //public static int experiencia;

    public static int[] ALVO_TESTE = {15, 6};
    //PARA FINS DE TESTE COM ATAQUE :)

    public static void Guerreiro_Subir_Nivel(int x, int y){
        GUERREIRO[0] = x;
        GUERREIRO[1] = y;
    }

    /*public static void subirNivel (){
        if(experiencia == experiencia*2){
            System.out.println("Você fica mais forte");
        }
    }*/


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

    private static void introducao_Da_Historia() {
        File file = new File("C:\\Users\\rocha\\IdeaProjects\\Rpg\\src\\Introducao.txt");
        try (FileReader fr = new FileReader(file)) {

            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    //Terminar os metodos do cenario 1,2,3 e 4 para terminar esse metódo.
    public static void escolher_Cenario(int count) {
        int aleatorio = rand.nextInt(4) + 1;

        count++;
        switch (aleatorio) {
            case 1:
                System.out.println("Você entrou na porta" + count);
                break;
            case 2:
                System.out.println("Você escolheu a porta" + count);
                break;
            case 3:
                System.out.println("Você escolheu a porta" + count);
                break;
            case 4:
                System.out.println("Você escolheu a porta:" + count);
                break;

        }
    }

    //Terminar esse metodo.
    public static void cenario1() {
//descrição do cenario1
        File file = new File("C:\\Users\\rocha\\IdeaProjects\\Rpg\\src\\Cenario1.txt");
        try (FileReader fr = new FileReader(file)) {
            int i;

            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (IOException e) {

        }

    }


    public static void main(String[] args) {
        System.out.println(GUERREIRO[0]);
        System.out.println(GUERREIRO[1]);

        int vida = 30,ataque = 6;

        Guerreiro_Subir_Nivel(GUERREIRO[0]+vida,GUERREIRO[1]+ataque);

        System.out.println(GUERREIRO[0]);
        System.out.println(GUERREIRO[1]);
    }
}
