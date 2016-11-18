package p000;

import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

public final class asx implements asv<InputStream>, auj<Uri, InputStream> {
    private final AssetManager f2308a;

    public asx(AssetManager assetManager) {
        this.f2308a = assetManager;
    }

    public auh<Uri, InputStream> mo380a(aup aup) {
        return new asu(this.f2308a, this);
    }

    public aoe<InputStream> mo379a(AssetManager assetManager, String str) {
        return new aot(assetManager, str);
    }
}
