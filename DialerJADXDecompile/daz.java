/* compiled from: PG */
public final class daz {
    static final Object[] a;

    static {
        a = new Object[0];
    }

    static Object[] a(Object[] objArr, int i) {
        Object a = buf.a(objArr, i);
        System.arraycopy(objArr, 0, a, 0, Math.min(objArr.length, i));
        return a;
    }

    static Object[] b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }
}
