package defpackage;

/* renamed from: atc */
final class atc<Data> implements aoe<Data> {
    private final byte[] a;
    private final atb<Data> b;

    public atc(byte[] bArr, atb<Data> atb_Data) {
        this.a = bArr;
        this.b = atb_Data;
    }

    public void a(amq amq, aof<? super Data> aof__super_Data) {
        aof__super_Data.a(this.b.a(this.a));
    }

    public void a() {
    }

    public void b() {
    }

    public Class<Data> d() {
        return this.b.a();
    }

    public anq c() {
        return anq.LOCAL;
    }
}
