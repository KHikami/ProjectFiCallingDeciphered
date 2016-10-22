import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

final class gnx extends azv<Drawable> {
    final /* synthetic */ gnw a;

    gnx(gnw gnw) {
        this.a = gnw;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, bac bac) {
        a((Drawable) obj);
    }

    private void a(Drawable drawable) {
        this.a.a = new ImageView(this.a.c.getContext());
        this.a.a.setScaleType(ScaleType.FIT_CENTER);
        this.a.a.setImageDrawable(drawable);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        if (this.a.a != null && this.a.b != null) {
            this.a.a.startAnimation(this.a.b);
            this.a.c.addView(this.a.a);
        }
    }
}
