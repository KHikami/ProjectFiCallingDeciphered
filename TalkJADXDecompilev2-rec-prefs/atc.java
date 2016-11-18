package p000;

final class atc<Data> implements aoe<Data> {
    private final byte[] f2312a;
    private final atb<Data> f2313b;

    public atc(byte[] bArr, atb<Data> atb_Data) {
        this.f2312a = bArr;
        this.f2313b = atb_Data;
    }

    public void mo312a(amq amq, aof<? super Data> aof__super_Data) {
        aof__super_Data.mo326a(this.f2313b.mo382a(this.f2312a));
    }

    public void mo311a() {
    }

    public void mo313b() {
    }

    public Class<Data> mo321d() {
        return this.f2313b.mo381a();
    }

    public anq mo314c() {
        return anq.LOCAL;
    }
}
