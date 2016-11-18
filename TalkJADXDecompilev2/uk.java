package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class uk implements OnItemClickListener {
    final /* synthetic */ uc a;
    final /* synthetic */ uh b;

    uk(uh uhVar, uc ucVar) {
        this.b = uhVar;
        this.a = ucVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.u.onClick(this.a.a, i);
        if (!this.b.E) {
            this.a.a.dismiss();
        }
    }
}
