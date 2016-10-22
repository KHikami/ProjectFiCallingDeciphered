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
    public static final gtp a;
    public static final int b;

    static {
        a = new gtp();
        b = gtq.c;
    }

    gtp() {
    }

    public static Dialog a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        String h = gtv.h(activity);
        builder.setMessage(activity.getResources().getString(ba.mV, new Object[]{h}));
        builder.setTitle(ba.mW);
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        gtt.a(activity, onCancelListener, "GooglePlayServicesUpdatingDialog", create);
        return create;
    }

    private PendingIntent a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.a()) {
            return connectionResult.d();
        }
        int c = connectionResult.c();
        if (gwb.X(context) && c == 2) {
            c = 42;
        }
        return a(context, c, 0);
    }

    public static boolean a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return gtt.a(i, activity, 2, onCancelListener);
    }

    public int a(Context context) {
        return super.a(context);
    }

    public PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        return super.a(context, i, i2, str);
    }

    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public hfs a(Context context, hft hft) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        BroadcastReceiver hfs = new hfs(hft);
        context.registerReceiver(hfs, intentFilter);
        hfs.a(context);
        if (a(context, "com.google.android.gms")) {
            return hfs;
        }
        hft.a();
        hfs.a();
        return null;
    }

    public void a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = a(context, connectionResult);
        if (a != null) {
            gtt.a(connectionResult.c(), context, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, a, i, true), 134217728));
        }
    }

    public final boolean a(int i) {
        return super.a(i);
    }

    public boolean a(Activity activity, hgb hgb, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = gtt.a(i, activity, new gwe(hgb, a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        gtt.a(activity, onCancelListener, "GooglePlayServicesErrorDialog", a);
        return true;
    }

    public boolean a(Context context, int i) {
        return super.a(context, i);
    }

    @Deprecated
    public Intent b(int i) {
        return super.b(i);
    }
}
