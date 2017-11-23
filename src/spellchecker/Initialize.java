/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellchecker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 *
 * @author ITRO
 */
public class Initialize {

    private HashSet<String> tagalog_list = new HashSet<>();
    private HashSet<String> english_list = new HashSet<>();
    private HashSet<String> word_trigram_list = new HashSet<>();

    public Initialize() {

        tagalog_list = readResource("Filipino_wordlist.txt");
        english_list = readResource("English_wordlist.txt");
    }

    private HashSet<String> readResource(String fileName) {
        String filePath = System.getProperty("user.dir") + "//resource//" + fileName;

        HashSet<String> wordList = new HashSet<>();
        String currentLine;
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            while ((currentLine = read.readLine()) != null) {
                wordList.add(currentLine);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return wordList;
    }
}
