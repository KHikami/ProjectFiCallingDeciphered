package defpackage;

import com.google.api.client.http.HttpStatusCodes;
import java.net.HttpURLConnection;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: hba */
final class hba extends BasicHttpResponse {
    private static final StatusLine b;
    HttpURLConnection a;

    static {
        b = new BasicStatusLine(HttpVersion.HTTP_1_1, HttpStatusCodes.STATUS_CODE_SERVER_ERROR, "Unknown error");
    }

    hba() {
        super(b, null, null);
    }
}
