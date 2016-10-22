import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public class hf extends ha {
    public hf(Drawable drawable) {
        super(drawable);
    }

    hf(hb hbVar, Resources resources) {
        super(hbVar, resources);
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    hb b() {
        return new hg(this.b, null);
    }
}
