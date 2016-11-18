package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class dub extends AnimatorListenerAdapter {
    final /* synthetic */ View f10546a;
    final /* synthetic */ dug f10547b;
    final /* synthetic */ dua f10548c;

    dub(dua dua, View view, dug dug) {
        this.f10548c = dua;
        this.f10546a = view;
        this.f10547b = dug;
    }

    public void onAnimationEnd(Animator animator) {
        this.f10546a.setAlpha(1.0f);
        this.f10548c.f10532b.mo1128b(this.f10547b);
        this.f10546a.setLayerType(0, null);
    }
}
