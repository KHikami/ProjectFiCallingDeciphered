import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;

final class gmq implements gmp {
    private static final int[] d;
    private final String a;
    private final long b;
    private final int c;

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
            iil.a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("couldn't get package info ").append(valueOf).toString());
            i = -1;
        }
        this.c = a(context);
        if (str == null) {
            str = "(unk)";
        }
        this.a = str;
        this.b = (long) i;
    }

    public boolean a() {
        return this.c == 1;
    }

    public boolean b() {
        return this.c == 2;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public loh e() {
        loh loh = new loh();
        loh.a = Integer.valueOf(1);
        loh.b = Integer.valueOf(this.c);
        loh.c = this.a;
        loh.d = Long.valueOf(this.b);
        loh.e = Build.FINGERPRINT;
        loh.f = Build.HARDWARE;
        return loh;
    }

    static {
        d = new int[]{1, 2, 3, 0};
    }

    private static int a(Context context) {
        int i = 3;
        for (gmo a : jyn.c(context, gmo.class)) {
            int a2 = a.a();
            int[] iArr = d;
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
