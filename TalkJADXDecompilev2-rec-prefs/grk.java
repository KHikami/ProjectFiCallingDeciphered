package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.concurrent.TimeUnit;

final class grk implements bhm {
    private final Uri f15964a;
    private final Bitmap f15965b;

    grk(Uri uri, Bitmap bitmap) {
        this.f15964a = uri;
        this.f15965b = bitmap;
    }

    public int mo539a(Context context, bhb bhb) {
        grm a = ((grq) jyn.m25426a(context, grq.class)).mo2324a(context);
        a.m18345a().mo2508a(1000, TimeUnit.MILLISECONDS);
        if (a.m18345a().mo2524e()) {
            hxy hxy = (hxy) a.m18350b().m21191a(a.m18345a(), this.f15964a).mo2418a();
            try {
                if (hxy.mo1279k().m9663d() && hxy.mo2074a() > 0) {
                    Object obj;
                    hyg c = grm.m18341c((hxw) hxy.mo2075a(0));
                    gsd gsd = new gsd(c.m21250b());
                    Asset a2 = gwb.m1590a(this.f15965b);
                    if (gsd.m18441b() == null) {
                        obj = 1;
                    } else if (a.m18346a(a2.m10001a()).equals(gsd.m18441b().m10002b())) {
                        obj = null;
                    } else {
                        int i = 1;
                    }
                    if (obj != null) {
                        gsd.m18437a(a2);
                        if (glk.m17973a("Babel_wear", 2)) {
                            String.format("UploadConversationAvatarTask avatar loaded: %s, size: %d", new Object[]{this.f15964a.getLastPathSegment(), Integer.valueOf(a2.m10001a().length)});
                        }
                        a.m18350b().m21193a(a.m18345a(), c.m21251c()).mo2418a();
                    } else {
                        glk.m17973a("Babel_wear", 2);
                    }
                }
                a.m18353e();
                hxy.mo2073b();
                return bhn.f3348a;
            } catch (Throwable th) {
                a.m18353e();
                hxy.mo2073b();
            }
        } else {
            Log.e("Babel_wear", "GoogleApiClient failed to connect");
            return bhn.f3351d;
        }
    }
}
