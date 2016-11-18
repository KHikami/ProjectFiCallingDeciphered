package p000;

import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class cze implements czg {
    private czf f9377a = new czf();
    private ed f9378b;

    public cze(ed edVar) {
        this.f9378b = edVar;
    }

    public void mo1486a(String str) {
        if (this.f9378b != null) {
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            this.f9377a.setArguments(bundle);
            this.f9377a.m7000a(this.f9378b.mo1845a(), null);
        }
    }

    public void mo1484a() {
        this.f9377a.m7002a();
    }

    public void mo1485a(OnCancelListener onCancelListener) {
        this.f9377a.m11344a(onCancelListener);
    }

    public void mo1487b(String str) {
        ProgressDialog progressDialog = (ProgressDialog) this.f9377a.m7009c();
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }
}
