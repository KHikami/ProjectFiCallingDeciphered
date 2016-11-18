package defpackage;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

final class aji extends DefaultHttpClient {
    final /* synthetic */ ajg a;

    aji(ajg ajg, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.a = ajg;
        super(clientConnectionManager, httpParams);
    }

    protected BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(ajg.b);
        createHttpProcessor.addRequestInterceptor(new ajj(this.a));
        return createHttpProcessor;
    }

    protected HttpContext createHttpContext() {
        HttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }
}
