package br.com.lbd.trabalho.srag.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lsnascimento
 */
public class Service {

    public void lerCSV() throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/lsnascimento/Downloads/INFLUD-08-11-2021.csv"))) {
            String line;
            int i = 9;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                for (String s : values) {
                    System.out.println(s.trim());
                }
                if (i == 0) {
                    break;
                }
                i--;
            }
        }

    }

}
