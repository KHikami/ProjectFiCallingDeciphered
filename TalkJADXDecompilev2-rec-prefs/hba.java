package p000;

import java.net.HttpURLConnection;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

final class hba extends BasicHttpResponse {
    private static final StatusLine f16495b = new BasicStatusLine(HttpVersion.HTTP_1_1, 500, "Unknown error");
    HttpURLConnection f16496a;

    hba() {
        super(f16495b, null, null);
    }
}
