package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;

public final class czd implements czg {
    private ProgressDialog a;

    public czd(Context context) {
        this.a = new ProgressDialog(context);
        this.a.setProgressStyle(0);
    }

    public void a(String str) {
        this.a.setMessage(str);
        this.a.show();
    }

    public void a() {
        if (this.a != null) {
            if (this.a.isShowing()) {
                this.a.dismiss();
            }
            this.a = null;
        }
    }

    public boolean b() {
        return this.a != null && this.a.isShowing();
    }

    public void a(OnCancelListener onCancelListener) {
        this.a.setOnCancelListener(onCancelListener);
    }

    public void b(String str) {
        this.a.setMessage(str);
    }
}
