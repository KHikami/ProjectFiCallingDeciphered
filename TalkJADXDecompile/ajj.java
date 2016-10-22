import android.util.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class ajj implements HttpRequestInterceptor {
    final /* synthetic */ ajg a;

    ajj(ajg ajg) {
        this.a = ajg;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        ajk ajk = this.a.c;
        if (ajk != null && Log.isLoggable(ajk.a, ajk.b) && (httpRequest instanceof HttpUriRequest)) {
            Log.println(ajk.b, ajk.a, ajg.a((HttpUriRequest) httpRequest, false));
        }
    }
}
