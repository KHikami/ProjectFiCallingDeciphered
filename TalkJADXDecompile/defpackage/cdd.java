package defpackage;

import java.util.Arrays;

/* renamed from: cdd */
final class cdd {
    final cia a;
    final int b;

    cdd(cia cia, int i) {
        ba.a((Object) cia);
        this.a = cia;
        this.b = i;
    }

    String a() {
        return this.a.c().getName();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdd)) {
            return false;
        }
        cdd cdd = (cdd) obj;
        if (cdd.a.equals(this.a) && cdd.b == this.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }
}
