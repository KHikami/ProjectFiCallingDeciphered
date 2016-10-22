package com.google.api.client.http;

import bc;
import java.io.InputStream;

public final class InputStreamContent extends AbstractInputStreamContent {
    private final InputStream inputStream;
    private long length;
    private boolean retrySupported;

    public InputStreamContent(String str, InputStream inputStream) {
        super(str);
        this.length = -1;
        this.inputStream = (InputStream) bc.a((Object) inputStream);
    }

    public long getLength() {
        return this.length;
    }

    public boolean retrySupported() {
        return this.retrySupported;
    }

    public InputStreamContent setRetrySupported(boolean z) {
        this.retrySupported = z;
        return this;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public InputStreamContent setType(String str) {
        return (InputStreamContent) super.setType(str);
    }

    public InputStreamContent setCloseInputStream(boolean z) {
        return (InputStreamContent) super.setCloseInputStream(z);
    }

    public InputStreamContent setLength(long j) {
        this.length = j;
        return this;
    }
}
