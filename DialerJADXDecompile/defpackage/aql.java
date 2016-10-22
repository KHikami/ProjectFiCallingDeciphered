package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.dialer.app.list.PhoneFavoriteListView;

/* compiled from: PG */
/* renamed from: aql */
public final class aql extends AnimatorListenerAdapter {
    private /* synthetic */ PhoneFavoriteListView a;

    public aql(PhoneFavoriteListView phoneFavoriteListView) {
        this.a = phoneFavoriteListView;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a.e != null) {
            this.a.e.recycle();
            this.a.e = null;
        }
        this.a.f.setVisibility(8);
        this.a.f.setImageBitmap(null);
    }
}
