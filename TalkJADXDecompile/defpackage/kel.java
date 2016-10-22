package defpackage;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: kel */
final class kel extends LowLevelHttpResponse {
    private final HttpURLConnection a;
    private final int b;
    private final String c;
    private final ArrayList<String> d;
    private final ArrayList<String> e;

    kel(HttpURLConnection httpURLConnection) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            responseCode = 0;
        }
        this.b = responseCode;
        this.c = httpURLConnection.getResponseMessage();
        List list = this.d;
        List list2 = this.e;
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        list.add(str);
                        list2.add(str2);
                    }
                }
            }
        }
    }

    public int getStatusCode() {
        return this.b;
    }

    public InputStream getContent() {
        InputStream inputStream;
        try {
            inputStream = this.a.getInputStream();
        } catch (IOException e) {
            inputStream = this.a.getErrorStream();
        }
        return inputStream == null ? null : new kem(this, inputStream);
    }

    public String getContentEncoding() {
        return this.a.getContentEncoding();
    }

    public long getContentLength() {
        String headerField = this.a.getHeaderField("Content-Length");
        return headerField == null ? -1 : Long.parseLong(headerField);
    }

    public String getContentType() {
        return this.a.getHeaderField("Content-Type");
    }

    public String getReasonPhrase() {
        return this.c;
    }

    public String getStatusLine() {
        String headerField = this.a.getHeaderField(0);
        return (headerField == null || !headerField.startsWith("HTTP/1.")) ? null : headerField;
    }

    public int getHeaderCount() {
        return this.d.size();
    }

    public String getHeaderName(int i) {
        return (String) this.d.get(i);
    }

    public String getHeaderValue(int i) {
        return (String) this.e.get(i);
    }

    public void disconnect() {
        this.a.disconnect();
    }
}
