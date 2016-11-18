package defpackage;

public final class lka {
    private final ljo a;

    public static lka a() {
        return new lka(lkb.b());
    }

    public static Runnable a(lka lka, Runnable runnable) {
        return lka == null ? runnable : ljy.a(lka.b(), runnable);
    }

    private lka(ljo ljo) {
        this.a = ljo;
    }

    private ljo b() {
        return this.a;
    }

    public String toString() {
        if (this.a == null) {
            return "null ref";
        }
        return this.a.toString();
    }
}
