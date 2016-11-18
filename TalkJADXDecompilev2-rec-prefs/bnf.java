package p000;

public abstract class bnf implements bnd {
    private final bnc f4036a;

    abstract boolean mo616a(int i);

    protected bnf(bnc bnc) {
        this.f4036a = bnc;
    }

    public boolean mo615a(int i, bnc bnc) {
        if (this.f4036a == bnc) {
            return mo616a(i);
        }
        return false;
    }
}
