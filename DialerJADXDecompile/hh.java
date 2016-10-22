import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public class hh extends hf {
    public hh(Drawable drawable) {
        super(drawable);
    }

    hh(hb hbVar, Resources resources) {
        super(hbVar, resources);
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    hb b() {
        return new hi(this.b, null);
    }
}
