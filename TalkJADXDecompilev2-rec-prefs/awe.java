package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class awe extends awa {
    private static final byte[] f2425b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    public awe(Context context) {
        super(context);
    }

    protected Bitmap mo397a(ard ard, Bitmap bitmap, int i, int i2) {
        return axa.m4249d(ard, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof awe;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        messageDigest.update(f2425b);
    }
}
