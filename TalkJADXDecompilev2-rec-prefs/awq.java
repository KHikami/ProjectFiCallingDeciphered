package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class awq extends awa {
    private static final byte[] f2445b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    public awq(Context context) {
        super(context);
    }

    protected Bitmap mo397a(ard ard, Bitmap bitmap, int i, int i2) {
        return axa.m4247b(ard, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof awq;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        messageDigest.update(f2445b);
    }
}
