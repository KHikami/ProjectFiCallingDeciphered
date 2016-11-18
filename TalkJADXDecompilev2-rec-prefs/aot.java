package p000;

import android.content.res.AssetManager;
import java.io.InputStream;

public final class aot extends aod<InputStream> {
    protected /* synthetic */ void mo320a(Object obj) {
        ((InputStream) obj).close();
    }

    public aot(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<InputStream> mo321d() {
        return InputStream.class;
    }

    protected /* synthetic */ Object mo319a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
