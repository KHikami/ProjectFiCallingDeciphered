package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: daj */
final class daj implements Serializable {
    private static final long serialVersionUID = 0;
    private czy a;

    daj(czy czy) {
        this.a = czy;
    }

    final Object readResolve() {
        return this.a.e();
    }
}
