import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;

public final class kdy extends kea {
    @kfz(a = "refresh_token")
    private String c;

    public /* synthetic */ kea a(GenericUrl genericUrl) {
        return b(genericUrl);
    }

    public /* synthetic */ kea a(String str) {
        return b(str);
    }

    public /* synthetic */ kea a(String str, Object obj) {
        return b(str, obj);
    }

    public /* synthetic */ kea b(HttpExecuteInterceptor httpExecuteInterceptor) {
        return a(httpExecuteInterceptor);
    }

    public /* synthetic */ kea b(HttpRequestInitializer httpRequestInitializer) {
        return a(httpRequestInitializer);
    }

    public /* synthetic */ GenericData set(String str, Object obj) {
        return b(str, obj);
    }

    public kdy(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        super(httpTransport, jsonFactory, genericUrl, "refresh_token");
        c(str);
    }

    public kdy a(HttpRequestInitializer httpRequestInitializer) {
        return (kdy) super.b(httpRequestInitializer);
    }

    private kdy b(GenericUrl genericUrl) {
        return (kdy) super.a(genericUrl);
    }

    private kdy b(String str) {
        return (kdy) super.a(str);
    }

    public kdy a(HttpExecuteInterceptor httpExecuteInterceptor) {
        return (kdy) super.b(httpExecuteInterceptor);
    }

    private kdy c(String str) {
        this.c = (String) bc.a((Object) str);
        return this;
    }

    private kdy b(String str, Object obj) {
        return (kdy) super.a(str, obj);
    }
}
