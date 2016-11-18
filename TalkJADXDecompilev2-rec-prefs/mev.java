package p000;

final class mev extends meu {
    final /* synthetic */ String f27593b;
    final /* synthetic */ meu f27594c;

    mev(meu meu, meu meu2, String str) {
        this.f27594c = meu;
        this.f27593b = str;
        super(meu2);
    }

    CharSequence mo3740a(Object obj) {
        return obj == null ? this.f27593b : this.f27594c.mo3740a(obj);
    }

    public meu mo3741b(String str) {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
