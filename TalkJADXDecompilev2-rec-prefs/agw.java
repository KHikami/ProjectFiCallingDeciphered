package p000;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class agw implements OnGlobalLayoutListener {
    final /* synthetic */ View f691a;
    final /* synthetic */ agp f692b;

    agw(agp agp, View view) {
        this.f692b = agp;
        this.f691a = view;
    }

    public void onGlobalLayout() {
        if (VERSION.SDK_INT >= 16) {
            this.f691a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.f691a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        this.f692b.m1167r();
    }
}
