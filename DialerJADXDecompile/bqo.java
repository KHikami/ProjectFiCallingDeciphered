import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;

public final class bqo extends bqp {
    public static final bqo a;

    static {
        a = new bqo();
    }

    bqo() {
    }

    public static Dialog a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        String e = bqu.e(activity);
        builder.setMessage(activity.getResources().getString(cob.em, new Object[]{e}));
        builder.setTitle(cob.en);
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        bqs.a(activity, onCancelListener, "GooglePlayServicesUpdatingDialog", create);
        return create;
    }

    public final int a(Context context) {
        return super.a(context);
    }

    public final PendingIntent a(Context context, int i, int i2, String str) {
        return super.a(context, i, i2, str);
    }

    public final Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public final boolean a(int i) {
        return super.a(i);
    }

    public final boolean a(Context context, int i) {
        return super.a(context, i);
    }

    @Deprecated
    public final Intent b(int i) {
        return super.b(i);
    }
}
