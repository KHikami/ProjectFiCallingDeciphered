package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class cdk implements OnFocusChangeListener {
    final /* synthetic */ cdh a;

    cdk(cdh cdh) {
        this.a = cdh;
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            ba.v(this.a.b);
        }
    }
}
