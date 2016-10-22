package com.google.api.client.http;

import bc;
import gwb;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import kfh;
import kgn;

public final class HttpResponse {
    private InputStream content;
    private final String contentEncoding;
    private int contentLoggingLimit;
    private boolean contentRead;
    private final String contentType;
    private boolean loggingEnabled;
    private final HttpMediaType mediaType;
    private final HttpRequest request;
    LowLevelHttpResponse response;
    private final int statusCode;
    private final String statusMessage;

    HttpResponse(HttpRequest httpRequest, LowLevelHttpResponse lowLevelHttpResponse) {
        StringBuilder stringBuilder;
        String statusLine;
        StringBuilder stringBuilder2;
        HttpMediaType httpMediaType = null;
        this.request = httpRequest;
        this.contentLoggingLimit = httpRequest.getContentLoggingLimit();
        this.loggingEnabled = httpRequest.isLoggingEnabled();
        this.response = lowLevelHttpResponse;
        this.contentEncoding = lowLevelHttpResponse.getContentEncoding();
        int statusCode = lowLevelHttpResponse.getStatusCode();
        if (statusCode < 0) {
            statusCode = 0;
        }
        this.statusCode = statusCode;
        String reasonPhrase = lowLevelHttpResponse.getReasonPhrase();
        this.statusMessage = reasonPhrase;
        Logger logger = HttpTransport.LOGGER;
        Object obj = (this.loggingEnabled && logger.isLoggable(Level.CONFIG)) ? 1 : null;
        if (obj != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("-------------- RESPONSE --------------").append(kgn.a);
            statusLine = lowLevelHttpResponse.getStatusLine();
            if (statusLine != null) {
                stringBuilder.append(statusLine);
            } else {
                stringBuilder.append(this.statusCode);
                if (reasonPhrase != null) {
                    stringBuilder.append(' ').append(reasonPhrase);
                }
            }
            stringBuilder.append(kgn.a);
        } else {
            stringBuilder = null;
        }
        HttpHeaders responseHeaders = httpRequest.getResponseHeaders();
        if (obj != null) {
            stringBuilder2 = stringBuilder;
        } else {
            stringBuilder2 = null;
        }
        responseHeaders.fromHttpResponse(lowLevelHttpResponse, stringBuilder2);
        statusLine = lowLevelHttpResponse.getContentType();
        if (statusLine == null) {
            statusLine = httpRequest.getResponseHeaders().getContentType();
        }
        this.contentType = statusLine;
        if (statusLine != null) {
            httpMediaType = new HttpMediaType(statusLine);
        }
        this.mediaType = httpMediaType;
        if (obj != null) {
            logger.config(stringBuilder.toString());
        }
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpResponse setContentLoggingLimit(int i) {
        bc.a(i >= 0, (Object) "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i;
        return this;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public HttpResponse setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
        return this;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public String getContentType() {
        return this.contentType;
    }

    public HttpMediaType getMediaType() {
        return this.mediaType;
    }

    public HttpHeaders getHeaders() {
        return this.request.getResponseHeaders();
    }

    public boolean isSuccessStatusCode() {
        return HttpStatusCodes.isSuccess(this.statusCode);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public HttpTransport getTransport() {
        return this.request.getTransport();
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream getContent() {
        /*
        r6 = this;
        r0 = r6.contentRead;
        if (r0 != 0) goto L_0x003b;
    L_0x0004:
        r0 = r6.response;
        r0 = r0.getContent();
        if (r0 == 0) goto L_0x0038;
    L_0x000c:
        r1 = r6.contentEncoding;	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        if (r1 == 0) goto L_0x001e;
    L_0x0010:
        r2 = "gzip";
        r1 = r1.contains(r2);	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        if (r1 == 0) goto L_0x001e;
    L_0x0018:
        r1 = new java.util.zip.GZIPInputStream;	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        r1.<init>(r0);	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        r0 = r1;
    L_0x001e:
        r2 = com.google.api.client.http.HttpTransport.LOGGER;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r1 = r6.loggingEnabled;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        if (r1 == 0) goto L_0x0036;
    L_0x0024:
        r1 = java.util.logging.Level.CONFIG;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r1 = r2.isLoggable(r1);	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        if (r1 == 0) goto L_0x0036;
    L_0x002c:
        r1 = new kgb;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r3 = java.util.logging.Level.CONFIG;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r4 = r6.contentLoggingLimit;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r1.<init>(r0, r2, r3, r4);	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r0 = r1;
    L_0x0036:
        r6.content = r0;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
    L_0x0038:
        r0 = 1;
        r6.contentRead = r0;
    L_0x003b:
        r0 = r6.content;
        return r0;
    L_0x003e:
        r1 = move-exception;
        r0.close();
        goto L_0x0038;
    L_0x0043:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x0047:
        r1.close();
        throw r0;
    L_0x004b:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.http.HttpResponse.getContent():java.io.InputStream");
    }

    public void download(OutputStream outputStream) {
        gwb.b(getContent(), outputStream);
    }

    public void ignore() {
        InputStream content = getContent();
        if (content != null) {
            content.close();
        }
    }

    public void disconnect() {
        ignore();
        this.response.disconnect();
    }

    public <T> T parseAs(Class<T> cls) {
        if (hasMessageBody()) {
            return this.request.getParser().parseAndClose(getContent(), getContentCharset(), (Class) cls);
        }
        return null;
    }

    private boolean hasMessageBody() {
        int statusCode = getStatusCode();
        if (!getRequest().getRequestMethod().equals(HttpMethods.HEAD) && statusCode / 100 != 1 && statusCode != HttpStatusCodes.STATUS_CODE_NO_CONTENT && statusCode != HttpStatusCodes.STATUS_CODE_NOT_MODIFIED) {
            return true;
        }
        ignore();
        return false;
    }

    public Object parseAs(Type type) {
        if (hasMessageBody()) {
            return this.request.getParser().parseAndClose(getContent(), getContentCharset(), type);
        }
        return null;
    }

    public String parseAsString() {
        InputStream content = getContent();
        if (content == null) {
            return "";
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        gwb.b(content, byteArrayOutputStream);
        return byteArrayOutputStream.toString(getContentCharset().name());
    }

    public Charset getContentCharset() {
        return (this.mediaType == null || this.mediaType.getCharsetParameter() == null) ? kfh.b : this.mediaType.getCharsetParameter();
    }
}
