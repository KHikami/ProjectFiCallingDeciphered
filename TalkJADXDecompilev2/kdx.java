package defpackage;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import java.util.Collection;

public class kdx {
    final kdw a;
    HttpTransport b;
    JsonFactory c;
    GenericUrl d;
    kfk e = kfk.a;
    HttpExecuteInterceptor f;
    HttpRequestInitializer g;
    Collection<a> h = gwb.aM();

    public kdx(kdw kdw) {
        this.a = (kdw) bc.a((Object) kdw);
    }

    public kdx a(String str) {
        this.d = str == null ? null : new GenericUrl(str);
        return this;
    }
}
