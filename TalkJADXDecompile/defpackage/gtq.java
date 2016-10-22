package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: gtq */
public class gtq {
    public static final int c;
    public static final gtq d;

    static {
        c = gtv.b;
        d = new gtq();
    }

    gtq() {
    }

    private static String b(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(c);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    public int a(Context context) {
        int c = gtv.c(context);
        return gtv.b(context, c) ? 18 : c;
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        if (gwb.X(context) && i == 2) {
            i = 42;
        }
        Intent a = a(context, i, str);
        return a == null ? null : PendingIntent.getActivity(context, i2, a, 268435456);
    }

    public Intent a(Context context, int i, String str) {
        switch (i) {
            case wi.j /*1*/:
            case wi.l /*2*/:
                return gwo.a("com.google.android.gms", gtq.b(context, str));
            case wi.z /*3*/:
                return gwo.a("com.google.android.gms");
            case 42:
                return gwo.a();
            default:
                return null;
        }
    }

    public boolean a(int i) {
        return gtv.c(i);
    }

    public boolean a(Context context, int i) {
        return gtv.b(context, i);
    }

    public boolean a(Context context, String str) {
        return gtv.a(context, str);
    }

    @Deprecated
    public Intent b(int i) {
        return a(null, i, null);
    }

    public void b(Context context) {
        gtv.d(context);
    }

    public void c(Context context) {
        gtv.f(context);
    }
}
