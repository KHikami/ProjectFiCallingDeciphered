package p000;

final class olb<T> extends olf<T> {
    private final olc<T> f33150b;

    byte[] mo4168a(T t) {
        return this.f33150b.mo4166a((Object) t).getBytes(mes.a);
    }

    T mo4167a(byte[] bArr) {
        return this.f33150b.mo4165a(new String(bArr, mes.a));
    }

    olb(String str, olc<T> olc_T) {
        super(str);
        bm.a(!str.endsWith("-bin"), "ASCII header is named %s. It must not end with %s", str, "-bin");
        this.f33150b = (olc) bm.a(olc_T, "marshaller");
    }
}
