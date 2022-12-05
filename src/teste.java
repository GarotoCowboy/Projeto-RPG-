import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("C:\\Users\\rocha\\IdeaProjects\\Rpg\\src\\Introducao.txt"));
        String linha = input.nextLine();
        Random rand = new Random();
        int count = rand.nextInt(10) + 1;
        if (linha.indexOf(String.valueOf(input)) == count){
            System.out.println(linha.substring(count));
        }
    }
}
