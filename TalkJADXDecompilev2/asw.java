package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class asw implements asv<ParcelFileDescriptor>, auj<Uri, ParcelFileDescriptor> {
    private final AssetManager a;

    public asw(AssetManager assetManager) {
        this.a = assetManager;
    }

    public auh<Uri, ParcelFileDescriptor> a(aup aup) {
        return new asu(this.a, this);
    }

    public aoe<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
        return new aom(assetManager, str);
    }
}
