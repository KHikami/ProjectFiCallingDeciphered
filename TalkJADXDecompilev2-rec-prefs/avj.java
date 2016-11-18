package p000;

import java.io.InputStream;

public final class avj implements auh<atu, InputStream> {
    public static final anw<Integer> f2396a = anw.m3521a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    private final aue<atu, atu> f2397b;

    public /* bridge */ /* synthetic */ aui mo377a(Object obj, int i, int i2, anz anz) {
        return m4115a((atu) obj, anz);
    }

    public /* bridge */ /* synthetic */ boolean mo378a(Object obj) {
        return true;
    }

    public avj() {
        this(null);
    }

    public avj(aue<atu, atu> aue_atu__atu) {
        this.f2397b = aue_atu__atu;
    }

    private aui<InputStream> m4115a(int i, anz anz) {
        if (this.f2397b != null) {
            atu atu = (atu) this.f2397b.m4037a(i, 0, 0);
            if (atu == null) {
                this.f2397b.m4038a(i, 0, 0, i);
            } else {
                i = atu;
            }
        }
        return new aui(i, new aoo(i, ((Integer) anz.m3528a(f2396a)).intValue()));
    }
}
