package p000;

import android.content.Context;
import java.util.regex.Pattern;

public final class gzg {
    private static gzg f16424a;
    private static final Pattern f16425c = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    private hbo f16426b;

    private gzg(Context context) {
        this.f16426b = hbo.m19149c(context);
    }

    public static synchronized gzg m19021a(Context context) {
        gzg gzg;
        synchronized (gzg.class) {
            if (f16424a == null) {
                f16424a = new gzg(context);
            }
            gzg = f16424a;
        }
        return gzg;
    }
}
