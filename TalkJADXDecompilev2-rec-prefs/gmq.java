package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;

final class gmq implements gmp {
    private static final int[] f15659d = new int[]{1, 2, 3, 0};
    private final String f15660a;
    private final long f15661b;
    private final int f15662c;

    gmq(Context context) {
        int i;
        String str = null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            int indexOf = str.indexOf("-");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            i = packageInfo.versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            iil.m21870a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("couldn't get package info ").append(valueOf).toString());
            i = -1;
        }
        this.f15662c = gmq.m18104a(context);
        if (str == null) {
            str = "(unk)";
        }
        this.f15660a = str;
        this.f15661b = (long) i;
    }

    public boolean mo2298a() {
        return this.f15662c == 1;
    }

    public boolean mo2299b() {
        return this.f15662c == 2;
    }

    public String mo2300c() {
        return this.f15660a;
    }

    public long mo2301d() {
        return this.f15661b;
    }

    public loh mo2302e() {
        loh loh = new loh();
        loh.f25866a = Integer.valueOf(1);
        loh.f25867b = Integer.valueOf(this.f15662c);
        loh.f25868c = this.f15660a;
        loh.f25869d = Long.valueOf(this.f15661b);
        loh.f25870e = Build.FINGERPRINT;
        loh.f25871f = Build.HARDWARE;
        return loh;
    }

    private static int m18104a(Context context) {
        int i = 3;
        for (gmo a : jyn.m25438c(context, gmo.class)) {
            int a2 = a.m18098a();
            int[] iArr = f15659d;
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (i3 != a2) {
                    if (i3 == i) {
                        break;
                    }
                    i2++;
                } else {
                    i = a2;
                    break;
                }
            }
        }
        return i;
    }
}
