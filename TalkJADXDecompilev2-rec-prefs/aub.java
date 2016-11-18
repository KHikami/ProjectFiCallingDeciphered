package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;

public final class aub implements auh<Uri, File> {
    private final Context f2345a;

    public /* bridge */ /* synthetic */ aui mo377a(Object obj, int i, int i2, anz anz) {
        return m4028a((Uri) obj);
    }

    public /* synthetic */ boolean mo378a(Object obj) {
        return gwb.m1910a((Uri) obj);
    }

    aub(Context context) {
        this.f2345a = context;
    }

    private aui m4028a(Uri uri) {
        return new aui(new bag(uri), new aud(this.f2345a, uri));
    }
}
