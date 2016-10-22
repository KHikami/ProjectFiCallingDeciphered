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
    public static final int a;

    static {
        a = gtv.b;
    }

    @Deprecated
    public static int a(Context context) {
        return gtv.c(context);
    }

    public static Dialog a(int i, Activity activity, gwc gwc, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        if (gwb.X((Context) activity) && i == 2) {
            i = 42;
        }
        if (gtv.b(activity, i)) {
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
        builder.setMessage(gwb.a((Context) activity, i, gtv.h(activity)));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence t = gwb.t((Context) activity, i);
        if (t != null) {
            builder.setPositiveButton(t, gwc);
        }
        t = gwb.r((Context) activity, i);
        if (t != null) {
            builder.setTitle(t);
        }
        return builder.create();
    }

    @Deprecated
    public static void a(int i, Context context) {
        if (gwb.X(context) && i == 2) {
            i = 42;
        }
        if (!gtv.b(context, i)) {
            if (!(i == 9 ? gtv.a(context, "com.android.vending") : false)) {
                a(i, context, null, gtp.a.a(context, i, 0, "n"));
                return;
            }
        }
        Handler gtu = new gtu(context);
        gtu.sendMessageDelayed(gtu.obtainMessage(1), 120000);
    }

    static void a(int i, Context context, PendingIntent pendingIntent) {
        a(i, context, null, pendingIntent);
    }

    private static void a(int i, Context context, String str, PendingIntent pendingIntent) {
        Notification build;
        boolean z;
        int i2;
        Resources resources = context.getResources();
        String h = gtv.h(context);
        CharSequence s = gwb.s(context, i);
        if (s == null) {
            s = resources.getString(ba.mI);
        }
        CharSequence b = gwb.b(context, i, h);
        if (gwb.X(context)) {
            gwb.a(gwb.ac());
            build = new Notification.Builder(context).setSmallIcon(gwb.wT).setPriority(2).setAutoCancel(true).setStyle(new BigTextStyle().bigText(new StringBuilder((String.valueOf(s).length() + 1) + String.valueOf(b).length()).append(s).append(" ").append(b).toString())).addAction(gwb.wS, resources.getString(ba.mY), pendingIntent).build();
        } else {
            CharSequence string = resources.getString(ba.mI);
            if (gwb.Z()) {
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
                build = new fx(context).a(17301642).c(string).a(System.currentTimeMillis()).e(true).a(pendingIntent).a(s).b(b).b();
            }
        }
        switch (i) {
            case wi.j /*1*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
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

    public static void a(Activity activity, OnCancelListener onCancelListener, String str, Dialog dialog) {
        Dialog dialog2;
        if (activity instanceof dw) {
            ed J_ = ((dw) activity).J_();
            gtx gtx = new gtx();
            dialog2 = (Dialog) gwb.f((Object) dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            gtx.aj = dialog2;
            if (onCancelListener != null) {
                gtx.ak = onCancelListener;
            }
            gtx.a(J_, str);
        } else if (gwb.Z()) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            gto gto = new gto();
            dialog2 = (Dialog) gwb.f((Object) dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            gto.a = dialog2;
            if (onCancelListener != null) {
                gto.b = onCancelListener;
            }
            gto.show(fragmentManager, str);
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public static Context b(Context context) {
        return gtv.g(context);
    }

    @Deprecated
    public static boolean b(int i) {
        return gtv.c(i);
    }

    @Deprecated
    public static boolean b(int i, Activity activity, int i2) {
        return a(i, activity, 0, null);
    }

    @Deprecated
    public static Dialog a(int i, Activity activity, int i2) {
        return a(i, activity, gwc.a(activity, gtp.a.a((Context) activity, i, "d"), i2), null);
    }

    @Deprecated
    public static boolean a(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        Dialog a = a(i, activity, gwc.a(activity, gtp.a.a((Context) activity, i, "d"), i2), onCancelListener);
        if (a == null) {
            return false;
        }
        a(activity, onCancelListener, "GooglePlayServicesErrorDialog", a);
        return true;
    }

    private static void c(int i, Context context) {
        a(i, context, null, gtp.a.a(context, i, 0, "n"));
    }

    @Deprecated
    public static Intent a(int i) {
        return gtq.d.a(null, i, null);
    }
}
