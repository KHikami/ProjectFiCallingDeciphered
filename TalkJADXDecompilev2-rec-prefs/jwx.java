package p000;

final class jwx implements Comparable<jwx> {
    int f21177a;
    int f21178b;
    String f21179c;

    jwx() {
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m25354a((jwx) obj);
    }

    private int m25354a(jwx jwx) {
        int compareTo = this.f21179c.compareTo(jwx.f21179c);
        if (compareTo != 0) {
            return compareTo;
        }
        if (this.f21177a != jwx.f21177a) {
            return this.f21177a - jwx.f21177a;
        }
        if (this.f21178b == jwx.f21178b) {
            return 0;
        }
        return this.f21178b - jwx.f21178b;
    }
}
