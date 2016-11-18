package p000;

final class etv {
    long f12255a;
    Object f12256b;

    etv(Object obj, long j) {
        this.f12256b = obj;
        this.f12255a = j;
    }

    boolean m14519a(Object obj) {
        return obj == this.f12256b || (obj != null && obj.equals(this.f12256b));
    }
}
