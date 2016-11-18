package p000;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;

public class kea extends GenericData {
    HttpRequestInitializer f21451a;
    HttpExecuteInterceptor f21452b;
    private final HttpTransport f21453c;
    private final JsonFactory f21454d;
    private GenericUrl f21455e;
    @kfz(a = "grant_type")
    private String f21456f;

    public /* synthetic */ GenericData set(String str, Object obj) {
        return mo3641a(str, obj);
    }

    public kea(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        this.f21453c = (HttpTransport) bc.m4799a((Object) httpTransport);
        this.f21454d = (JsonFactory) bc.m4799a((Object) jsonFactory);
        mo3639a(genericUrl);
        mo3640a(str);
    }

    public kea mo3643b(HttpRequestInitializer httpRequestInitializer) {
        this.f21451a = httpRequestInitializer;
        return this;
    }

    public kea mo3642b(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.f21452b = httpExecuteInterceptor;
        return this;
    }

    public kea mo3639a(GenericUrl genericUrl) {
        this.f21455e = genericUrl;
        bc.m4814a(genericUrl.getFragment() == null);
        return this;
    }

    public kea mo3640a(String str) {
        this.f21456f = (String) bc.m4799a((Object) str);
        return this;
    }

    public kea mo3641a(String str, Object obj) {
        return (kea) super.set(str, obj);
    }

    public ked m25620a() {
        HttpRequest buildPostRequest = this.f21453c.createRequestFactory(new keb(this)).buildPostRequest(this.f21455e, new UrlEncodedContent(this));
        buildPostRequest.setParser(new JsonObjectParser(this.f21454d));
        buildPostRequest.setThrowExceptionOnExecuteError(false);
        HttpResponse execute = buildPostRequest.execute();
        if (execute.isSuccessStatusCode()) {
            return (ked) execute.parseAs(ked.class);
        }
        throw kee.m25646a(this.f21454d, execute);
    }
}
