package defpackage;

/* renamed from: jwx */
final class jwx implements Comparable<jwx> {
    int a;
    int b;
    String c;

    jwx() {
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((jwx) obj);
    }

    private int a(jwx jwx) {
        int compareTo = this.c.compareTo(jwx.c);
        if (compareTo != 0) {
            return compareTo;
        }
        if (this.a != jwx.a) {
            return this.a - jwx.a;
        }
        if (this.b == jwx.b) {
            return 0;
        }
        return this.b - jwx.b;
    }
}
