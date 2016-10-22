import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

public class bqp {
    public static final int b;
    public static final bqp c;

    static {
        b = bqu.a;
        c = new bqp();
    }

    bqp() {
    }

    public static boolean a(Context context, String str) {
        return bqu.a(context, str);
    }

    private static String b(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(b);
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

    public static void b(Context context) {
        bqu.d(context);
    }

    public int a(Context context) {
        int b = bqu.b(context);
        return bqu.b(context, b) ? 18 : b;
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent a = a(context, i, str);
        return a == null ? null : PendingIntent.getActivity(context, i2, a, 268435456);
    }

    public Intent a(Context context, int i, String str) {
        switch (i) {
            case rq.b /*1*/:
            case rq.c /*2*/:
                return buy.a("com.google.android.gms", b(context, str));
            case rl.e /*3*/:
                return buy.a("com.google.android.gms");
            case 42:
                return buy.a();
            default:
                return null;
        }
    }

    public boolean a(int i) {
        return bqu.c(i);
    }

    public boolean a(Context context, int i) {
        return bqu.b(context, i);
    }

    @Deprecated
    public Intent b(int i) {
        return a(null, i, null);
    }
}
