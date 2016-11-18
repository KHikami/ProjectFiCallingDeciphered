package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

final class aaj implements aak {
    aaj() {
    }

    public Drawable mo8a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        try {
            Resources resources = context.getResources();
            Drawable btVar = new bt(context);
            btVar.inflate(resources, xmlPullParser, attributeSet, theme);
            return btVar;
        } catch (Throwable e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
