package defpackage;

/* compiled from: PG */
/* renamed from: aat */
public final class aat {
    public static ii d;
    public int a;
    public yx b;
    yx c;

    static {
        d = new ii(20);
    }

    private aat() {
    }

    public static aat a() {
        aat aat = (aat) d.a();
        return aat == null ? new aat() : aat;
    }

    static void a(aat aat) {
        aat.a = 0;
        aat.b = null;
        aat.c = null;
        d.a(aat);
    }
}
