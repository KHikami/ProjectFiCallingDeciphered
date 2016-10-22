package defpackage;

import com.google.api.client.http.HttpMethods;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* renamed from: amf */
public final class amf extends HttpEntityEnclosingRequestBase {
    public amf(String str) {
        setURI(URI.create(str));
    }

    public String getMethod() {
        return HttpMethods.PATCH;
    }
}
