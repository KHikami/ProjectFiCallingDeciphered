package p000;

public abstract class mpz {
    public final int f28058b;
    final mog f28059c;

    public abstract Object mo3910a(Object obj, mon mon);

    public abstract String mo3911a();

    public static <T> mps<T> m32670a(String str, T t, mon mon) {
        return new mqa(t, mon, str);
    }

    protected mpz(mog mog, int i) {
        if (mog == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i < 0) {
            throw new IllegalArgumentException("invalid index: " + i);
        } else {
            this.f28058b = i;
            this.f28059c = mog;
        }
    }
}
