package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

public final class jto {
    private final ihf f21037a;
    private final Uri f21038b;
    private long f21039c = 3000;

    public jto(Context context, Uri uri) {
        this.f21037a = (ihf) jyn.m25426a(context, ihf.class);
        this.f21038b = uri;
    }

    public boolean m25203a() {
        jtp jtp = new jtp();
        long currentTimeMillis = System.currentTimeMillis() + this.f21039c;
        while (!jtp.m25204a()) {
            long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
            if (currentTimeMillis2 <= 0) {
                if (Log.isLoggable("BlockingPanoDetector", 5)) {
                    String valueOf = String.valueOf(this.f21038b);
                    new StringBuilder(String.valueOf(valueOf).length() + 56).append("pano wait time expired, assume image is not a pano; uri=").append(valueOf);
                }
                return jtp.m25205b();
            }
            try {
                Thread.sleep(Math.min(5, currentTimeMillis2));
            } catch (InterruptedException e) {
            }
        }
        return jtp.m25205b();
    }
}
