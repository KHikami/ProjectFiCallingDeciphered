package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.provider.CallLog.Calls;

/* compiled from: PG */
/* renamed from: ani */
final class ani extends AsyncTask {
    private /* synthetic */ ProgressDialog a;
    private /* synthetic */ anh b;

    ani(anh anh, ProgressDialog progressDialog) {
        this.b = anh;
        this.a = progressDialog;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.b.a.delete(Calls.CONTENT_URI, null, null);
        awp a = buf.I(this.b.b).a();
        if (a != null) {
            a.a(this.b.b);
        }
        return null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Activity ownerActivity = this.a.getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isDestroyed() && !ownerActivity.isFinishing() && this.a != null && this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
