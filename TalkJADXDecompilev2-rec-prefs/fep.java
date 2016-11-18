package p000;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Collection;

final class fep extends AsyncTask<Void, Void, etj> {
    final /* synthetic */ int f12930a;
    final /* synthetic */ feo f12931b;

    fep(feo feo, int i) {
        this.f12931b = feo;
        this.f12930a = i;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15167a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m15168a((etj) obj);
    }

    private void m15168a(etj etj) {
        if (!etj.m8076n()) {
            this.f12931b.f12924a.setText(((fgq) etj.mo1043d()).f13017h.toString());
        }
    }

    private etj m15167a() {
        int i;
        Integer valueOf;
        if (this.f12931b.f12925b.getCheckedRadioButtonId() == ba.dZ) {
            i = 3;
        } else {
            i = 2;
        }
        Collection asList = Arrays.asList(new String[]{this.f12931b.f12926c.getText().toString()});
        if (this.f12931b.f12927d.isChecked()) {
            valueOf = Integer.valueOf(2);
        } else {
            valueOf = null;
        }
        return etj.m14466a(this.f12931b.f12928e, this.f12930a, i, 0, valueOf, asList);
    }
}
