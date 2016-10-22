package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.TypedValue;

/* renamed from: bqs */
public final class bqs extends bqu {
    @Deprecated
    public static int a(Context context) {
        return bqu.b(context);
    }

    @Deprecated
    public static void a(int i, Context context) {
        if (buf.V(context) && i == 2) {
            i = 42;
        }
        if (!bqu.b(context, i)) {
            if (!(i == 9 ? bqu.a(context, "com.android.vending") : false)) {
                Notification build;
                boolean z;
                int i2;
                Resources resources = context.getResources();
                String e = bqu.e(context);
                CharSequence k = buf.k(context, i);
                if (k == null) {
                    k = resources.getString(cob.eb);
                }
                CharSequence a = buf.a(context, i, e);
                PendingIntent a2 = bqo.a.a(context, i, 0, "n");
                if (buf.V(context)) {
                    buf.a(buf.v());
                    build = new Builder(context).setSmallIcon(buf.mc).setPriority(2).setAutoCancel(true).setStyle(new BigTextStyle().bigText(k + " " + a)).addAction(buf.mb, resources.getString(cob.ep), a2).build();
                } else {
                    CharSequence string = resources.getString(cob.eb);
                    if (buf.s()) {
                        Notification build2;
                        Builder autoCancel = new Builder(context).setSmallIcon(17301642).setContentTitle(k).setContentText(a).setContentIntent(a2).setTicker(string).setAutoCancel(true);
                        if (buf.y()) {
                            autoCancel.setLocalOnly(true);
                        }
                        if (buf.v()) {
                            autoCancel.setStyle(new BigTextStyle().bigText(a));
                            build2 = autoCancel.build();
                        } else {
                            build2 = autoCancel.getNotification();
                        }
                        if (VERSION.SDK_INT == 19) {
                            build2.extras.putBoolean("android.support.localOnly", true);
                        }
                        build = build2;
                    } else {
                        es c = new es(context).a(17301642).c(string);
                        c.n.when = System.currentTimeMillis();
                        c = c.a(true);
                        c.d = a2;
                        build = c.a(k).b(a).a();
                    }
                }
                switch (i) {
                    case rq.b /*1*/:
                    case rq.c /*2*/:
                    case rl.e /*3*/:
                    case rk.bW /*18*/:
                    case 42:
                        z = true;
                        break;
                    default:
                        z = false;
                        break;
                }
                if (z) {
                    b.set(false);
                    i2 = 10436;
                } else {
                    i2 = 39789;
                }
                ((NotificationManager) context.getSystemService("notification")).notify(i2, build);
                return;
            }
        }
        Handler bqt = new bqt(context);
        bqt.sendMessageDelayed(bqt.obtainMessage(1), 120000);
    }

    @TargetApi(11)
    public static void a(Activity activity, OnCancelListener onCancelListener, String str, Dialog dialog) {
        Dialog dialog2;
        if (activity instanceof de) {
            dl d = ((de) activity).d();
            bqw bqw = new bqw();
            dialog2 = (Dialog) buf.d((Object) dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            bqw.W = dialog2;
            if (onCancelListener != null) {
                bqw.X = onCancelListener;
            }
            bqw.a(d, str);
        } else if (buf.s()) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            bqn bqn = new bqn();
            dialog2 = (Dialog) buf.d((Object) dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            bqn.a = dialog2;
            if (onCancelListener != null) {
                bqn.b = onCancelListener;
            }
            bqn.show(fragmentManager, str);
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    @Deprecated
    public static boolean a(int i) {
        return bqu.c(i);
    }

    public static boolean a(int i, Activity activity, db dbVar, int i2, OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i != 0) {
            if (buf.V(activity) && i == 2) {
                i = 42;
            }
            if (bqu.b(activity, i)) {
                i = 18;
            }
            if (buf.u()) {
                TypedValue typedValue = new TypedValue();
                activity.getTheme().resolveAttribute(16843529, typedValue, true);
                if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
                    builder = new AlertDialog.Builder(activity, 5);
                }
            }
            if (builder == null) {
                builder = new AlertDialog.Builder(activity);
            }
            builder.setMessage(buf.a((Context) activity, i, bqu.e(activity)));
            if (onCancelListener != null) {
                builder.setOnCancelListener(onCancelListener);
            }
            Intent a = bqo.a.a(activity, i, "d");
            OnClickListener bug = dbVar == null ? new bug(activity, a, 2) : new bug(dbVar, a, 2);
            CharSequence l = buf.l((Context) activity, i);
            if (l != null) {
                builder.setPositiveButton(l, bug);
            }
            CharSequence k = buf.k((Context) activity, i);
            if (k != null) {
                builder.setTitle(k);
            }
            Dialog create = builder.create();
        }
        if (create == null) {
            return false;
        }
        bqs.a(activity, onCancelListener, "GooglePlayServicesErrorDialog", create);
        return true;
    }

    @TargetApi(21)
    private static void c(int i, Context context) {
        Notification build;
        boolean z;
        int i2;
        Resources resources = context.getResources();
        String e = bqu.e(context);
        CharSequence k = buf.k(context, i);
        if (k == null) {
            k = resources.getString(cob.eb);
        }
        CharSequence a = buf.a(context, i, e);
        PendingIntent a2 = bqo.a.a(context, i, 0, "n");
        if (buf.V(context)) {
            buf.a(buf.v());
            build = new Builder(context).setSmallIcon(buf.mc).setPriority(2).setAutoCancel(true).setStyle(new BigTextStyle().bigText(k + " " + a)).addAction(buf.mb, resources.getString(cob.ep), a2).build();
        } else {
            CharSequence string = resources.getString(cob.eb);
            if (buf.s()) {
                Notification build2;
                Builder autoCancel = new Builder(context).setSmallIcon(17301642).setContentTitle(k).setContentText(a).setContentIntent(a2).setTicker(string).setAutoCancel(true);
                if (buf.y()) {
                    autoCancel.setLocalOnly(true);
                }
                if (buf.v()) {
                    autoCancel.setStyle(new BigTextStyle().bigText(a));
                    build2 = autoCancel.build();
                } else {
                    build2 = autoCancel.getNotification();
                }
                if (VERSION.SDK_INT == 19) {
                    build2.extras.putBoolean("android.support.localOnly", true);
                }
                build = build2;
            } else {
                es c = new es(context).a(17301642).c(string);
                c.n.when = System.currentTimeMillis();
                c = c.a(true);
                c.d = a2;
                build = c.a(k).b(a).a();
            }
        }
        switch (i) {
            case rq.b /*1*/:
            case rq.c /*2*/:
            case rl.e /*3*/:
            case rk.bW /*18*/:
            case 42:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            b.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        ((NotificationManager) context.getSystemService("notification")).notify(i2, build);
    }

    @Deprecated
    public static boolean a(PackageManager packageManager, String str) {
        return bqv.a.a(packageManager, str);
    }
}
