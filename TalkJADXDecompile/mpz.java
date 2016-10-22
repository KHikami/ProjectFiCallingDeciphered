public abstract class mpz {
    public final int b;
    final mog c;

    public abstract Object a(Object obj, mon mon);

    public abstract String a();

    public static <T> mps<T> a(String str, T t, mon mon) {
        return new mqa(t, mon, str);
    }

    protected mpz(mog mog, int i) {
        if (mog == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i < 0) {
            throw new IllegalArgumentException("invalid index: " + i);
        } else {
            this.b = i;
            this.c = mog;
        }
    }
}
