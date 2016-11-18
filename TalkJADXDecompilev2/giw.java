package defpackage;

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
    private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final String[] b = new String[]{"android_id"};
    private static int c = -1;
    private static int d = -1;
    private static int e = -1;

    public static long a() {
        Throwable th;
        Cursor cursor;
        long j = 0;
        try {
            Cursor query = gwb.H().getContentResolver().query(a, null, null, b, null);
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

    public static String b() {
        TelephonyManager telephonyManager = (TelephonyManager) gwb.H().getSystemService("phone");
        if (telephonyManager == null) {
            return "none";
        }
        try {
            return telephonyManager.getNetworkOperator();
        } catch (Exception e) {
            return "none";
        }
    }

    public static void a(View view) {
        int systemUiVisibility = ((view.getSystemUiVisibility() | 1) | 4) | 1024;
        if (VERSION.SDK_INT >= 19) {
            systemUiVisibility = ((systemUiVisibility | 2) | 512) | 2048;
        }
        view.setSystemUiVisibility(systemUiVisibility);
    }

    public static void a(View view, boolean z) {
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

    public static int a(View view, Activity activity) {
        if (gwb.c()) {
            if (activity.isInMultiWindowMode()) {
                return 0;
            }
            return giw.b(view, activity);
        } else if (VERSION.SDK_INT < 17) {
            return giw.b(view, activity);
        } else {
            Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Point point2 = new Point();
            defaultDisplay.getRealSize(point2);
            return point2.y - point.y;
        }
    }

    private static int b(View view, Activity activity) {
        if ((view.getSystemUiVisibility() & 2) == 0 && (giw.c(activity) || giv.c())) {
            return giw.b(activity);
        }
        return 0;
    }

    public static int a(Context context) {
        if (e == -1) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            e = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        }
        return e;
    }

    public static int b(Context context) {
        int i = 0;
        if (c == -1 || d == -1) {
            Resources resources = context.getResources();
            c = giw.a(resources, true);
            if (giv.c()) {
                i = giw.a(resources, false);
            }
            d = i;
        }
        return giw.c(context) ? c : d;
    }

    private static int a(Resources resources, boolean z) {
        int identifier = resources.getIdentifier(z ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
    }

    public static boolean c(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().keyboard == 1;
    }

    public static boolean e(Context context) {
        return jyn.a(context, "android.hardware.type.watch", false);
    }
}
