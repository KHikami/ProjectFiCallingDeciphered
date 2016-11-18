package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class cze implements czg {
    private czf a = new czf();
    private ed b;

    public cze(ed edVar) {
        this.b = edVar;
    }

    public void a(String str) {
        if (this.b != null) {
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            this.a.setArguments(bundle);
            this.a.a(this.b.a(), null);
        }
    }

    public void a() {
        this.a.a();
    }

    public void a(OnCancelListener onCancelListener) {
        this.a.a(onCancelListener);
    }

    public void b(String str) {
        ProgressDialog progressDialog = (ProgressDialog) this.a.c();
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }
}
