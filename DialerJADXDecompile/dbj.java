/* compiled from: PG */
final class dbj extends czm {
    private transient Object b;
    private transient Object c;
    private transient czm d;

    dbj(Object obj, Object obj2) {
        buf.f(obj, obj2);
        this.b = obj;
        this.c = obj2;
    }

    private dbj(Object obj, Object obj2, czm czm) {
        this.b = obj;
        this.c = obj2;
        this.d = czm;
    }

    public final Object get(Object obj) {
        return this.b.equals(obj) ? this.c : null;
    }

    public final int size() {
        return 1;
    }

    public final boolean containsKey(Object obj) {
        return this.b.equals(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.c.equals(obj);
    }

    final dao d() {
        return dao.a(day.a(this.b, this.c));
    }

    final dao f() {
        return dao.a(this.b);
    }

    public final czm a() {
        czm czm = this.d;
        if (czm != null) {
            return czm;
        }
        czm = new dbj(this.c, this.b, this);
        this.d = czm;
        return czm;
    }
}
