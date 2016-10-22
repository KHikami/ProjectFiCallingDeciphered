package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageButton;

/* compiled from: PG */
/* renamed from: ajw */
public final class ajw {
    public final View a;
    public int b;
    private final int c;
    private final int d;
    private final int e;
    private final ImageButton f;
    private final Interpolator g;

    public ajw(Activity activity, View view, ImageButton imageButton) {
        Resources resources = activity.getResources();
        this.g = AnimationUtils.loadInterpolator(activity, 17563661);
        this.d = resources.getDimensionPixelSize(buf.cU);
        this.e = resources.getDimensionPixelOffset(buf.cS);
        this.c = resources.getInteger(buf.dl);
        this.a = view;
        this.f = imageButton;
        aix.a(this.a, resources);
    }

    public final void a(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    public final void a(Drawable drawable, String str) {
        if (this.f.getDrawable() != drawable || !this.f.getContentDescription().equals(str)) {
            this.f.setImageDrawable(drawable);
            this.f.setContentDescription(str);
        }
    }

    public final void a(float f) {
        this.a.setTranslationX((float) ((int) (((float) b(2)) * f)));
    }

    public final void a(int i, boolean z) {
        a(i, 0, 0, z);
    }

    public final void a(int i, int i2, int i3, boolean z) {
        if (this.b != 0) {
            int b = b(i);
            if (z && this.a.isShown()) {
                this.a.animate().translationX((float) b).translationY((float) i3).setInterpolator(this.g).setDuration((long) this.c).start();
                return;
            }
            this.a.setTranslationX((float) b);
            this.a.setTranslationY((float) i3);
        }
    }

    public final void a(int i) {
        a(true);
        ake.a(this.a, 266, i);
        ake.a(this.f, 266, i + 100, null);
    }

    public final void a() {
        ake.c(this.a, this.c);
        ake.a(this.f, 66, null);
    }

    private int b(int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case rl.c /*0*/:
                return 0;
            case rq.b /*1*/:
                i2 = this.b / 4;
                break;
            case rq.c /*2*/:
                i2 = ((this.b / 2) - (this.d / 2)) - this.e;
                break;
            default:
                i2 = 0;
                break;
        }
        if (this.a.getLayoutDirection() == 1) {
            i3 = 1;
        }
        if (i3 != 0) {
            i2 = -i2;
        }
        return i2;
    }
}
