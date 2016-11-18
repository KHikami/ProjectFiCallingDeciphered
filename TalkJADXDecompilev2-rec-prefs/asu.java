package p000;

import android.content.res.AssetManager;
import android.net.Uri;

public final class asu<Data> implements auh<Uri, Data> {
    private static final int f2304a = 22;
    private final AssetManager f2305b;
    private final asv<Data> f2306c;

    public /* bridge */ /* synthetic */ aui mo377a(Object obj, int i, int i2, anz anz) {
        return m3948a((Uri) obj);
    }

    public /* synthetic */ boolean mo378a(Object obj) {
        Uri uri = (Uri) obj;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }

    public asu(AssetManager assetManager, asv<Data> asv_Data) {
        this.f2305b = assetManager;
        this.f2306c = asv_Data;
    }

    private aui m3948a(Uri uri) {
        return new aui(new bag(uri), this.f2306c.mo379a(this.f2305b, uri.toString().substring(f2304a)));
    }
}
