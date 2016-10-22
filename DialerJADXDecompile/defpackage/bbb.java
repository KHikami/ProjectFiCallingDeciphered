package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: bbb */
final class bbb {
    ayo a;
    bbe b;
    boolean c;

    public bbb(baw baw, ayo ayo, bbe bbe) {
        this.c = false;
        this.a = ayo;
        this.b = bbe;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bbb) {
            return Objects.equals(((bbb) obj).a.d, this.a.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.d.hashCode();
    }
}
