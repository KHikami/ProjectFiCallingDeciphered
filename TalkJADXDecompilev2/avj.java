package defpackage;

import java.io.InputStream;

public final class avj implements auh<atu, InputStream> {
    public static final anw<Integer> a = anw.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    private final aue<atu, atu> b;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((atu) obj, anz);
    }

    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    public avj() {
        this(null);
    }

    public avj(aue<atu, atu> aue_atu__atu) {
        this.b = aue_atu__atu;
    }

    private aui<InputStream> a(int i, anz anz) {
        if (this.b != null) {
            atu atu = (atu) this.b.a(i, 0, 0);
            if (atu == null) {
                this.b.a(i, 0, 0, i);
            } else {
                i = atu;
            }
        }
        return new aui(i, new aoo(i, ((Integer) anz.a(a)).intValue()));
    }
}
