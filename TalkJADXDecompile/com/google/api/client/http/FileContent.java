package com.google.api.client.http;

import bc;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class FileContent extends AbstractInputStreamContent {
    private final File file;

    public FileContent(String str, File file) {
        super(str);
        this.file = (File) bc.a((Object) file);
    }

    public long getLength() {
        return this.file.length();
    }

    public boolean retrySupported() {
        return true;
    }

    public InputStream getInputStream() {
        return new FileInputStream(this.file);
    }

    public File getFile() {
        return this.file;
    }

    public FileContent setType(String str) {
        return (FileContent) super.setType(str);
    }

    public FileContent setCloseInputStream(boolean z) {
        return (FileContent) super.setCloseInputStream(z);
    }
}
