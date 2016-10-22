package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: asx */
public final class asx implements asv<InputStream>, auj<Uri, InputStream> {
    private final AssetManager a;

    public asx(AssetManager assetManager) {
        this.a = assetManager;
    }

    public auh<Uri, InputStream> a(aup aup) {
        return new asu(this.a, this);
    }

    public aoe<InputStream> a(AssetManager assetManager, String str) {
        return new aot(assetManager, str);
    }
}
