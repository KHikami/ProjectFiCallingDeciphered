import android.os.AsyncTask;
import android.provider.ContactsContract.DataUsageFeedback;

/* compiled from: PG */
final class acp extends AsyncTask {
    private /* synthetic */ acq a;
    private /* synthetic */ aco b;

    acp(aco aco, acq acq) {
        this.b = aco;
        this.a = acq;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.b.a.delete(DataUsageFeedback.DELETE_USAGE_URI, null, null);
        return null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.a.dismiss();
    }
}
