package p000;

import java.io.File;

public final class ato<Data> implements auh<File, Data> {
    private final ats<Data> f2322a;

    public /* bridge */ /* synthetic */ aui mo377a(Object obj, int i, int i2, anz anz) {
        return m3998a((File) obj);
    }

    public ato(ats<Data> ats_Data) {
        this.f2322a = ats_Data;
    }

    private aui m3998a(File file) {
        return new aui(new bag(file), new atr(file, this.f2322a));
    }
}
