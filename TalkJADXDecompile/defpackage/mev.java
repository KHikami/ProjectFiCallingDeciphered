package defpackage;

/* renamed from: mev */
final class mev extends meu {
    final /* synthetic */ String b;
    final /* synthetic */ meu c;

    mev(meu meu, meu meu2, String str) {
        this.c = meu;
        this.b = str;
        super(meu2);
    }

    CharSequence a(Object obj) {
        return obj == null ? this.b : this.c.a(obj);
    }

    public meu b(String str) {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
