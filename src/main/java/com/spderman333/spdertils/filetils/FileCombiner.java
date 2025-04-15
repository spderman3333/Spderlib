package com.spderman333.spdertils.filetils;

import java.io.*;
import java.util.ArrayList;

public class FileCombiner {

    public static File combine(String sourceDir, String destination) throws IOException {

        File combinedFile = new File(destination);
        combinedFile.createNewFile();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(combinedFile));

        ArrayList<File> fileredSource = scourDirectory(new File(sourceDir));

        File[] asArrayFile = fileredSource.toArray(new File[fileredSource.size()]);

        for (File file : asArrayFile) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.append(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
        }

        bufferedWriter.close();
        return combinedFile;
    };

    private static ArrayList<File> scourDirectory(File directoryToScan) {
        File[] listedFiles = directoryToScan.listFiles();

        ArrayList<File> outputList = new ArrayList<>();

        if (listedFiles != null) {
            for (File file : listedFiles) {
                if (file.isFile()) {
                    outputList.add(file);
                } else {
                    outputList.addAll(scourDirectory(file));
                }
            }
        }

        return outputList;
    }
}
