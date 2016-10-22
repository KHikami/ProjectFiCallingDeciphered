package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: dag */
final class dag implements Serializable {
    private static final long serialVersionUID = 0;
    private czy a;

    dag(czy czy) {
        this.a = czy;
    }

    final Object readResolve() {
        return this.a.c();
    }
}
