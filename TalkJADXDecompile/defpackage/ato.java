package defpackage;

import java.io.File;

/* renamed from: ato */
public final class ato<Data> implements auh<File, Data> {
    private final ats<Data> a;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((File) obj);
    }

    public ato(ats<Data> ats_Data) {
        this.a = ats_Data;
    }

    private aui a(File file) {
        return new aui(new bag(file), new atr(file, this.a));
    }
}
