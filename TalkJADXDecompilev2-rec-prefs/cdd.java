package p000;

import java.util.Arrays;

final class cdd {
    final cia f5054a;
    final int f5055b;

    cdd(cia cia, int i) {
        ba.m4536a((Object) cia);
        this.f5054a = cia;
        this.f5055b = i;
    }

    String m7251a() {
        return this.f5054a.mo987c().getName();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdd)) {
            return false;
        }
        cdd cdd = (cdd) obj;
        if (cdd.f5054a.equals(this.f5054a) && cdd.f5055b == this.f5055b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5054a, Integer.valueOf(this.f5055b)});
    }
}
