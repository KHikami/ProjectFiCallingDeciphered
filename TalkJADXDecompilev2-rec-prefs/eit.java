package p000;

import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

public final class eit extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ ApnEditorActivity f11618a;

    public eit(ApnEditorActivity apnEditorActivity) {
        this.f11618a = apnEditorActivity;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m13990a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m13991b();
    }

    private Void m13990a() {
        if (this.f11618a.f6550h != null) {
            String[] strArr = new String[]{this.f11618a.f6550h};
            this.f11618a.f6548f = this.f11618a.f6551j.query("apn", ApnEditorActivity.f6541i, "_id =?", strArr, null, null, null, null);
        }
        return null;
    }

    private void m13991b() {
        if (this.f11618a.f6548f == null) {
            this.f11618a.finish();
            return;
        }
        this.f11618a.f6548f.moveToFirst();
        this.f11618a.m8780a();
    }
}
