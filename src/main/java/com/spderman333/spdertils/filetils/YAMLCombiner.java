package com.spderman333.spdertils.filetils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class YAMLCombiner implements FileCombiner {
    @Override
    public File combine(String sourceDir, String destination, boolean recursivelyScour) throws IOException {

        FileWriter fileWriter = new FileWriter(destination);
        ArrayList<File> fileredSource = scourDirectory(new File(sourceDir));


    };

    private ArrayList<File> scourDirectory(File directoryToScan) {
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
