package defpackage;

public final class atj<Data> implements auh<String, Data> {
    private final atk<Data> a;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((String) obj);
    }

    public /* synthetic */ boolean a(Object obj) {
        return ((String) obj).startsWith("data:image");
    }

    public atj(atk<Data> atk_Data) {
        this.a = atk_Data;
    }

    private aui a(String str) {
        return new aui(new bag(str), new atl(str, this.a));
    }
}
