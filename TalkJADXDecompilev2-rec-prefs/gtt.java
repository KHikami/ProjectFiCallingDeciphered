package p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.TypedValue;

public final class gtt extends gtv {
    @Deprecated
    public static final int f16145a = gtv.f16137b;

    @Deprecated
    public static int m18579a(Context context) {
        return gtv.m18572c(context);
    }

    public static Dialog m18581a(int i, Activity activity, gwc gwc, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        if (gwb.m1465X((Context) activity) && i == 2) {
            i = 42;
        }
        if (gtv.m18571b(activity, i)) {
            i = 18;
        }
        if (gwb.ab()) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843529, typedValue, true);
            if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
                builder = new Builder(activity, 5);
            }
        }
        if (builder == null) {
            builder = new Builder(activity);
        }
        builder.setMessage(gwb.m1645a((Context) activity, i, gtv.m18578h(activity)));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence t = gwb.m2356t((Context) activity, i);
        if (t != null) {
            builder.setPositiveButton(t, gwc);
        }
        t = gwb.m2340r((Context) activity, i);
        if (t != null) {
            builder.setTitle(t);
        }
        return builder.create();
    }

    @Deprecated
    public static void m18583a(int i, Context context) {
        if (gwb.m1465X(context) && i == 2) {
            i = 42;
        }
        if (!gtv.m18571b(context, i)) {
            if (!(i == 9 ? gtv.m18570a(context, "com.android.vending") : false)) {
                gtt.m18585a(i, context, null, gtp.f16131a.mo2336a(context, i, 0, "n"));
                return;
            }
        }
        Handler gtu = new gtu(context);
        gtu.sendMessageDelayed(gtu.obtainMessage(1), 120000);
    }

    static void m18584a(int i, Context context, PendingIntent pendingIntent) {
        gtt.m18585a(i, context, null, pendingIntent);
    }

    private static void m18585a(int i, Context context, String str, PendingIntent pendingIntent) {
        Notification build;
        boolean z;
        int i2;
        Resources resources = context.getResources();
        String h = gtv.m18578h(context);
        CharSequence s = gwb.m2346s(context, i);
        if (s == null) {
            s = resources.getString(ba.mI);
        }
        CharSequence b = gwb.m1996b(context, i, h);
        if (gwb.m1465X(context)) {
            gwb.m1885a(gwb.ac());
            build = new Notification.Builder(context).setSmallIcon(gwb.wT).setPriority(2).setAutoCancel(true).setStyle(new BigTextStyle().bigText(new StringBuilder((String.valueOf(s).length() + 1) + String.valueOf(b).length()).append(s).append(" ").append(b).toString())).addAction(gwb.wS, resources.getString(ba.mY), pendingIntent).build();
        } else {
            CharSequence string = resources.getString(ba.mI);
            if (gwb.m1471Z()) {
                Notification build2;
                Notification.Builder autoCancel = new Notification.Builder(context).setSmallIcon(17301642).setContentTitle(s).setContentText(b).setContentIntent(pendingIntent).setTicker(string).setAutoCancel(true);
                if (gwb.af()) {
                    autoCancel.setLocalOnly(true);
                }
                if (gwb.ac()) {
                    autoCancel.setStyle(new BigTextStyle().bigText(b));
                    build2 = autoCancel.build();
                } else {
                    build2 = autoCancel.getNotification();
                }
                if (VERSION.SDK_INT == 19) {
                    build2.extras.putBoolean("android.support.localOnly", true);
                }
                build = build2;
            } else {
                build = new fx(context).m16417a(17301642).m16440c(string).m16419a(System.currentTimeMillis()).m16448e(true).m16421a(pendingIntent).m16429a(s).m16436b(b).m16433b();
            }
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case wi.dH /*18*/:
            case 42:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            f.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (str != null) {
            notificationManager.notify(str, i2, build);
        } else {
            notificationManager.notify(i2, build);
        }
    }

    public static void m18586a(Activity activity, OnCancelListener onCancelListener, String str, Dialog dialog) {
        Dialog dialog2;
        if (activity instanceof dw) {
            ed J_ = ((dw) activity).J_();
            gtx gtx = new gtx();
            dialog2 = (Dialog) gwb.m2195f((Object) dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            gtx.aj = dialog2;
            if (onCancelListener != null) {
                gtx.ak = onCancelListener;
            }
            gtx.mo2341a(J_, str);
        } else if (gwb.m1471Z()) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            gto gto = new gto();
            dialog2 = (Dialog) gwb.m2195f((Object) dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            gto.f16127a = dialog2;
            if (onCancelListener != null) {
                gto.f16128b = onCancelListener;
            }
            gto.show(fragmentManager, str);
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public static Context m18588b(Context context) {
        return gtv.m18577g(context);
    }

    @Deprecated
    public static boolean m18590b(int i) {
        return gtv.m18573c(i);
    }

    @Deprecated
    public static boolean m18591b(int i, Activity activity, int i2) {
        return gtt.m18587a(i, activity, 0, null);
    }

    @Deprecated
    public static Dialog m18580a(int i, Activity activity, int i2) {
        return gtt.m18581a(i, activity, gwc.m18764a(activity, gtp.f16131a.mo2337a((Context) activity, i, "d"), i2), null);
    }

    @Deprecated
    public static boolean m18587a(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        Dialog a = gtt.m18581a(i, activity, gwc.m18764a(activity, gtp.f16131a.mo2337a((Context) activity, i, "d"), i2), onCancelListener);
        if (a == null) {
            return false;
        }
        gtt.m18586a(activity, onCancelListener, "GooglePlayServicesErrorDialog", a);
        return true;
    }

    private static void m18592c(int i, Context context) {
        gtt.m18585a(i, context, null, gtp.f16131a.mo2336a(context, i, 0, "n"));
    }

    @Deprecated
    public static Intent m18582a(int i) {
        return gtq.f16130d.mo2337a(null, i, null);
    }
}
