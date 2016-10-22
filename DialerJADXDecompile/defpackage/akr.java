package defpackage;

import android.view.animation.Animation;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
/* renamed from: akr */
public final class akr extends akl {
    private /* synthetic */ DialtactsActivity a;

    public akr(DialtactsActivity dialtactsActivity) {
        this.a = dialtactsActivity;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.g();
    }
}
