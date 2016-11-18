package p000;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class kel extends LowLevelHttpResponse {
    private final HttpURLConnection f21491a;
    private final int f21492b;
    private final String f21493c;
    private final ArrayList<String> f21494d = new ArrayList();
    private final ArrayList<String> f21495e = new ArrayList();

    kel(HttpURLConnection httpURLConnection) {
        this.f21491a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            responseCode = 0;
        }
        this.f21492b = responseCode;
        this.f21493c = httpURLConnection.getResponseMessage();
        List list = this.f21494d;
        List list2 = this.f21495e;
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
        return this.f21492b;
    }

    public InputStream getContent() {
        InputStream inputStream;
        try {
            inputStream = this.f21491a.getInputStream();
        } catch (IOException e) {
            inputStream = this.f21491a.getErrorStream();
        }
        return inputStream == null ? null : new kem(this, inputStream);
    }

    public String getContentEncoding() {
        return this.f21491a.getContentEncoding();
    }

    public long getContentLength() {
        String headerField = this.f21491a.getHeaderField("Content-Length");
        return headerField == null ? -1 : Long.parseLong(headerField);
    }

    public String getContentType() {
        return this.f21491a.getHeaderField("Content-Type");
    }

    public String getReasonPhrase() {
        return this.f21493c;
    }

    public String getStatusLine() {
        String headerField = this.f21491a.getHeaderField(0);
        return (headerField == null || !headerField.startsWith("HTTP/1.")) ? null : headerField;
    }

    public int getHeaderCount() {
        return this.f21494d.size();
    }

    public String getHeaderName(int i) {
        return (String) this.f21494d.get(i);
    }

    public String getHeaderValue(int i) {
        return (String) this.f21495e.get(i);
    }

    public void disconnect() {
        this.f21491a.disconnect();
    }
}
