import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class Main {
    
    public static void main(String[] args) {

        try {

            InputStream input = new FileInputStream("avion.png");
            ImageInputStream imageInput = ImageIO.createImageInputStream(input);
            BufferedImage imagenBuff = ImageIO.read(imageInput);


            System.out.println("IMPRESION IMAGEN EN RGB Y SISTEMA BINARIO");

            int alto = imagenBuff.getHeight();
            int ancho = imagenBuff.getWidth();


            for(int y = 0; y < alto; y++){
                for(int x = 0; x < ancho; x++){

                    int srcPixel = imagenBuff.getRGB(x, y);
                    Color auxColor = new Color(srcPixel);

                //Obtenemos los colores y almacenamos -> Valores RGB -> 0-255

                    int auxR = auxColor.getRed();
                    int auxG = auxColor.getGreen();
                    int auxB = auxColor.getBlue();

                    System.out.println("R: " + auxR + " G: " + auxG + " B: " + auxB);

                //Imprimimos en binario

                    System.out.println(
                        
                    "R: " + Integer.toBinaryString(auxR) + 
                    " G: " + Integer.toBinaryString(auxG) + 
                    " B: " + Integer.toBinaryString(auxB)
                    
                    );
                    System.out.println(""); //Salto de linea 


                }
            }
            System.out.println("\nAlto de la imagen: " + alto + "\nAncho de la imagen: " + ancho);


        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}