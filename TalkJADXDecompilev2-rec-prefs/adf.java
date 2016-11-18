package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class adf implements OnItemSelectedListener {
    final /* synthetic */ add f335a;

    adf(add add) {
        this.f335a = add;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != -1) {
            acj acj = this.f335a.f114d;
            if (acj != null) {
                acj.m389a(false);
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
