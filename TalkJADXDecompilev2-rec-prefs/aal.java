package p000;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

final class aal implements aak {
    aal() {
    }

    public Drawable mo8a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        try {
            return ca.m7066a(context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Throwable e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
