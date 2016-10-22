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
    HttpRequestInitializer a;
    HttpExecuteInterceptor b;
    private final HttpTransport c;
    private final JsonFactory d;
    private GenericUrl e;
    @kfz(a = "grant_type")
    private String f;

    public /* synthetic */ GenericData set(String str, Object obj) {
        return a(str, obj);
    }

    public kea(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        this.c = (HttpTransport) bc.a((Object) httpTransport);
        this.d = (JsonFactory) bc.a((Object) jsonFactory);
        a(genericUrl);
        a(str);
    }

    public kea b(HttpRequestInitializer httpRequestInitializer) {
        this.a = httpRequestInitializer;
        return this;
    }

    public kea b(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.b = httpExecuteInterceptor;
        return this;
    }

    public kea a(GenericUrl genericUrl) {
        this.e = genericUrl;
        bc.a(genericUrl.getFragment() == null);
        return this;
    }

    public kea a(String str) {
        this.f = (String) bc.a((Object) str);
        return this;
    }

    public kea a(String str, Object obj) {
        return (kea) super.set(str, obj);
    }

    public ked a() {
        HttpRequest buildPostRequest = this.c.createRequestFactory(new keb(this)).buildPostRequest(this.e, new UrlEncodedContent(this));
        buildPostRequest.setParser(new JsonObjectParser(this.d));
        buildPostRequest.setThrowExceptionOnExecuteError(false);
        HttpResponse execute = buildPostRequest.execute();
        if (execute.isSuccessStatusCode()) {
            return (ked) execute.parseAs(ked.class);
        }
        throw kee.a(this.d, execute);
    }
}
