package defpackage;

final class olb<T> extends olf<T> {
    private final olc<T> b;

    byte[] a(T t) {
        return this.b.a((Object) t).getBytes(mes.a);
    }

    T a(byte[] bArr) {
        return this.b.a(new String(bArr, mes.a));
    }

    olb(String str, olc<T> olc_T) {
        super(str);
        bm.a(!str.endsWith("-bin"), "ASCII header is named %s. It must not end with %s", str, "-bin");
        this.b = (olc) bm.a(olc_T, "marshaller");
    }
}
