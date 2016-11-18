package p000;

import android.app.AlertDialog.Builder;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import java.util.List;
import java.util.Locale;

final class ccp extends AsyncTask<Void, Void, List<String>> {
    final /* synthetic */ cco f5015a;

    ccp(cco cco) {
        this.f5015a = cco;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7210a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7211a((List) obj);
    }

    private List<String> m7210a() {
        return blf.m5824g(new blo(this.f5015a.f5014b.f4999a, this.f5015a.f5013a), this.f5015a.f5014b.f5001c.f4146a);
    }

    private void m7211a(List<String> list) {
        ListAdapter arrayAdapter = new ArrayAdapter(this.f5015a.f5014b.f4999a, 17367043);
        for (String add : list) {
            arrayAdapter.add(add);
        }
        new Builder(this.f5015a.f5014b.f4999a).setTitle(String.format(Locale.US, "%d recipients", new Object[]{Integer.valueOf(list.size())})).setAdapter(arrayAdapter, null).create().show();
    }
}
