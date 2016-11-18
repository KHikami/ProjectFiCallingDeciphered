package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.concurrent.TimeUnit;

final class grl implements bhj, bhm {
    private final String a;
    private final Bitmap b;

    grl(String str, Bitmap bitmap) {
        this.a = str;
        this.b = bitmap;
    }

    public int a(Context context, bhb bhb) {
        grm a = ((grq) jyn.a(context, grq.class)).a(context);
        try {
            a.a().a(1000, TimeUnit.MILLISECONDS);
            if (a.a().e()) {
                String str = "/hangouts/profiles/";
                String valueOf = String.valueOf(this.a);
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                hyg a2 = hyg.a(valueOf);
                hxz b = a2.b();
                b.a("10", this.a);
                Asset a3 = gwb.a(this.b);
                b.a("5", a3);
                a.b().a(a.a(), a2.c()).a();
                str = "UploadUserAvatarTask avatar loaded: %s, size: %d";
                Object[] objArr = new Object[2];
                String str2 = "/hangouts/profiles/";
                valueOf = String.valueOf(this.a);
                objArr[0] = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                objArr[1] = Integer.valueOf(a3.a().length);
                String.format(str, objArr);
                a.e();
                return bhn.a;
            }
            Log.e("Babel_wear", "GoogleApiClient failed to connect");
            int i = bhn.d;
            return i;
        } finally {
            a.e();
        }
    }

    public String b() {
        return getClass().getSimpleName();
    }

    public bhk c() {
        return bhk.NONE;
    }
}
