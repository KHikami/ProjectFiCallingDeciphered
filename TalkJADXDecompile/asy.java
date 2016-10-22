public final class asy<Data> implements auh<byte[], Data> {
    private final atb<Data> a;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((byte[]) obj);
    }

    public asy(atb<Data> atb_Data) {
        this.a = atb_Data;
    }

    private aui a(byte[] bArr) {
        return new aui(bae.b, new atc(bArr, this.a));
    }
}
