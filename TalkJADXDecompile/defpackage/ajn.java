package defpackage;

import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

/* renamed from: ajn */
final class ajn extends ajl {
    public ajn(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(schemeRegistry, (byte) 0);
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new aje(schemeRegistry, true);
    }
}
