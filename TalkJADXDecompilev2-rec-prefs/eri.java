package p000;

final class eri {
    private final ld f12123a = new ld();

    eri() {
    }

    public etu m14327a(int i, String str) {
        Object etu = new etu(i, str);
        this.f12123a.m1201a((Object) str, etu);
        return etu;
    }

    public etu m14328a(int i, String str, boolean z) {
        etu etu = (etu) this.f12123a.m1200a((Object) str);
        if (etu == null || etu.f12252a != i) {
            etu = null;
        }
        if (etu == null && z) {
            return m14327a(i, str);
        }
        return etu;
    }
}
