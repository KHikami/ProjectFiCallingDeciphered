package p000;

import android.content.res.Resources;
import android.os.Build.VERSION;

public final class ix {
    public static final iy f19314a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            f19314a = new iz();
        } else if (i >= 13) {
            f19314a = new iz();
        } else {
            f19314a = new iy();
        }
    }

    public static int m23421a(Resources resources) {
        return f19314a.mo3423a(resources);
    }

    public static int m23422b(Resources resources) {
        return f19314a.mo3424b(resources);
    }
}
