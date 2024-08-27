import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static ArrayList<String> binaryArray = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un texto\n");


        String auxTexto = br.readLine();

        for(int i = 0; i < auxTexto.length() ; i++){ 

            char character = auxTexto.charAt(i); 
            int ascii = (int) character; 
            String binary = Integer.toBinaryString(ascii);

            binaryArray.add(binary);

            System.out.println("Letra: " + character + "   ASCII: " + ascii + "   Binario: " + binary + "\n");
        }        

        System.out.print(auxTexto + " en binario : ");
        for(int i = 0; i < binaryArray.size(); i++){
            System.out.print(binaryArray.get(i) + " ");
        }
    }
}