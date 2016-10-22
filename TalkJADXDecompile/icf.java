import java.util.Map;

final class icf extends ich<E, E> {
    final /* synthetic */ ice a;

    icf(ice ice) {
        this.a = ice;
    }

    protected int a() {
        return this.a.g;
    }

    protected Object a(int i) {
        return this.a.f[i];
    }

    protected int a(Object obj) {
        if (obj == null) {
            return this.a.a();
        }
        return this.a.a(obj, obj.hashCode());
    }

    protected Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    protected void b(int i) {
        this.a.a(i);
    }

    protected void c() {
        this.a.clear();
    }
}
