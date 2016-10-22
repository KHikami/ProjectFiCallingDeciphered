package defpackage;

import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

/* renamed from: ajm */
final class ajm extends ajl {
    public ajm(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(schemeRegistry, (byte) 0);
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new aje(schemeRegistry, false);
    }
}
