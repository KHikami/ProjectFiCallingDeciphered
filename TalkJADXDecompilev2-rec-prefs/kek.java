package p000;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import java.io.OutputStream;
import java.net.HttpURLConnection;

final class kek extends LowLevelHttpRequest {
    private final HttpURLConnection f21490a;

    kek(HttpURLConnection httpURLConnection) {
        this.f21490a = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    public void addHeader(String str, String str2) {
        this.f21490a.addRequestProperty(str, str2);
    }

    public void setTimeout(int i, int i2) {
        this.f21490a.setReadTimeout(i2);
        this.f21490a.setConnectTimeout(i);
    }

    public LowLevelHttpResponse execute() {
        HttpURLConnection httpURLConnection = this.f21490a;
        if (getStreamingContent() != null) {
            String contentType = getContentType();
            if (contentType != null) {
                addHeader("Content-Type", contentType);
            }
            contentType = getContentEncoding();
            if (contentType != null) {
                addHeader("Content-Encoding", contentType);
            }
            long contentLength = getContentLength();
            if (contentLength >= 0) {
                addHeader("Content-Length", Long.toString(contentLength));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if (HttpMethods.POST.equals(requestMethod) || HttpMethods.PUT.equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (contentLength < 0 || contentLength > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    getStreamingContent().writeTo(outputStream);
                } finally {
                    outputStream.close();
                }
            } else {
                bc.m4816a(contentLength == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        }
        try {
            httpURLConnection.connect();
            return new kel(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
