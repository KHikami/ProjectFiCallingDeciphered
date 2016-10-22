import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

public final class eit extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ ApnEditorActivity a;

    public eit(ApnEditorActivity apnEditorActivity) {
        this.a = apnEditorActivity;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    private Void a() {
        if (this.a.h != null) {
            String[] strArr = new String[]{this.a.h};
            this.a.f = this.a.j.query("apn", ApnEditorActivity.i, "_id =?", strArr, null, null, null, null);
        }
        return null;
    }

    private void b() {
        if (this.a.f == null) {
            this.a.finish();
            return;
        }
        this.a.f.moveToFirst();
        this.a.a();
    }
}
