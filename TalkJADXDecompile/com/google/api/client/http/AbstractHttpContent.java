package com.google.api.client.http;

import gwb;
import java.nio.charset.Charset;
import kfh;
import kgm;

public abstract class AbstractHttpContent implements HttpContent {
    private long computedLength;
    private HttpMediaType mediaType;

    public AbstractHttpContent(String str) {
        this(str == null ? null : new HttpMediaType(str));
    }

    protected AbstractHttpContent(HttpMediaType httpMediaType) {
        this.computedLength = -1;
        this.mediaType = httpMediaType;
    }

    public long getLength() {
        if (this.computedLength == -1) {
            this.computedLength = computeLength();
        }
        return this.computedLength;
    }

    public final HttpMediaType getMediaType() {
        return this.mediaType;
    }

    public AbstractHttpContent setMediaType(HttpMediaType httpMediaType) {
        this.mediaType = httpMediaType;
        return this;
    }

    public final Charset getCharset() {
        return (this.mediaType == null || this.mediaType.getCharsetParameter() == null) ? kfh.a : this.mediaType.getCharsetParameter();
    }

    public String getType() {
        return this.mediaType == null ? null : this.mediaType.build();
    }

    protected long computeLength() {
        return computeLength(this);
    }

    public boolean retrySupported() {
        return true;
    }

    public static long computeLength(HttpContent httpContent) {
        if (httpContent.retrySupported()) {
            return gwb.a((kgm) httpContent);
        }
        return -1;
    }
}
