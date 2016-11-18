package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

final class gnx extends azv<Drawable> {
    final /* synthetic */ gnw f15756a;

    gnx(gnw gnw) {
        this.f15756a = gnw;
    }

    public /* bridge */ /* synthetic */ void mo264a(Object obj, bac bac) {
        m18192a((Drawable) obj);
    }

    private void m18192a(Drawable drawable) {
        this.f15756a.f15749a = new ImageView(this.f15756a.f15751c.getContext());
        this.f15756a.f15749a.setScaleType(ScaleType.FIT_CENTER);
        this.f15756a.f15749a.setImageDrawable(drawable);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        if (this.f15756a.f15749a != null && this.f15756a.f15750b != null) {
            this.f15756a.f15749a.startAnimation(this.f15756a.f15750b);
            this.f15756a.f15751c.addView(this.f15756a.f15749a);
        }
    }
}
