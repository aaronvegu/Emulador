package Lexico;

import java.io.File;
import java.io.IOException;

public class Generador {
    public static void main(String[] args) throws IOException, Exception {
        //String pathFlex="C:\\Users\\7053\\Documents\\NetBeansProjects\\UEDL_COMPILADORES\\src\\sintactico\\java_lexico_sintactico.jflex";

        String pathFlex="src/Lexico/PyEsp.flex";
        File file=new File(pathFlex);
        jflex.Main.generate(file);
        String[] parametrosLex = {pathFlex};
        jflex.Main.generate(parametrosLex);
        
      

        //String[] parametros = {"-parser", "Sintactico", "C:\\Users\\7053\\Documents\\NetBeansProjects\\UEDL_COMPILADORES\\src\\sintactico\\sintactico.cup"};
        //String[] parametros = {"-destdir", "src/Lexico","-parser", "ParserJava",
            //"-progress", "src/lexico/tokens.cup"};
        //java_cup.Main.main(parametros);
        
    }
    
   
}
