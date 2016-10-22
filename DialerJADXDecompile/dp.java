import android.view.View;
import android.view.animation.Animation;

/* compiled from: PG */
final class dp extends dq {
    private /* synthetic */ db b;
    private /* synthetic */ dm c;

    dp(dm dmVar, View view, Animation animation, db dbVar) {
        this.c = dmVar;
        this.b = dbVar;
        super(view, animation);
    }

    public final void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        if (this.b.d != null) {
            this.b.d = null;
            this.c.a(this.b, this.b.e, 0, 0, false);
        }
    }
}
