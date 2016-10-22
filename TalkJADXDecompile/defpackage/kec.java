package defpackage;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;

/* renamed from: kec */
final class kec implements HttpExecuteInterceptor {
    final /* synthetic */ HttpExecuteInterceptor a;
    final /* synthetic */ keb b;

    kec(keb keb, HttpExecuteInterceptor httpExecuteInterceptor) {
        this.b = keb;
        this.a = httpExecuteInterceptor;
    }

    public void intercept(HttpRequest httpRequest) {
        if (this.a != null) {
            this.a.intercept(httpRequest);
        }
        if (this.b.a.b != null) {
            this.b.a.b.intercept(httpRequest);
        }
    }
}
