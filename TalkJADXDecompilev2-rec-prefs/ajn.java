package p000;

import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

final class ajn extends ajl {
    public ajn(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new aje(schemeRegistry, true);
    }
}
