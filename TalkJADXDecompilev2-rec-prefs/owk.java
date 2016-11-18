package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

public final class owk {
    private static final Object f34442a = new Object();
    private static int f34443b = 0;

    public static String m39807a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append('/');
        stringBuilder.append(owk.m39810c(context));
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
        owk.m39808a(stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static String m39809b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        owk.m39808a(stringBuilder);
        return stringBuilder.toString();
    }

    private static int m39810c(Context context) {
        int i;
        synchronized (f34442a) {
            if (f34443b == 0) {
                try {
                    f34443b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (NameNotFoundException e) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i = f34443b;
        }
        return i;
    }

    private static void m39808a(StringBuilder stringBuilder) {
        stringBuilder.append(" Cronet/");
        stringBuilder.append("54.0.2837.2");
    }
}
