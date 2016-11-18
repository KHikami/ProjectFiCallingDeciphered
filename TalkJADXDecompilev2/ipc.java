package defpackage;

import com.google.api.client.http.HttpResponse;
import java.io.InputStream;

public class ipc {
    final HttpResponse a;

    public InputStream a() {
        return this.a.getContent();
    }

    public String a(String str) {
        return this.a.getHeaders().getFirstHeaderStringValue(str);
    }

    ipc(HttpResponse httpResponse) {
        this.a = httpResponse;
    }
}
