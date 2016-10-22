import android.content.Context;

/* compiled from: PG */
final class azu implements axg {
    private /* synthetic */ ayo a;
    private /* synthetic */ Context b;
    private /* synthetic */ azs c;

    azu(azs azs, ayo ayo, Context context) {
        this.c = azs;
        this.a = ayo;
        this.b = context;
    }

    public final void a(boolean z) {
        if (this.a.c() == 4 || this.a.c() == 5) {
            int i;
            awm H = buf.H(this.b);
            if (z) {
                i = 1029;
            } else {
                i = 1030;
            }
            H.a(i, this.a.a, this.a.u);
        }
        this.a.o = z;
        this.c.b(this.a);
    }
}
