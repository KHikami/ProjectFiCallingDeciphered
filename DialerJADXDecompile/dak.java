import java.util.Iterator;

/* compiled from: PG */
final class dak extends czp {
    final czy a;

    public final /* synthetic */ Iterator iterator() {
        return b();
    }

    dak(czy czy) {
        this.a = czy;
    }

    public final int size() {
        return this.a.size();
    }

    public final dbn b() {
        return new dal(this);
    }

    public final boolean contains(Object obj) {
        return obj != null && das.a(b(), obj);
    }

    final czt d() {
        return new dam(this, this.a.c().c());
    }

    final Object writeReplace() {
        return new dan(this.a);
    }
}
