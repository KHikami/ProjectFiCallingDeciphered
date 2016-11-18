package p000;

import com.google.api.client.http.HttpResponse;
import java.io.InputStream;

public class ipc {
    final HttpResponse f18637a;

    public InputStream m22832a() {
        return this.f18637a.getContent();
    }

    public String m22833a(String str) {
        return this.f18637a.getHeaders().getFirstHeaderStringValue(str);
    }

    ipc(HttpResponse httpResponse) {
        this.f18637a = httpResponse;
    }
}
