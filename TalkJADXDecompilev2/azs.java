package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class azs extends azt<Drawable> {
    protected /* synthetic */ void a(Object obj) {
        e((Drawable) obj);
    }

    public azs(ImageView imageView) {
        super(imageView);
    }

    private void e(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
