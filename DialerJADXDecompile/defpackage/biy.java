package defpackage;

import android.os.AsyncTask;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: PG */
/* renamed from: biy */
public final class biy extends AsyncTask {
    private /* synthetic */ bix a;

    public biy(bix bix) {
        this.a = bix;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a((LocationSettingsResult) obj);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return biz.b(this.a.s);
    }
}
