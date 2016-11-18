package p000;

public final class mmr {
    static final Object[] f27915a = new Object[0];

    public static Object[] m32524b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mmr.m32522a(objArr[i2], i2);
        }
        return objArr;
    }

    static Object m32522a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    static <T> T[] m32523a(T[] tArr, int i) {
        Object a = gwb.m1961a((Object[]) tArr, i);
        System.arraycopy(tArr, 0, a, 0, Math.min(tArr.length, i));
        return a;
    }
}
