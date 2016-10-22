import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class jp extends jk {
    jp(jk jkVar, Resources resources) {
        super(jkVar);
    }

    public Drawable newDrawable(Resources resources) {
        return new jo(this, resources);
    }
}
