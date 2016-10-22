final class etv {
    long a;
    Object b;

    etv(Object obj, long j) {
        this.b = obj;
        this.a = j;
    }

    boolean a(Object obj) {
        return obj == this.b || (obj != null && obj.equals(this.b));
    }
}
