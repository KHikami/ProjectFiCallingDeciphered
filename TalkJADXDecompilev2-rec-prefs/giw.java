package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public final class giw {
    private static final Uri f15321a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final String[] f15322b = new String[]{"android_id"};
    private static int f15323c = -1;
    private static int f15324d = -1;
    private static int f15325e = -1;

    public static long m17752a() {
        Throwable th;
        Cursor cursor;
        long j = 0;
        try {
            Cursor query = gwb.m1400H().getContentResolver().query(f15321a, null, null, f15322b, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        long parseLong;
                        String string = query.getString(1);
                        if (string != null) {
                            try {
                                parseLong = Long.parseLong(string);
                            } catch (NumberFormatException e) {
                            }
                        } else {
                            parseLong = 0;
                        }
                        j = parseLong;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return j;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static String m17757b() {
        TelephonyManager telephonyManager = (TelephonyManager) gwb.m1400H().getSystemService("phone");
        if (telephonyManager == null) {
            return "none";
        }
        try {
            return telephonyManager.getNetworkOperator();
        } catch (Exception e) {
            return "none";
        }
    }

    public static void m17753a(View view) {
        int systemUiVisibility = ((view.getSystemUiVisibility() | 1) | 4) | 1024;
        if (VERSION.SDK_INT >= 19) {
            systemUiVisibility = ((systemUiVisibility | 2) | 512) | 2048;
        }
        view.setSystemUiVisibility(systemUiVisibility);
    }

    public static void m17754a(View view, boolean z) {
        int systemUiVisibility = (view.getSystemUiVisibility() & -2) & -5;
        if (z) {
            systemUiVisibility |= 1024;
        } else {
            systemUiVisibility &= -1025;
        }
        if (VERSION.SDK_INT >= 19) {
            systemUiVisibility &= -3;
            if (z) {
                systemUiVisibility |= 512;
            } else {
                systemUiVisibility &= -513;
            }
            systemUiVisibility &= -2049;
        }
        view.setSystemUiVisibility(systemUiVisibility);
    }

    public static int m17751a(View view, Activity activity) {
        if (gwb.m2107c()) {
            if (activity.isInMultiWindowMode()) {
                return 0;
            }
            return giw.m17756b(view, activity);
        } else if (VERSION.SDK_INT < 17) {
            return giw.m17756b(view, activity);
        } else {
            Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Point point2 = new Point();
            defaultDisplay.getRealSize(point2);
            return point2.y - point.y;
        }
    }

    private static int m17756b(View view, Activity activity) {
        if ((view.getSystemUiVisibility() & 2) == 0 && (giw.m17758c(activity) || giv.m17747c())) {
            return giw.m17755b(activity);
        }
        return 0;
    }

    public static int m17749a(Context context) {
        if (f15325e == -1) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            f15325e = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        }
        return f15325e;
    }

    public static int m17755b(Context context) {
        int i = 0;
        if (f15323c == -1 || f15324d == -1) {
            Resources resources = context.getResources();
            f15323c = giw.m17750a(resources, true);
            if (giv.m17747c()) {
                i = giw.m17750a(resources, false);
            }
            f15324d = i;
        }
        return giw.m17758c(context) ? f15323c : f15324d;
    }

    private static int m17750a(Resources resources, boolean z) {
        int identifier = resources.getIdentifier(z ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
    }

    public static boolean m17758c(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public static boolean m17759d(Context context) {
        return context.getResources().getConfiguration().keyboard == 1;
    }

    public static boolean m17760e(Context context) {
        return jyn.m25432a(context, "android.hardware.type.watch", false);
    }
}
