package com.google.api.client.http;

import gwb;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractInputStreamContent implements HttpContent {
    private boolean closeInputStream;
    private String type;

    public abstract InputStream getInputStream();

    public AbstractInputStreamContent(String str) {
        this.closeInputStream = true;
        setType(str);
    }

    public void writeTo(OutputStream outputStream) {
        gwb.a(getInputStream(), outputStream, this.closeInputStream);
        outputStream.flush();
    }

    public String getType() {
        return this.type;
    }

    public final boolean getCloseInputStream() {
        return this.closeInputStream;
    }

    public AbstractInputStreamContent setType(String str) {
        this.type = str;
        return this;
    }

    public AbstractInputStreamContent setCloseInputStream(boolean z) {
        this.closeInputStream = z;
        return this;
    }
}
