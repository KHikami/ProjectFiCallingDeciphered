package p000;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import java.util.Collection;

public class kdx {
    final kdw f21443a;
    HttpTransport f21444b;
    JsonFactory f21445c;
    GenericUrl f21446d;
    kfk f21447e = kfk.f21569a;
    HttpExecuteInterceptor f21448f;
    HttpRequestInitializer f21449g;
    Collection<C0000a> f21450h = gwb.aM();

    public kdx(kdw kdw) {
        this.f21443a = (kdw) bc.m4799a((Object) kdw);
    }

    public kdx mo3650a(String str) {
        this.f21446d = str == null ? null : new GenericUrl(str);
        return this;
    }
}
