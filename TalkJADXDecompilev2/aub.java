package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

public final class aub implements auh<Uri, File> {
    private final Context a;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((Uri) obj);
    }

    public /* synthetic */ boolean a(Object obj) {
        return gwb.a((Uri) obj);
    }

    aub(Context context) {
        this.a = context;
    }

    private aui a(Uri uri) {
        return new aui(new bag(uri), new aud(this.a, uri));
    }
}
