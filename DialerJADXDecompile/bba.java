import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class bba implements bbf {
    private final WeakReference a;

    public bba(baw baw) {
        this.a = new WeakReference(baw);
    }

    public final void a(String str, bbe bbe) {
        d(str, bbe);
    }

    public final void b(String str, bbe bbe) {
        d(str, bbe);
    }

    public final void c(String str, bbe bbe) {
    }

    private final void d(String str, bbe bbe) {
        baw baw = (baw) this.a.get();
        if (baw != null && baw.a.containsKey(str)) {
            bbb bbb = (bbb) baw.a.get(str);
            bbb.b = bbe;
            bbb.c = true;
            baw.a(str);
        }
    }
}
