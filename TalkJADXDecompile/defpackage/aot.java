package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: aot */
public final class aot extends aod<InputStream> {
    protected /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    public aot(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<InputStream> d() {
        return InputStream.class;
    }

    protected /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
