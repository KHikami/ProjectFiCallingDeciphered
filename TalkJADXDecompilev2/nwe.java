package defpackage;

final class nwe {
    private final Object a;
    private final int b;

    nwe(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof nwe)) {
            return false;
        }
        nwe nwe = (nwe) obj;
        if (this.a == nwe.a && this.b == nwe.b) {
            return true;
        }
        return false;
    }
}
