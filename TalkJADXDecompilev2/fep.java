package defpackage;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Collection;

final class fep extends AsyncTask<Void, Void, etj> {
    final /* synthetic */ int a;
    final /* synthetic */ feo b;

    fep(feo feo, int i) {
        this.b = feo;
        this.a = i;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((etj) obj);
    }

    private void a(etj etj) {
        if (!etj.n()) {
            this.b.a.setText(((fgq) etj.d()).h.toString());
        }
    }

    private etj a() {
        int i;
        Integer valueOf;
        if (this.b.b.getCheckedRadioButtonId() == ba.dZ) {
            i = 3;
        } else {
            i = 2;
        }
        Collection asList = Arrays.asList(new String[]{this.b.c.getText().toString()});
        if (this.b.d.isChecked()) {
            valueOf = Integer.valueOf(2);
        } else {
            valueOf = null;
        }
        return etj.a(this.b.e, this.a, i, 0, valueOf, asList);
    }
}
