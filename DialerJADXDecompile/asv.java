import android.os.AsyncTask;

/* compiled from: PG */
final class asv extends AsyncTask {
    private /* synthetic */ asu a;

    asv(asu asu) {
        this.a = asu;
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue() && this.a.d.e != null && this.a.c.getAndSet(false)) {
            this.a.d.e.getContentResolver().unregisterContentObserver(this.a);
            this.a.d.d();
            if (this.a.b == 1) {
                this.a.d.a(this.a.a, true);
            } else if (this.a.b == 2) {
                this.a.d.a(this.a.a, false);
            }
        }
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return Boolean.valueOf(this.a.d.a(this.a.a));
    }
}
