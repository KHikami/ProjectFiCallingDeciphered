import android.animation.ValueAnimator;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
public final class atd {
    public atg a;
    public SearchEditTextLayout b;
    public boolean c;
    public final akk d;

    public atd(atg atg, SearchEditTextLayout searchEditTextLayout) {
        this.d = new ate(this);
        this.a = atg;
        this.b = searchEditTextLayout;
    }

    public final void a() {
        if (!this.a.i()) {
            this.b.a(true, true);
        }
    }

    public final void a(boolean z, boolean z2) {
        if (z2) {
            ValueAnimator ofFloat;
            if (z) {
                ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            } else {
                ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            }
            ofFloat.addUpdateListener(new atf(this));
            ofFloat.start();
        } else {
            a(z ? this.a.x() : 0);
        }
        this.c = z;
    }

    public final void a(int i) {
        this.c = i >= this.a.x();
        this.a.d(i);
    }
}
