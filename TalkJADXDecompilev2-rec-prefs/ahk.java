package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class ahk {
    public Drawable f791a;
    public Bitmap f792b;
    public int f793c;

    public Drawable m1322a(Resources resources) {
        if (resources == null) {
            throw new IllegalArgumentException("resources can not be null!");
        } else if (this.f791a != null) {
            return this.f791a;
        } else {
            if (this.f792b == null) {
                return null;
            }
            return new BitmapDrawable(resources, this.f792b);
        }
    }
}
