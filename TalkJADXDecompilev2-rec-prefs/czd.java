package p000;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;

public final class czd implements czg {
    private ProgressDialog f9376a;

    public czd(Context context) {
        this.f9376a = new ProgressDialog(context);
        this.f9376a.setProgressStyle(0);
    }

    public void mo1486a(String str) {
        this.f9376a.setMessage(str);
        this.f9376a.show();
    }

    public void mo1484a() {
        if (this.f9376a != null) {
            if (this.f9376a.isShowing()) {
                this.f9376a.dismiss();
            }
            this.f9376a = null;
        }
    }

    public boolean m11338b() {
        return this.f9376a != null && this.f9376a.isShowing();
    }

    public void mo1485a(OnCancelListener onCancelListener) {
        this.f9376a.setOnCancelListener(onCancelListener);
    }

    public void mo1487b(String str) {
        this.f9376a.setMessage(str);
    }
}
