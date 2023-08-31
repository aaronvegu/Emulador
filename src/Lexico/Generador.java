package Lexico;

import java.io.File;
import java.io.IOException;
public class Generador {
    public static void main(String[] args) throws IOException {
        // Specify the path to the JFlex file
        String pathFlex = "src/Lexico/PyEsp.flex";

        // Generate the Lexer using JFlex
        jflex.Main.generate(new File(pathFlex));

        // Specify the path to the CUP file
        String pathCup = "src/Lexico/parser.cup";

        // Generate the Parser using CUP
        String[] parametrosCup = {"-parser", "Parser", "-destdir", "src/Lexico", pathCup};
        java_cup.Main.main(parametrosCup);

        System.out.println("Lexer and Parser generated successfully.");
    }
}

