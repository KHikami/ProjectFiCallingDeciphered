import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class ahk {
    public Drawable a;
    public Bitmap b;
    public int c;

    public Drawable a(Resources resources) {
        if (resources == null) {
            throw new IllegalArgumentException("resources can not be null!");
        } else if (this.a != null) {
            return this.a;
        } else {
            if (this.b == null) {
                return null;
            }
            return new BitmapDrawable(resources, this.b);
        }
    }
}
