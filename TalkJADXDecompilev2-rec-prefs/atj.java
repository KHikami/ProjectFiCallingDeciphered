package p000;

public final class atj<Data> implements auh<String, Data> {
    private final atk<Data> f2316a;

    public /* bridge */ /* synthetic */ aui mo377a(Object obj, int i, int i2, anz anz) {
        return m3983a((String) obj);
    }

    public /* synthetic */ boolean mo378a(Object obj) {
        return ((String) obj).startsWith("data:image");
    }

    public atj(atk<Data> atk_Data) {
        this.f2316a = atk_Data;
    }

    private aui m3983a(String str) {
        return new aui(new bag(str), new atl(str, this.f2316a));
    }
}
