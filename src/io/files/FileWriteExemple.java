package io.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteExemple {
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter( "arquivo.txt"))) {
            writer.write("Olá, mundo!");
            writer.newLine();
            writer.write("Segunda linha.");
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
