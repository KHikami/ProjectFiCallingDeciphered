package com.google.api.client.http;

import bc;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kgh;
import kgk;

public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 10;
    public static final String USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/1.22.0-SNAPSHOT (gzip)";
    public static final String VERSION = "1.22.0-SNAPSHOT";
    @Deprecated
    private BackOffPolicy backOffPolicy;
    private int connectTimeout;
    private HttpContent content;
    private int contentLoggingLimit;
    private boolean curlLoggingEnabled;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;
    private boolean followRedirects;
    private HttpHeaders headers;
    private HttpIOExceptionHandler ioExceptionHandler;
    private boolean loggingEnabled;
    private int numRetries;
    private kgh objectParser;
    private int readTimeout;
    private String requestMethod;
    private HttpHeaders responseHeaders;
    private HttpResponseInterceptor responseInterceptor;
    @Deprecated
    private boolean retryOnExecuteIOException;
    private kgk sleeper;
    private boolean suppressUserAgentSuffix;
    private boolean throwExceptionOnExecuteError;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;

    class 1 implements Callable<HttpResponse> {
        1() {
        }

        public HttpResponse call() {
            return HttpRequest.this.execute();
        }
    }

    HttpRequest(HttpTransport httpTransport, String str) {
        this.headers = new HttpHeaders();
        this.responseHeaders = new HttpHeaders();
        this.numRetries = DEFAULT_NUMBER_OF_RETRIES;
        this.contentLoggingLimit = 16384;
        this.loggingEnabled = true;
        this.curlLoggingEnabled = true;
        this.connectTimeout = 20000;
        this.readTimeout = 20000;
        this.followRedirects = true;
        this.throwExceptionOnExecuteError = true;
        this.retryOnExecuteIOException = false;
        this.sleeper = kgk.a;
        this.transport = httpTransport;
        setRequestMethod(str);
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public HttpRequest setRequestMethod(String str) {
        boolean z = str == null || HttpMediaType.matchesToken(str);
        bc.a(z);
        this.requestMethod = str;
        return this;
    }

    public GenericUrl getUrl() {
        return this.url;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.url = (GenericUrl) bc.a((Object) genericUrl);
        return this;
    }

    public HttpContent getContent() {
        return this.content;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.content = httpContent;
        return this;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.encoding = httpEncoding;
        return this;
    }

    @Deprecated
    public BackOffPolicy getBackOffPolicy() {
        return this.backOffPolicy;
    }

    @Deprecated
    public HttpRequest setBackOffPolicy(BackOffPolicy backOffPolicy) {
        this.backOffPolicy = backOffPolicy;
        return this;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpRequest setContentLoggingLimit(int i) {
        bc.a(i >= 0, (Object) "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i;
        return this;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public HttpRequest setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
        return this;
    }

    public boolean isCurlLoggingEnabled() {
        return this.curlLoggingEnabled;
    }

    public HttpRequest setCurlLoggingEnabled(boolean z) {
        this.curlLoggingEnabled = z;
        return this;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public HttpRequest setConnectTimeout(int i) {
        bc.a(i >= 0);
        this.connectTimeout = i;
        return this;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public HttpRequest setReadTimeout(int i) {
        bc.a(i >= 0);
        this.readTimeout = i;
        return this;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.headers = (HttpHeaders) bc.a((Object) httpHeaders);
        return this;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = (HttpHeaders) bc.a((Object) httpHeaders);
        return this;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.executeInterceptor;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.executeInterceptor = httpExecuteInterceptor;
        return this;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.unsuccessfulResponseHandler;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.unsuccessfulResponseHandler = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.ioExceptionHandler;
    }

    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.ioExceptionHandler = httpIOExceptionHandler;
        return this;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.responseInterceptor = httpResponseInterceptor;
        return this;
    }

    public int getNumberOfRetries() {
        return this.numRetries;
    }

    public HttpRequest setNumberOfRetries(int i) {
        bc.a(i >= 0);
        this.numRetries = i;
        return this;
    }

    public HttpRequest setParser(kgh kgh) {
        this.objectParser = kgh;
        return this;
    }

    public final kgh getParser() {
        return this.objectParser;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public HttpRequest setFollowRedirects(boolean z) {
        this.followRedirects = z;
        return this;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.throwExceptionOnExecuteError;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z) {
        this.throwExceptionOnExecuteError = z;
        return this;
    }

    @Deprecated
    public boolean getRetryOnExecuteIOException() {
        return this.retryOnExecuteIOException;
    }

    @Deprecated
    public HttpRequest setRetryOnExecuteIOException(boolean z) {
        this.retryOnExecuteIOException = z;
        return this;
    }

    public boolean getSuppressUserAgentSuffix() {
        return this.suppressUserAgentSuffix;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean z) {
        this.suppressUserAgentSuffix = z;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.api.client.http.HttpResponse execute() {
        /*
        r22 = this;
        r0 = r22;
        r2 = r0.numRetries;
        if (r2 < 0) goto L_0x0281;
    L_0x0006:
        r2 = 1;
    L_0x0007:
        bc.a(r2);
        r0 = r22;
        r3 = r0.numRetries;
        r0 = r22;
        r2 = r0.backOffPolicy;
        if (r2 == 0) goto L_0x001b;
    L_0x0014:
        r0 = r22;
        r2 = r0.backOffPolicy;
        r2.reset();
    L_0x001b:
        r2 = 0;
        r0 = r22;
        r4 = r0.requestMethod;
        bc.a(r4);
        r0 = r22;
        r4 = r0.url;
        bc.a(r4);
        r6 = r3;
    L_0x002b:
        if (r2 == 0) goto L_0x0030;
    L_0x002d:
        r2.ignore();
    L_0x0030:
        r8 = 0;
        r7 = 0;
        r0 = r22;
        r2 = r0.executeInterceptor;
        if (r2 == 0) goto L_0x0041;
    L_0x0038:
        r0 = r22;
        r2 = r0.executeInterceptor;
        r0 = r22;
        r2.intercept(r0);
    L_0x0041:
        r0 = r22;
        r2 = r0.url;
        r14 = r2.build();
        r0 = r22;
        r2 = r0.transport;
        r0 = r22;
        r3 = r0.requestMethod;
        r15 = r2.buildRequest(r3, r14);
        r16 = com.google.api.client.http.HttpTransport.LOGGER;
        r0 = r22;
        r2 = r0.loggingEnabled;
        if (r2 == 0) goto L_0x0284;
    L_0x005d:
        r2 = java.util.logging.Level.CONFIG;
        r0 = r16;
        r2 = r0.isLoggable(r2);
        if (r2 == 0) goto L_0x0284;
    L_0x0067:
        r2 = 1;
        r13 = r2;
    L_0x0069:
        r3 = 0;
        r2 = 0;
        if (r13 == 0) goto L_0x00ba;
    L_0x006d:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "-------------- REQUEST  --------------";
        r4 = r3.append(r4);
        r5 = kgn.a;
        r4.append(r5);
        r0 = r22;
        r4 = r0.requestMethod;
        r4 = r3.append(r4);
        r5 = 32;
        r4 = r4.append(r5);
        r4 = r4.append(r14);
        r5 = kgn.a;
        r4.append(r5);
        r0 = r22;
        r4 = r0.curlLoggingEnabled;
        if (r4 == 0) goto L_0x00ba;
    L_0x009a:
        r2 = new java.lang.StringBuilder;
        r4 = "curl -v --compressed";
        r2.<init>(r4);
        r0 = r22;
        r4 = r0.requestMethod;
        r5 = "GET";
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x00ba;
    L_0x00ad:
        r4 = " -X ";
        r4 = r2.append(r4);
        r0 = r22;
        r5 = r0.requestMethod;
        r4.append(r5);
    L_0x00ba:
        r0 = r22;
        r4 = r0.headers;
        r4 = r4.getUserAgent();
        r0 = r22;
        r5 = r0.suppressUserAgentSuffix;
        if (r5 != 0) goto L_0x00d3;
    L_0x00c8:
        if (r4 != 0) goto L_0x0288;
    L_0x00ca:
        r0 = r22;
        r5 = r0.headers;
        r9 = "Google-HTTP-Java-Client/1.22.0-SNAPSHOT (gzip)";
        r5.setUserAgent(r9);
    L_0x00d3:
        r0 = r22;
        r5 = r0.headers;
        r0 = r16;
        com.google.api.client.http.HttpHeaders.serializeHeaders(r5, r3, r2, r0, r15);
        r0 = r22;
        r5 = r0.suppressUserAgentSuffix;
        if (r5 != 0) goto L_0x00e9;
    L_0x00e2:
        r0 = r22;
        r5 = r0.headers;
        r5.setUserAgent(r4);
    L_0x00e9:
        r0 = r22;
        r5 = r0.content;
        if (r5 == 0) goto L_0x00f9;
    L_0x00ef:
        r0 = r22;
        r4 = r0.content;
        r4 = r4.retrySupported();
        if (r4 == 0) goto L_0x02c1;
    L_0x00f9:
        r4 = 1;
        r12 = r4;
    L_0x00fb:
        if (r5 == 0) goto L_0x01f8;
    L_0x00fd:
        r0 = r22;
        r4 = r0.content;
        r17 = r4.getType();
        if (r13 == 0) goto L_0x039b;
    L_0x0107:
        r4 = new kgd;
        r9 = com.google.api.client.http.HttpTransport.LOGGER;
        r10 = java.util.logging.Level.CONFIG;
        r0 = r22;
        r11 = r0.contentLoggingLimit;
        r4.<init>(r5, r9, r10, r11);
    L_0x0114:
        r0 = r22;
        r5 = r0.encoding;
        if (r5 != 0) goto L_0x02c5;
    L_0x011a:
        r5 = 0;
        r0 = r22;
        r9 = r0.content;
        r10 = r9.getLength();
        r9 = r5;
        r5 = r4;
    L_0x0125:
        if (r13 == 0) goto L_0x01e3;
    L_0x0127:
        if (r17 == 0) goto L_0x0170;
    L_0x0129:
        r18 = "Content-Type: ";
        r4 = java.lang.String.valueOf(r17);
        r19 = r4.length();
        if (r19 == 0) goto L_0x02ec;
    L_0x0135:
        r0 = r18;
        r4 = r0.concat(r4);
    L_0x013b:
        r18 = r3.append(r4);
        r19 = kgn.a;
        r18.append(r19);
        if (r2 == 0) goto L_0x0170;
    L_0x0146:
        r18 = new java.lang.StringBuilder;
        r19 = java.lang.String.valueOf(r4);
        r19 = r19.length();
        r19 = r19 + 6;
        r18.<init>(r19);
        r19 = " -H '";
        r18 = r18.append(r19);
        r0 = r18;
        r4 = r0.append(r4);
        r18 = "'";
        r0 = r18;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r2.append(r4);
    L_0x0170:
        if (r9 == 0) goto L_0x01b9;
    L_0x0172:
        r18 = "Content-Encoding: ";
        r4 = java.lang.String.valueOf(r9);
        r19 = r4.length();
        if (r19 == 0) goto L_0x02f5;
    L_0x017e:
        r0 = r18;
        r4 = r0.concat(r4);
    L_0x0184:
        r18 = r3.append(r4);
        r19 = kgn.a;
        r18.append(r19);
        if (r2 == 0) goto L_0x01b9;
    L_0x018f:
        r18 = new java.lang.StringBuilder;
        r19 = java.lang.String.valueOf(r4);
        r19 = r19.length();
        r19 = r19 + 6;
        r18.<init>(r19);
        r19 = " -H '";
        r18 = r18.append(r19);
        r0 = r18;
        r4 = r0.append(r4);
        r18 = "'";
        r0 = r18;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r2.append(r4);
    L_0x01b9:
        r18 = 0;
        r4 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1));
        if (r4 < 0) goto L_0x01e3;
    L_0x01bf:
        r4 = new java.lang.StringBuilder;
        r18 = 36;
        r0 = r18;
        r4.<init>(r0);
        r18 = "Content-Length: ";
        r0 = r18;
        r4 = r4.append(r0);
        r4 = r4.append(r10);
        r4 = r4.toString();
        r4 = r3.append(r4);
        r18 = kgn.a;
        r0 = r18;
        r4.append(r0);
    L_0x01e3:
        if (r2 == 0) goto L_0x01ea;
    L_0x01e5:
        r4 = " -d '@-'";
        r2.append(r4);
    L_0x01ea:
        r0 = r17;
        r15.setContentType(r0);
        r15.setContentEncoding(r9);
        r15.setContentLength(r10);
        r15.setStreamingContent(r5);
    L_0x01f8:
        if (r13 == 0) goto L_0x022a;
    L_0x01fa:
        r3 = r3.toString();
        r0 = r16;
        r0.config(r3);
        if (r2 == 0) goto L_0x022a;
    L_0x0205:
        r3 = " -- '";
        r2.append(r3);
        r3 = "'";
        r4 = "'\"'\"'";
        r3 = r14.replaceAll(r3, r4);
        r2.append(r3);
        r3 = "'";
        r2.append(r3);
        if (r5 == 0) goto L_0x0221;
    L_0x021c:
        r3 = " << $$$";
        r2.append(r3);
    L_0x0221:
        r2 = r2.toString();
        r0 = r16;
        r0.config(r2);
    L_0x022a:
        if (r12 == 0) goto L_0x02fe;
    L_0x022c:
        if (r6 <= 0) goto L_0x02fe;
    L_0x022e:
        r2 = 1;
    L_0x022f:
        r0 = r22;
        r3 = r0.connectTimeout;
        r0 = r22;
        r4 = r0.readTimeout;
        r15.setTimeout(r3, r4);
        r5 = r15.execute();	 Catch:{ IOException -> 0x030c }
        r4 = new com.google.api.client.http.HttpResponse;	 Catch:{ all -> 0x0301 }
        r0 = r22;
        r4.<init>(r0, r5);	 Catch:{ all -> 0x0301 }
        r5 = r7;
    L_0x0246:
        if (r4 == 0) goto L_0x0361;
    L_0x0248:
        r3 = r4.isSuccessStatusCode();	 Catch:{ all -> 0x0369 }
        if (r3 != 0) goto L_0x0361;
    L_0x024e:
        r3 = 0;
        r0 = r22;
        r7 = r0.unsuccessfulResponseHandler;	 Catch:{ all -> 0x0369 }
        if (r7 == 0) goto L_0x025f;
    L_0x0255:
        r0 = r22;
        r3 = r0.unsuccessfulResponseHandler;	 Catch:{ all -> 0x0369 }
        r0 = r22;
        r3 = r3.handleResponse(r0, r4, r2);	 Catch:{ all -> 0x0369 }
    L_0x025f:
        if (r3 != 0) goto L_0x0272;
    L_0x0261:
        r7 = r4.getStatusCode();	 Catch:{ all -> 0x0369 }
        r8 = r4.getHeaders();	 Catch:{ all -> 0x0369 }
        r0 = r22;
        r7 = r0.handleRedirect(r7, r8);	 Catch:{ all -> 0x0369 }
        if (r7 == 0) goto L_0x0333;
    L_0x0271:
        r3 = 1;
    L_0x0272:
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x0278;
    L_0x0275:
        r4.ignore();	 Catch:{ all -> 0x0369 }
    L_0x0278:
        r3 = r6 + -1;
        if (r4 == 0) goto L_0x027c;
    L_0x027c:
        if (r2 != 0) goto L_0x0397;
    L_0x027e:
        if (r4 != 0) goto L_0x0370;
    L_0x0280:
        throw r5;
    L_0x0281:
        r2 = 0;
        goto L_0x0007;
    L_0x0284:
        r2 = 0;
        r13 = r2;
        goto L_0x0069;
    L_0x0288:
        r0 = r22;
        r5 = r0.headers;
        r9 = "Google-HTTP-Java-Client/1.22.0-SNAPSHOT (gzip)";
        r9 = java.lang.String.valueOf(r9);
        r10 = new java.lang.StringBuilder;
        r11 = java.lang.String.valueOf(r4);
        r11 = r11.length();
        r11 = r11 + 1;
        r12 = java.lang.String.valueOf(r9);
        r12 = r12.length();
        r11 = r11 + r12;
        r10.<init>(r11);
        r10 = r10.append(r4);
        r11 = " ";
        r10 = r10.append(r11);
        r9 = r10.append(r9);
        r9 = r9.toString();
        r5.setUserAgent(r9);
        goto L_0x00d3;
    L_0x02c1:
        r4 = 0;
        r12 = r4;
        goto L_0x00fb;
    L_0x02c5:
        r0 = r22;
        r5 = r0.encoding;
        r9 = r5.getName();
        r10 = new com.google.api.client.http.HttpEncodingStreamingContent;
        r0 = r22;
        r5 = r0.encoding;
        r10.<init>(r4, r5);
        if (r12 == 0) goto L_0x02e3;
    L_0x02d8:
        r4 = gwb.a(r10);
        r20 = r4;
        r5 = r10;
        r10 = r20;
        goto L_0x0125;
    L_0x02e3:
        r4 = -1;
        r20 = r4;
        r5 = r10;
        r10 = r20;
        goto L_0x0125;
    L_0x02ec:
        r4 = new java.lang.String;
        r0 = r18;
        r4.<init>(r0);
        goto L_0x013b;
    L_0x02f5:
        r4 = new java.lang.String;
        r0 = r18;
        r4.<init>(r0);
        goto L_0x0184;
    L_0x02fe:
        r2 = 0;
        goto L_0x022f;
    L_0x0301:
        r3 = move-exception;
        r4 = r5.getContent();	 Catch:{ IOException -> 0x030c }
        if (r4 == 0) goto L_0x030b;
    L_0x0308:
        r4.close();	 Catch:{ IOException -> 0x030c }
    L_0x030b:
        throw r3;	 Catch:{ IOException -> 0x030c }
    L_0x030c:
        r3 = move-exception;
        r0 = r22;
        r4 = r0.retryOnExecuteIOException;
        if (r4 != 0) goto L_0x0326;
    L_0x0313:
        r0 = r22;
        r4 = r0.ioExceptionHandler;
        if (r4 == 0) goto L_0x0325;
    L_0x0319:
        r0 = r22;
        r4 = r0.ioExceptionHandler;
        r0 = r22;
        r4 = r4.handleIOException(r0, r2);
        if (r4 != 0) goto L_0x0326;
    L_0x0325:
        throw r3;
    L_0x0326:
        r4 = java.util.logging.Level.WARNING;
        r5 = "exception thrown while executing request";
        r0 = r16;
        r0.log(r4, r5, r3);
        r5 = r3;
        r4 = r8;
        goto L_0x0246;
    L_0x0333:
        if (r2 == 0) goto L_0x0272;
    L_0x0335:
        r0 = r22;
        r7 = r0.backOffPolicy;	 Catch:{ all -> 0x0369 }
        if (r7 == 0) goto L_0x0272;
    L_0x033b:
        r0 = r22;
        r7 = r0.backOffPolicy;	 Catch:{ all -> 0x0369 }
        r8 = r4.getStatusCode();	 Catch:{ all -> 0x0369 }
        r7 = r7.isBackOffRequired(r8);	 Catch:{ all -> 0x0369 }
        if (r7 == 0) goto L_0x0272;
    L_0x0349:
        r0 = r22;
        r7 = r0.backOffPolicy;	 Catch:{ all -> 0x0369 }
        r8 = r7.getNextBackOffMillis();	 Catch:{ all -> 0x0369 }
        r10 = -1;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 == 0) goto L_0x0272;
    L_0x0357:
        r0 = r22;
        r3 = r0.sleeper;	 Catch:{ InterruptedException -> 0x0395 }
        r3.a(r8);	 Catch:{ InterruptedException -> 0x0395 }
    L_0x035e:
        r3 = 1;
        goto L_0x0272;
    L_0x0361:
        if (r4 != 0) goto L_0x0367;
    L_0x0363:
        r3 = 1;
    L_0x0364:
        r2 = r2 & r3;
        goto L_0x0278;
    L_0x0367:
        r3 = 0;
        goto L_0x0364;
    L_0x0369:
        r2 = move-exception;
        if (r4 == 0) goto L_0x036f;
    L_0x036c:
        r4.disconnect();
    L_0x036f:
        throw r2;
    L_0x0370:
        r0 = r22;
        r2 = r0.responseInterceptor;
        if (r2 == 0) goto L_0x037d;
    L_0x0376:
        r0 = r22;
        r2 = r0.responseInterceptor;
        r2.interceptResponse(r4);
    L_0x037d:
        r0 = r22;
        r2 = r0.throwExceptionOnExecuteError;
        if (r2 == 0) goto L_0x0394;
    L_0x0383:
        r2 = r4.isSuccessStatusCode();
        if (r2 != 0) goto L_0x0394;
    L_0x0389:
        r2 = new com.google.api.client.http.HttpResponseException;	 Catch:{ all -> 0x038f }
        r2.<init>(r4);	 Catch:{ all -> 0x038f }
        throw r2;	 Catch:{ all -> 0x038f }
    L_0x038f:
        r2 = move-exception;
        r4.disconnect();
        throw r2;
    L_0x0394:
        return r4;
    L_0x0395:
        r3 = move-exception;
        goto L_0x035e;
    L_0x0397:
        r2 = r4;
        r6 = r3;
        goto L_0x002b;
    L_0x039b:
        r4 = r5;
        goto L_0x0114;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.http.HttpRequest.execute():com.google.api.client.http.HttpResponse");
    }

    public Future<HttpResponse> executeAsync(Executor executor) {
        Object futureTask = new FutureTask(new 1());
        executor.execute(futureTask);
        return futureTask;
    }

    public Future<HttpResponse> executeAsync() {
        return executeAsync(Executors.newSingleThreadExecutor());
    }

    public boolean handleRedirect(int i, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (!getFollowRedirects() || !HttpStatusCodes.isRedirect(i) || location == null) {
            return false;
        }
        setUrl(new GenericUrl(this.url.toURL(location)));
        if (i == HttpStatusCodes.STATUS_CODE_SEE_OTHER) {
            setRequestMethod(HttpMethods.GET);
            setContent(null);
        }
        this.headers.setAuthorization(null);
        this.headers.setIfMatch(null);
        this.headers.setIfNoneMatch(null);
        this.headers.setIfModifiedSince(null);
        this.headers.setIfUnmodifiedSince(null);
        this.headers.setIfRange(null);
        return true;
    }

    public kgk getSleeper() {
        return this.sleeper;
    }

    public HttpRequest setSleeper(kgk kgk) {
        this.sleeper = (kgk) bc.a((Object) kgk);
        return this;
    }
}
