package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.StatusOverlay;

/* renamed from: cwm */
public final class cwm implements OnClickListener {
    final /* synthetic */ StatusOverlay a;

    public cwm(StatusOverlay statusOverlay) {
        this.a = statusOverlay;
    }

    public void onClick(View view) {
        gwb.i(this.a.d, 1580);
        this.a.e.n();
        this.a.a();
    }
}
