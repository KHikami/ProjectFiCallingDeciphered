package p000;

public abstract class kgw extends kgs {
    protected abstract int mo3674a(CharSequence charSequence, int i, int i2);

    protected abstract char[] mo3676a(int i);

    static char[] m25776a(char[] cArr, int i, int i2) {
        Object obj = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, obj, 0, i);
        }
        return obj;
    }
}
