package p000;

final class nwe {
    private final Object f31170a;
    private final int f31171b;

    nwe(Object obj, int i) {
        this.f31170a = obj;
        this.f31171b = i;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f31170a) * 65535) + this.f31171b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof nwe)) {
            return false;
        }
        nwe nwe = (nwe) obj;
        if (this.f31170a == nwe.f31170a && this.f31171b == nwe.f31171b) {
            return true;
        }
        return false;
    }
}
