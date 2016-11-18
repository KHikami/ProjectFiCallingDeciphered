package defpackage;

import android.app.AlertDialog.Builder;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import java.util.List;
import java.util.Locale;

final class ccp extends AsyncTask<Void, Void, List<String>> {
    final /* synthetic */ cco a;

    ccp(cco cco) {
        this.a = cco;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((List) obj);
    }

    private List<String> a() {
        return blf.g(new blo(this.a.b.a, this.a.a), this.a.b.c.a);
    }

    private void a(List<String> list) {
        ListAdapter arrayAdapter = new ArrayAdapter(this.a.b.a, 17367043);
        for (String add : list) {
            arrayAdapter.add(add);
        }
        new Builder(this.a.b.a).setTitle(String.format(Locale.US, "%d recipients", new Object[]{Integer.valueOf(list.size())})).setAdapter(arrayAdapter, null).create().show();
    }
}
