package p000;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class asw implements asv<ParcelFileDescriptor>, auj<Uri, ParcelFileDescriptor> {
    private final AssetManager f2307a;

    public asw(AssetManager assetManager) {
        this.f2307a = assetManager;
    }

    public auh<Uri, ParcelFileDescriptor> mo380a(aup aup) {
        return new asu(this.f2307a, this);
    }

    public aoe<ParcelFileDescriptor> mo379a(AssetManager assetManager, String str) {
        return new aom(assetManager, str);
    }
}
