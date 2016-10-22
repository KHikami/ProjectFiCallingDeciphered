package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: awe */
public final class awe extends awa {
    private static final byte[] b;

    static {
        b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);
    }

    public awe(Context context) {
        super(context);
    }

    protected Bitmap a(ard ard, Bitmap bitmap, int i, int i2) {
        return axa.d(ard, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof awe;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".hashCode();
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
