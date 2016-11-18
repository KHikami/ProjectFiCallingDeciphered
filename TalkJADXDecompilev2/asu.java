package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

public final class asu<Data> implements auh<Uri, Data> {
    private static final int a = 22;
    private final AssetManager b;
    private final asv<Data> c;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((Uri) obj);
    }

    public /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }

    public asu(AssetManager assetManager, asv<Data> asv_Data) {
        this.b = assetManager;
        this.c = asv_Data;
    }

    private aui a(Uri uri) {
        return new aui(new bag(uri), this.c.a(this.b, uri.toString().substring(a)));
    }
}
