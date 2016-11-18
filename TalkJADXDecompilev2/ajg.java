package defpackage;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import android.util.Log;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import junit.framework.Assert;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

public final class ajg implements HttpClient {
    public static long a = 256;
    static final HttpRequestInterceptor b = new ajh();
    private static String[] d = new String[]{"text/", "application/xml", "application/json"};
    volatile ajk c;
    private final HttpClient e;
    private RuntimeException f = new IllegalStateException("AndroidHttpClient created and never closed");

    public static ajg a(String str, Context context, boolean z) {
        SSLSessionCache sSLSessionCache;
        ClientConnectionManager ajn;
        SocketFactory socketFactory = null;
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS);
        HttpConnectionParams.setSoTimeout(basicHttpParams, ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        if (context == null) {
            sSLSessionCache = null;
        } else {
            sSLSessionCache = new SSLSessionCache(context);
        }
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        try {
            Method method = SSLCertificateSocketFactory.class.getMethod("getHttpSocketFactory", new Class[]{Integer.TYPE, SSLSessionCache.class});
            method.setAccessible(true);
            socketFactory = (SSLSocketFactory) method.invoke(null, new Object[]{Integer.valueOf(ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS), sSLSessionCache});
        } catch (NoSuchMethodException e) {
            Assert.fail(e.toString());
        } catch (InvocationTargetException e2) {
            Assert.fail(e2.toString());
        } catch (IllegalAccessException e3) {
            Assert.fail(e3.toString());
        }
        Assert.assertNotNull(socketFactory);
        schemeRegistry.register(new Scheme("https", socketFactory, 443));
        if (z) {
            ajn = new ajn(basicHttpParams, schemeRegistry);
        } else {
            ajn = new ajm(basicHttpParams, schemeRegistry);
        }
        return new ajg(ajn, basicHttpParams);
    }

    private ajg(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.e = new aji(this, clientConnectionManager, httpParams);
    }

    protected void finalize() {
        super.finalize();
        if (this.f != null) {
            Log.e("MmsHttpClient", "Leak found", this.f);
            this.f = null;
        }
    }

    public void a() {
        if (this.f != null) {
            getConnectionManager().shutdown();
            this.f = null;
        }
    }

    public HttpParams getParams() {
        return this.e.getParams();
    }

    public ClientConnectionManager getConnectionManager() {
        return this.e.getConnectionManager();
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.e.execute(httpUriRequest);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.e.execute(httpUriRequest, httpContext);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.e.execute(httpHost, httpRequest);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.e.execute(httpHost, httpRequest, httpContext);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return this.e.execute(httpUriRequest, responseHandler);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.e.execute(httpUriRequest, responseHandler, httpContext);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return this.e.execute(httpHost, httpRequest, responseHandler);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.e.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    static String a(HttpUriRequest httpUriRequest, boolean z) {
        Object uri;
        HttpEntity entity;
        OutputStream byteArrayOutputStream;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("curl ");
        stringBuilder.append("-X ");
        stringBuilder.append(httpUriRequest.getMethod());
        stringBuilder.append(" ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || !(header.getName().equals("Authorization") || header.getName().equals("Cookie"))) {
                stringBuilder.append("--header \"");
                stringBuilder.append(header.toString().trim());
                stringBuilder.append("\" ");
            }
        }
        URI uri2 = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
                stringBuilder.append("\"");
                stringBuilder.append(uri);
                stringBuilder.append("\"");
                if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                    entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
                    if (entity != null && entity.isRepeatable()) {
                        if (entity.getContentLength() >= 1024) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            entity.writeTo(byteArrayOutputStream);
                            if (ajg.a(httpUriRequest)) {
                                stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                            } else {
                                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                                stringBuilder.insert(0, new StringBuilder(String.valueOf(encodeToString).length() + 35).append("echo '").append(encodeToString).append("' | base64 -d > /tmp/$$.bin; ").toString());
                                stringBuilder.append(" --data-binary @/tmp/$$.bin");
                            }
                        } else {
                            stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                        }
                    }
                }
                return stringBuilder.toString();
            }
        }
        URI uri3 = uri2;
        stringBuilder.append("\"");
        stringBuilder.append(uri);
        stringBuilder.append("\"");
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
            if (entity.getContentLength() >= 1024) {
                stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (ajg.a(httpUriRequest)) {
                    stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                } else {
                    String encodeToString2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    stringBuilder.insert(0, new StringBuilder(String.valueOf(encodeToString2).length() + 35).append("echo '").append(encodeToString2).append("' | base64 -d > /tmp/$$.bin; ").toString());
                    stringBuilder.append(" --data-binary @/tmp/$$.bin");
                }
            }
        }
        return stringBuilder.toString();
    }

    private static boolean a(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header value : headers) {
                if ("gzip".equalsIgnoreCase(value.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 == null) {
            return true;
        }
        for (Header header : headers2) {
            for (String startsWith : d) {
                if (header.getValue().startsWith(startsWith)) {
                    return false;
                }
            }
        }
        return true;
    }
}
