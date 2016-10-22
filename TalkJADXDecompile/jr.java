import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class jr extends jk {
    jr(jk jkVar, Resources resources) {
        super(jkVar);
    }

    public Drawable newDrawable(Resources resources) {
        return new jq(this, resources);
    }
}
