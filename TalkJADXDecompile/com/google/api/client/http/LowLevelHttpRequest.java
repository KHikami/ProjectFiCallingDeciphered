package com.google.api.client.http;

import kgm;

public abstract class LowLevelHttpRequest {
    private String contentEncoding;
    private long contentLength;
    private String contentType;
    private kgm streamingContent;

    public abstract void addHeader(String str, String str2);

    public abstract LowLevelHttpResponse execute();

    public LowLevelHttpRequest() {
        this.contentLength = -1;
    }

    public final void setContentLength(long j) {
        this.contentLength = j;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final void setContentEncoding(String str) {
        this.contentEncoding = str;
    }

    public final String getContentEncoding() {
        return this.contentEncoding;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final void setStreamingContent(kgm kgm) {
        this.streamingContent = kgm;
    }

    public final kgm getStreamingContent() {
        return this.streamingContent;
    }

    public void setTimeout(int i, int i2) {
    }
}
