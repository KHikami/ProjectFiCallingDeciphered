package defpackage;

/* renamed from: btu */
final class btu extends btr {
    private /* synthetic */ char b;

    btu(char c) {
        this.b = c;
    }

    public final btr a(btr btr) {
        return btr.a(this.b) ? btr : super.a(btr);
    }

    public final boolean a(char c) {
        return c == this.b;
    }
}
