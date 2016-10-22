package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: asr */
final class asr extends AsyncTask {
    private /* synthetic */ asw a;
    private /* synthetic */ asp b;

    asr(asp asp, asw asw) {
        this.b = asp;
        this.a = asw;
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a(((Boolean) obj).booleanValue());
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return Boolean.valueOf(this.b.a(this.b.f));
    }
}
