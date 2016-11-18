package p000;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;

final class kec implements HttpExecuteInterceptor {
    final /* synthetic */ HttpExecuteInterceptor f21467a;
    final /* synthetic */ keb f21468b;

    kec(keb keb, HttpExecuteInterceptor httpExecuteInterceptor) {
        this.f21468b = keb;
        this.f21467a = httpExecuteInterceptor;
    }

    public void intercept(HttpRequest httpRequest) {
        if (this.f21467a != null) {
            this.f21467a.intercept(httpRequest);
        }
        if (this.f21468b.f21466a.f21452b != null) {
            this.f21468b.f21466a.f21452b.intercept(httpRequest);
        }
    }
}
