package com.spderman333.spdertils.filetils;

import java.io.File;
import java.io.IOException;

interface FileCombiner {
    public File combine(String sourceDir, String destination, boolean recursivelyScour) throws IOException;
}