package p000;

import android.util.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class ajj implements HttpRequestInterceptor {
    final /* synthetic */ ajg f1010a;

    ajj(ajg ajg) {
        this.f1010a = ajg;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        ajk ajk = this.f1010a.f1006c;
        if (ajk != null && Log.isLoggable(ajk.f1015a, ajk.f1016b) && (httpRequest instanceof HttpUriRequest)) {
            Log.println(ajk.f1016b, ajk.f1015a, ajg.m2636a((HttpUriRequest) httpRequest, false));
        }
    }
}
