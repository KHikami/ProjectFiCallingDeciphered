package defpackage;

public abstract class kgw extends kgs {
    protected abstract int a(CharSequence charSequence, int i, int i2);

    protected abstract char[] a(int i);

    static char[] a(char[] cArr, int i, int i2) {
        Object obj = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, obj, 0, i);
        }
        return obj;
    }
}
