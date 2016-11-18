package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.concurrent.TimeUnit;

final class grl implements bhj, bhm {
    private final String f15966a;
    private final Bitmap f15967b;

    grl(String str, Bitmap bitmap) {
        this.f15966a = str;
        this.f15967b = bitmap;
    }

    public int mo539a(Context context, bhb bhb) {
        grm a = ((grq) jyn.m25426a(context, grq.class)).mo2324a(context);
        try {
            a.m18345a().mo2508a(1000, TimeUnit.MILLISECONDS);
            if (a.m18345a().mo2524e()) {
                String str = "/hangouts/profiles/";
                String valueOf = String.valueOf(this.f15966a);
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                hyg a2 = hyg.m21248a(valueOf);
                hxz b = a2.m21250b();
                b.m21223a("10", this.f15966a);
                Asset a3 = gwb.m1590a(this.f15967b);
                b.m21221a("5", a3);
                a.m18350b().m21193a(a.m18345a(), a2.m21251c()).mo2418a();
                str = "UploadUserAvatarTask avatar loaded: %s, size: %d";
                Object[] objArr = new Object[2];
                String str2 = "/hangouts/profiles/";
                valueOf = String.valueOf(this.f15966a);
                objArr[0] = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                objArr[1] = Integer.valueOf(a3.m10001a().length);
                String.format(str, objArr);
                a.m18353e();
                return bhn.f3348a;
            }
            Log.e("Babel_wear", "GoogleApiClient failed to connect");
            int i = bhn.f3351d;
            return i;
        } finally {
            a.m18353e();
        }
    }

    public String mo542b() {
        return getClass().getSimpleName();
    }

    public bhk mo543c() {
        return bhk.NONE;
    }
}
