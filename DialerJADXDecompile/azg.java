import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: PG */
final class azg implements OnPreDrawListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ ayv b;
    private /* synthetic */ View c;
    private /* synthetic */ float d;
    private /* synthetic */ boolean e;

    azg(ayv ayv, boolean z, View view, float f, boolean z2) {
        this.b = ayv;
        this.a = z;
        this.c = view;
        this.d = f;
        this.e = z2;
    }

    public final boolean onPreDraw() {
        float f;
        float f2 = 0.0f;
        this.b.getView().getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.b.b) {
            f = 0.0f;
        } else {
            this.b.j.setTranslationY(this.a ? (float) (-this.b.j.getHeight()) : 0.0f);
            f = ((float) (this.c.getLayoutParams().height / 2)) - (this.d / 2.0f);
        }
        ViewPropertyAnimator duration = this.c.animate().setInterpolator(ake.c).setDuration((long) this.b.q);
        if (this.b.b) {
            if (!this.a) {
                f = 0.0f;
            }
            duration.translationX(f);
        } else {
            if (!this.a) {
                f = 0.0f;
            }
            duration.translationY(f);
        }
        duration.start();
        duration = this.b.j.animate().setInterpolator(ake.c).setDuration((long) this.b.q).setListener(new azh(this));
        if (this.b.b) {
            f = (this.e ? 1.0f : -1.0f) * ((float) this.b.j.getWidth());
            if (!this.a) {
                f2 = f;
            }
            duration.translationX(f2).start();
        } else {
            if (!this.a) {
                f2 = (float) (-this.b.j.getHeight());
            }
            duration.translationY(f2).start();
        }
        return true;
    }
}
