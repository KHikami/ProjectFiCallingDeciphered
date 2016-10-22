package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

/* renamed from: jto */
public final class jto {
    private final ihf a;
    private final Uri b;
    private long c;

    public jto(Context context, Uri uri) {
        this.c = 3000;
        this.a = (ihf) jyn.a(context, ihf.class);
        this.b = uri;
    }

    public boolean a() {
        jtp jtp = new jtp();
        long currentTimeMillis = System.currentTimeMillis() + this.c;
        while (!jtp.a()) {
            long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
            if (currentTimeMillis2 <= 0) {
                if (Log.isLoggable("BlockingPanoDetector", 5)) {
                    String valueOf = String.valueOf(this.b);
                    new StringBuilder(String.valueOf(valueOf).length() + 56).append("pano wait time expired, assume image is not a pano; uri=").append(valueOf);
                }
                return jtp.b();
            }
            try {
                Thread.sleep(Math.min(5, currentTimeMillis2));
            } catch (InterruptedException e) {
            }
        }
        return jtp.b();
    }
}
