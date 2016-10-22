import android.os.AsyncTask;
import android.provider.CallLog.Calls;

/* compiled from: PG */
public final class amc extends AsyncTask {
    private final amd a;

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Object obj = "";
        for (amb amb : (amb[]) objArr) {
            obj = Calls.getLastOutgoingCall(amb.a);
        }
        return obj;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        avl.a();
        this.a.a(str);
    }

    public amc(ama ama, amd amd) {
        this.a = amd;
    }
}
