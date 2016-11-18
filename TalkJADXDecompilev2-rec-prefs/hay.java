package p000;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Security;
import java.util.List;
import java.util.Map.Entry;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class hay implements HttpClient {
    private static final String[] f16484d = new String[]{"text/", "application/xml", "application/json"};
    public hbc f16485a;
    public HttpParams f16486b;
    private hbb f16487c;
    private Context f16488e;
    private String f16489f;

    public hay(Context context, String str, boolean z) {
        this(context, str, false, Security.getProvider("com.google.android.gms.common.security.ProviderInstallerImpl") != null);
    }

    private hay(Context context, String str, boolean z, boolean z2) {
        this.f16486b = new haz(this);
        String valueOf = String.valueOf(Build.DEVICE);
        String valueOf2 = String.valueOf(Build.ID);
        valueOf = new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(" (").append(valueOf).append(" ").append(valueOf2).append(")").toString();
        if (z) {
            valueOf = String.valueOf(valueOf).concat("; gzip");
        }
        this.f16488e = context;
        this.f16489f = valueOf;
        this.f16485a = new hbc(this.f16488e, z2);
    }

    private static String m19115a(HttpUriRequest httpUriRequest, HttpURLConnection httpURLConnection, boolean z) {
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
        stringBuilder.append("\"");
        stringBuilder.append(httpURLConnection.getURL());
        stringBuilder.append("\"");
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
            if (entity != null && entity.isRepeatable()) {
                if (entity.getContentLength() < 1048576) {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    entity.writeTo(byteArrayOutputStream);
                    if (hay.m19119a(httpUriRequest)) {
                        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        stringBuilder.insert(0, new StringBuilder(String.valueOf(encodeToString).length() + 35).append("echo '").append(encodeToString).append("' | base64 -d > /tmp/$$.bin; ").toString());
                        stringBuilder.append(" --data-binary @/tmp/$$.bin");
                    } else {
                        stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                    }
                } else {
                    stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                }
            }
        }
        return stringBuilder.toString();
    }

    private HttpResponse m19116a(HttpURLConnection httpURLConnection) {
        String str = null;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 0) {
            throw new IOException("Cannot retrieve a valid HTTP status code from server response");
        }
        this.f16485a.m19125a(httpURLConnection.getURL().toString(), responseCode);
        HttpResponse hba = new hba();
        hba.f16496a = httpURLConnection;
        hba.setStatusLine(HttpVersion.HTTP_1_1, responseCode, httpURLConnection.getResponseMessage());
        String str2 = null;
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str3 = (String) entry.getKey();
            if (str3 != null) {
                for (String str4 : (List) entry.getValue()) {
                    if (str3.equalsIgnoreCase("content-type")) {
                        str2 = str4;
                    } else if (str3.equalsIgnoreCase("content-encoding")) {
                        str = str4;
                    }
                    hba.addHeader(new BasicHeader(str3, str4));
                }
            }
        }
        InputStream errorStream = responseCode >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
        if (errorStream != null) {
            HttpEntity inputStreamEntity = new InputStreamEntity(errorStream, -1);
            if (str2 != null) {
                inputStreamEntity.setContentType(str2);
            }
            if (str != null) {
                inputStreamEntity.setContentEncoding(str);
            }
            hba.setEntity(inputStreamEntity);
        }
        return hba;
    }

    private void m19117a(String str, int i, boolean z) {
        if (str == null) {
            throw new NullPointerException("name");
        } else if (i < 2 || i > 7) {
            throw new IllegalArgumentException("Level is out of range [27]");
        } else {
            this.f16487c = new hbb(str, i, false);
        }
    }

    private void m19118a(HttpURLConnection httpURLConnection, HttpUriRequest httpUriRequest) {
        httpURLConnection.setRequestMethod(httpUriRequest.getMethod());
        for (Header header : httpUriRequest.getAllHeaders()) {
            httpURLConnection.addRequestProperty(header.getName(), header.getValue());
        }
        if (httpURLConnection.getRequestProperty("User-Agent") == null) {
            httpURLConnection.setRequestProperty("User-Agent", this.f16489f);
        }
        if (!(httpUriRequest instanceof HttpEntityEnclosingRequest) || ((HttpEntityEnclosingRequest) httpUriRequest).getEntity() == null) {
            httpURLConnection.connect();
            return;
        }
        HttpEntity entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
        httpURLConnection.setDoOutput(true);
        if (entity.isChunked()) {
            httpURLConnection.setChunkedStreamingMode(2048);
        } else if (entity.getContentLength() > 0) {
            httpURLConnection.setRequestProperty("content-length", Long.toString(entity.getContentLength()));
        }
        if (entity.isStreaming()) {
            if (entity.getContentLength() <= 0) {
                httpURLConnection.setChunkedStreamingMode(2048);
            } else if (VERSION.SDK_INT >= 19) {
                httpURLConnection.setFixedLengthStreamingMode(entity.getContentLength());
            } else {
                httpURLConnection.setFixedLengthStreamingMode((int) entity.getContentLength());
            }
        }
        Header contentType = entity.getContentType();
        Header contentEncoding = entity.getContentEncoding();
        if (contentType != null) {
            httpURLConnection.setRequestProperty("content-type", contentType.getValue());
        }
        if (contentEncoding != null) {
            httpURLConnection.setRequestProperty("content-encoding", contentEncoding.getValue());
        }
        entity.writeTo(httpURLConnection.getOutputStream());
    }

    private static boolean m19119a(HttpUriRequest httpUriRequest) {
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
            for (String startsWith : f16484d) {
                if (header.getValue().startsWith(startsWith)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void m19120a(String str, int i) {
        m19117a(str, 2, false);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        throw new UnsupportedOperationException();
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return execute(httpUriRequest, (ResponseHandler) responseHandler, null);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, null);
    }

    public ClientConnectionManager getConnectionManager() {
        throw new UnsupportedOperationException();
    }

    public HttpParams getParams() {
        return this.f16486b;
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        long j = -1;
        if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
            Network network;
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                HttpEntity entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
                if (entity == null) {
                    j = 0;
                } else if (!entity.isChunked()) {
                    j = entity.getContentLength();
                }
            }
            if (j >= 0) {
                httpUriRequest.addHeader("content-length", Long.toString(j));
            }
            URL toURL = httpUriRequest.getURI().toURL();
            hbc hbc = this.f16485a;
            if (null == null) {
                network = null;
            } else {
                network = null.f16506a;
            }
            HttpURLConnection a = hbc.m19124a(toURL, network);
            a.setInstanceFollowRedirects(false);
            hbb hbb = this.f16487c;
            if (hbb != null && hbb.m19123a()) {
                hbb.m19122a(hay.m19115a(httpUriRequest, a, hbb.f16497a));
            }
            m19118a(a, httpUriRequest);
            return m19116a(a);
        }
        throw new RuntimeException("This thread forbids HTTP requests");
    }
}
