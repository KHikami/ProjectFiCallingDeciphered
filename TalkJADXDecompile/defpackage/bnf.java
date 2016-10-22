package defpackage;

/* renamed from: bnf */
public abstract class bnf implements bnd {
    private final bnc a;

    abstract boolean a(int i);

    protected bnf(bnc bnc) {
        this.a = bnc;
    }

    public boolean a(int i, bnc bnc) {
        if (this.a == bnc) {
            return a(i);
        }
        return false;
    }
}
