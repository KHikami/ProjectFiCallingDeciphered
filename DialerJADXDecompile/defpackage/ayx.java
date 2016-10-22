package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: ayx */
final class ayx implements OnGlobalLayoutListener {
    final /* synthetic */ ayv a;
    private /* synthetic */ ViewGroup b;

    ayx(ayv ayv, ViewGroup viewGroup) {
        this.a = ayv;
        this.b = viewGroup;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.a.getView().getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            Object azn = new azn(this.a);
            this.a.j.addOnLayoutChangeListener(azn);
            this.a.j.setTag(az.aQ, Integer.valueOf(this.a.j.getHeight()));
            this.a.j.setBottom(this.b.getHeight());
            this.a.n.setVisibility(8);
            this.a.m.b = this.b.getWidth();
            this.a.k.setAlpha(0.0f);
            this.a.g.setAlpha(0.0f);
            this.a.d.setAlpha(0.0f);
            this.a.h.setAlpha(0.0f);
            this.a.i.setAlpha(0.0f);
            ayv ayv = this.a;
            View view = this.a.g;
            view.setTranslationY(ayv.p * ((float) 1));
            view.animate().translationY(0.0f).alpha(1.0f).withLayer().setDuration((long) ayv.a).setInterpolator(ake.a);
            ayv = this.a;
            view = this.a.f;
            view.setTranslationY(ayv.p * ((float) 1));
            view.animate().translationY(0.0f).alpha(1.0f).withLayer().setDuration((long) ayv.a).setInterpolator(ake.a);
            ayv = this.a;
            view = this.a.d;
            view.setTranslationY(ayv.p * ((float) 2));
            view.animate().translationY(0.0f).alpha(1.0f).withLayer().setDuration((long) ayv.a).setInterpolator(ake.a);
            ayv = this.a;
            view = this.a.i;
            view.setTranslationY(((float) 3) * ayv.p);
            view.animate().translationY(0.0f).alpha(1.0f).withLayer().setDuration((long) ayv.a).setInterpolator(ake.a);
            ayv = this.a;
            view = this.a.h;
            view.setTranslationY(((float) 4) * ayv.p);
            view.animate().translationY(0.0f).alpha(1.0f).withLayer().setDuration((long) ayv.a).setInterpolator(ake.a);
            ayv = this.a;
            view = this.a.k;
            view.setTranslationY(((float) 5) * ayv.p);
            view.animate().translationY(0.0f).alpha(1.0f).withLayer().setDuration((long) ayv.a).setInterpolator(ake.a);
            ayv = this.a;
            int height = this.b.getHeight();
            Animator ofInt = ObjectAnimator.ofInt(ayv.j, "bottom", new int[]{height, r1});
            ofInt.setDuration((long) ayv.a);
            ofInt.addListener(new azb(ayv));
            ofInt.setInterpolator(ake.a);
            ofInt.addListener(new ayy(this, azn));
            ofInt.start();
        }
    }
}
