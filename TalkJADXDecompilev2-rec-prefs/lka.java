package p000;

public final class lka {
    private final ljo f25133a;

    public static lka m29200a() {
        return new lka(lkb.m29209b());
    }

    public static Runnable m29199a(lka lka, Runnable runnable) {
        return lka == null ? runnable : ljy.m29196a(lka.m29201b(), runnable);
    }

    private lka(ljo ljo) {
        this.f25133a = ljo;
    }

    private ljo m29201b() {
        return this.f25133a;
    }

    public String toString() {
        if (this.f25133a == null) {
            return "null ref";
        }
        return this.f25133a.toString();
    }
}
