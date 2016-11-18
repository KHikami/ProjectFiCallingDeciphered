package p000;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;

public final class kdy extends kea {
    @kfz(a = "refresh_token")
    private String f21457c;

    public /* synthetic */ kea mo3639a(GenericUrl genericUrl) {
        return m25623b(genericUrl);
    }

    public /* synthetic */ kea mo3640a(String str) {
        return m25624b(str);
    }

    public /* synthetic */ kea mo3641a(String str, Object obj) {
        return m25625b(str, obj);
    }

    public /* synthetic */ kea mo3642b(HttpExecuteInterceptor httpExecuteInterceptor) {
        return m25627a(httpExecuteInterceptor);
    }

    public /* synthetic */ kea mo3643b(HttpRequestInitializer httpRequestInitializer) {
        return m25628a(httpRequestInitializer);
    }

    public /* synthetic */ GenericData set(String str, Object obj) {
        return m25625b(str, obj);
    }

    public kdy(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        super(httpTransport, jsonFactory, genericUrl, "refresh_token");
        m25626c(str);
    }

    public kdy m25628a(HttpRequestInitializer httpRequestInitializer) {
        return (kdy) super.mo3643b(httpRequestInitializer);
    }

    private kdy m25623b(GenericUrl genericUrl) {
        return (kdy) super.mo3639a(genericUrl);
    }

    private kdy m25624b(String str) {
        return (kdy) super.mo3640a(str);
    }

    public kdy m25627a(HttpExecuteInterceptor httpExecuteInterceptor) {
        return (kdy) super.mo3642b(httpExecuteInterceptor);
    }

    private kdy m25626c(String str) {
        this.f21457c = (String) bc.m4799a((Object) str);
        return this;
    }

    private kdy m25625b(String str, Object obj) {
        return (kdy) super.mo3641a(str, obj);
    }
}
