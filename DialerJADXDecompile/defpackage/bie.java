package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;
import com.google.android.apps.dialer.calllog.GoogleCallDetailActivity;

/* compiled from: PG */
/* renamed from: bie */
final class bie extends AsyncTask {
    private Activity a;
    private /* synthetic */ bia b;

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (this.b.e == null || !bhz.a(this.b.g, this.b.e)) {
            Context activity = this.b.getActivity();
            if (activity != null) {
                Toast.makeText(activity, buf.lQ, 0).show();
            }
            return Boolean.valueOf(false);
        }
        this.b.e.a.m = true;
        bia.b.a(this.b.g, this.b.e);
        String str = bia.a;
        return Boolean.valueOf(true);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Toast.makeText(this.b.g, buf.lR, 0).show();
            if (this.a instanceof GoogleCallDetailActivity) {
                ((GoogleCallDetailActivity) this.a).f();
            }
        }
    }

    bie(bia bia, Activity activity) {
        this.b = bia;
        this.a = activity;
    }
}
