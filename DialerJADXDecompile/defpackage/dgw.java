package defpackage;

/* compiled from: PG */
/* renamed from: dgw */
final class dgw extends dha {
    private final dgx c;

    final byte[] a(Object obj) {
        return this.c.a(obj).getBytes(cyg.a);
    }

    final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, cyg.a));
    }

    dgw(String str, dgx dgx) {
        super(str);
        cob.a(!str.endsWith("-bin"), "ASCII header is named %s. It must not end with %s", (Object) str, (Object) "-bin");
        this.c = (dgx) cob.i((Object) dgx);
    }
}
