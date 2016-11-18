package p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class gtp extends gtq {
    public static final gtp f16131a = new gtp();
    public static final int f16132b = gtq.f16129c;

    gtp() {
    }

    public static Dialog m18553a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        String h = gtv.m18578h(activity);
        builder.setMessage(activity.getResources().getString(ba.mV, new Object[]{h}));
        builder.setTitle(ba.mW);
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        gtt.m18586a(activity, onCancelListener, "GooglePlayServicesUpdatingDialog", create);
        return create;
    }

    private PendingIntent m18554a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.m9652a()) {
            return connectionResult.m9655d();
        }
        int c = connectionResult.m9654c();
        if (gwb.m1465X(context) && c == 2) {
            c = 42;
        }
        return mo2335a(context, c, 0);
    }

    public static boolean m18555a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return gtt.m18587a(i, activity, 2, onCancelListener);
    }

    public int mo2334a(Context context) {
        return super.mo2334a(context);
    }

    public PendingIntent mo2335a(Context context, int i, int i2) {
        return super.mo2335a(context, i, i2);
    }

    public PendingIntent mo2336a(Context context, int i, int i2, String str) {
        return super.mo2336a(context, i, i2, str);
    }

    public Intent mo2337a(Context context, int i, String str) {
        return super.mo2337a(context, i, str);
    }

    public hfs m18560a(Context context, hft hft) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        BroadcastReceiver hfs = new hfs(hft);
        context.registerReceiver(hfs, intentFilter);
        hfs.m19690a(context);
        if (m18549a(context, "com.google.android.gms")) {
            return hfs;
        }
        hft.mo2478a();
        hfs.m19689a();
        return null;
    }

    public void m18561a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = m18554a(context, connectionResult);
        if (a != null) {
            gtt.m18584a(connectionResult.m9654c(), context, PendingIntent.getActivity(context, 0, GoogleApiActivity.m9657a(context, a, i, true), 134217728));
        }
    }

    public final boolean mo2338a(int i) {
        return super.mo2338a(i);
    }

    public boolean m18563a(Activity activity, hgb hgb, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = gtt.m18581a(i, activity, new gwe(hgb, mo2337a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        gtt.m18586a(activity, onCancelListener, "GooglePlayServicesErrorDialog", a);
        return true;
    }

    public boolean mo2339a(Context context, int i) {
        return super.mo2339a(context, i);
    }

    @Deprecated
    public Intent mo2340b(int i) {
        return super.mo2340b(i);
    }
}
