package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;

/* renamed from: eqo */
final class eqo implements OnClickListener {
    final /* synthetic */ Spinner a;
    final /* synthetic */ eql b;

    eqo(eql eql, Spinner spinner) {
        this.b = eql;
        this.a = spinner;
    }

    public void onClick(View view) {
        this.a.performClick();
    }
}
