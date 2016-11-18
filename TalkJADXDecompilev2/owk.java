package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

public final class owk {
    private static final Object a = new Object();
    private static int b = 0;

    public static String a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append('/');
        stringBuilder.append(owk.c(context));
        stringBuilder.append(" (Linux; U; Android ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append("; ");
        stringBuilder.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            stringBuilder.append("; ");
            stringBuilder.append(str);
        }
        str = Build.ID;
        if (str.length() > 0) {
            stringBuilder.append("; Build/");
            stringBuilder.append(str);
        }
        stringBuilder.append(";");
        owk.a(stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static String b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        owk.a(stringBuilder);
        return stringBuilder.toString();
    }

    private static int c(Context context) {
        int i;
        synchronized (a) {
            if (b == 0) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (NameNotFoundException e) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i = b;
        }
        return i;
    }

    private static void a(StringBuilder stringBuilder) {
        stringBuilder.append(" Cronet/");
        stringBuilder.append("54.0.2837.2");
    }
}
