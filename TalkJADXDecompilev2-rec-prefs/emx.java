package p000;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;

final class emx extends AsyncTask<Void, Void, String[]> {
    final /* synthetic */ elk f11867a;
    private final String f11868b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m14135a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m14134a((String[]) obj);
    }

    public emx(elk elk, String str) {
        this.f11867a = elk;
        this.f11868b = str;
    }

    private String[] m14135a() {
        return Environment.getExternalStorageDirectory().list(new emy(this));
    }

    private void m14134a(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            ew a = this.f11867a.f11814e.mo1845a();
            String str = this.f11868b;
            dbk dbk = new dbk();
            Bundle bundle = new Bundle();
            bundle.putSerializable("dump_files", strArr);
            bundle.putString("action", str);
            dbk.setArguments(bundle);
            dbk.m7000a(a, null);
        }
    }
}
