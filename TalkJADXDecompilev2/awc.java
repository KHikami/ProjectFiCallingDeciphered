package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class awc extends awa {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    public awc(Context context) {
        super(context);
    }

    protected Bitmap a(ard ard, Bitmap bitmap, int i, int i2) {
        return axa.a(ard, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof awc;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
