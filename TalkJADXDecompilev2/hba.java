package defpackage;

import java.net.HttpURLConnection;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

final class hba extends BasicHttpResponse {
    private static final StatusLine b = new BasicStatusLine(HttpVersion.HTTP_1_1, 500, "Unknown error");
    HttpURLConnection a;

    hba() {
        super(b, null, null);
    }
}
