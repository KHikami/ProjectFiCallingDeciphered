package p000;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public final class aom extends aod<ParcelFileDescriptor> {
    protected /* synthetic */ void mo320a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public aom(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<ParcelFileDescriptor> mo321d() {
        return ParcelFileDescriptor.class;
    }

    protected /* synthetic */ Object mo319a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
