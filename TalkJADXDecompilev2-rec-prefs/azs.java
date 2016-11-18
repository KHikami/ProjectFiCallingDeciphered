package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class azs extends azt<Drawable> {
    protected /* synthetic */ void mo434a(Object obj) {
        m4507e((Drawable) obj);
    }

    public azs(ImageView imageView) {
        super(imageView);
    }

    private void m4507e(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
