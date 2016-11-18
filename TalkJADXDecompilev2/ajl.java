package defpackage;

import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

public class ajl extends ThreadSafeClientConnManager {
    private ajl(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }
}
