package defpackage;

/* renamed from: mmr */
public final class mmr {
    static final Object[] a;

    static {
        a = new Object[0];
    }

    public static Object[] b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mmr.a(objArr[i2], i2);
        }
        return objArr;
    }

    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    static <T> T[] a(T[] tArr, int i) {
        Object a = gwb.a((Object[]) tArr, i);
        System.arraycopy(tArr, 0, a, 0, Math.min(tArr.length, i));
        return a;
    }
}
