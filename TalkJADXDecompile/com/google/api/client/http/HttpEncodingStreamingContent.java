package com.google.api.client.http;

import bc;
import java.io.OutputStream;
import kgm;

public final class HttpEncodingStreamingContent implements kgm {
    private final kgm content;
    private final HttpEncoding encoding;

    public HttpEncodingStreamingContent(kgm kgm, HttpEncoding httpEncoding) {
        this.content = (kgm) bc.a((Object) kgm);
        this.encoding = (HttpEncoding) bc.a((Object) httpEncoding);
    }

    public void writeTo(OutputStream outputStream) {
        this.encoding.encode(this.content, outputStream);
    }

    public kgm getContent() {
        return this.content;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }
}
