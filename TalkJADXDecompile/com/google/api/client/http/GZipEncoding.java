package com.google.api.client.http;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import kgm;

public class GZipEncoding implements HttpEncoding {

    class 1 extends BufferedOutputStream {
        1(OutputStream outputStream) {
            super(outputStream);
        }

        public void close() {
            try {
                flush();
            } catch (IOException e) {
            }
        }
    }

    public String getName() {
        return "gzip";
    }

    public void encode(kgm kgm, OutputStream outputStream) {
        OutputStream gZIPOutputStream = new GZIPOutputStream(new 1(outputStream));
        kgm.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
