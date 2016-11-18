package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class agw implements OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ agp b;

    agw(agp agp, View view) {
        this.b = agp;
        this.a = view;
    }

    public void onGlobalLayout() {
        if (VERSION.SDK_INT >= 16) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        this.b.r();
    }
}
