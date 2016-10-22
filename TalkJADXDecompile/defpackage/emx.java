package defpackage;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;

/* renamed from: emx */
final class emx extends AsyncTask<Void, Void, String[]> {
    final /* synthetic */ elk a;
    private final String b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((String[]) obj);
    }

    public emx(elk elk, String str) {
        this.a = elk;
        this.b = str;
    }

    private String[] a() {
        return Environment.getExternalStorageDirectory().list(new emy(this));
    }

    private void a(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            ew a = this.a.e.a();
            String str = this.b;
            dbk dbk = new dbk();
            Bundle bundle = new Bundle();
            bundle.putSerializable("dump_files", strArr);
            bundle.putString("action", str);
            dbk.setArguments(bundle);
            dbk.a(a, null);
        }
    }
}
