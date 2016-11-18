package defpackage;

final class eri {
    private final ld a = new ld();

    eri() {
    }

    public etu a(int i, String str) {
        Object etu = new etu(i, str);
        this.a.a((Object) str, etu);
        return etu;
    }

    public etu a(int i, String str, boolean z) {
        etu etu = (etu) this.a.a((Object) str);
        if (etu == null || etu.a != i) {
            etu = null;
        }
        if (etu == null && z) {
            return a(i, str);
        }
        return etu;
    }
}
