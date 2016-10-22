import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class ai {
    final WeakReference a;
    public int b;

    public ai(int i, ah ahVar) {
        this.a = new WeakReference(ahVar);
        this.b = i;
    }

    final boolean a(ah ahVar) {
        return ahVar != null && this.a.get() == ahVar;
    }
}
