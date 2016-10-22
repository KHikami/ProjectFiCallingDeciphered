package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: dbf */
final class dbf implements Serializable {
    private static final long serialVersionUID = 1;
    private final czm a;

    dbf(czm czm) {
        this.a = czm;
    }

    final Object readResolve() {
        return this.a.a();
    }
}
