package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.concurrent.TimeUnit;

/* renamed from: grk */
final class grk implements bhm {
    private final Uri a;
    private final Bitmap b;

    grk(Uri uri, Bitmap bitmap) {
        this.a = uri;
        this.b = bitmap;
    }

    public int a(Context context, bhb bhb) {
        grm a = ((grq) jyn.a(context, grq.class)).a(context);
        a.a().a(1000, TimeUnit.MILLISECONDS);
        if (a.a().e()) {
            hxy hxy = (hxy) a.b().a(a.a(), this.a).a();
            try {
                if (hxy.k().d() && hxy.a() > 0) {
                    Object obj;
                    hyg c = grm.c((hxw) hxy.a(0));
                    gsd gsd = new gsd(c.b());
                    Asset a2 = gwb.a(this.b);
                    if (gsd.b() == null) {
                        obj = 1;
                    } else if (a.a(a2.a()).equals(gsd.b().b())) {
                        obj = null;
                    } else {
                        int i = 1;
                    }
                    if (obj != null) {
                        gsd.a(a2);
                        if (glk.a("Babel_wear", 2)) {
                            String.format("UploadConversationAvatarTask avatar loaded: %s, size: %d", new Object[]{this.a.getLastPathSegment(), Integer.valueOf(a2.a().length)});
                        }
                        a.b().a(a.a(), c.c()).a();
                    } else {
                        glk.a("Babel_wear", 2);
                    }
                }
                a.e();
                hxy.b();
                return bhn.a;
            } catch (Throwable th) {
                a.e();
                hxy.b();
            }
        } else {
            Log.e("Babel_wear", "GoogleApiClient failed to connect");
            return bhn.d;
        }
    }
}
