package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: awq */
public final class awq extends awa {
    private static final byte[] b;

    static {
        b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);
    }

    public awq(Context context) {
        super(context);
    }

    protected Bitmap a(ard ard, Bitmap bitmap, int i, int i2) {
        return axa.b(ard, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof awq;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
