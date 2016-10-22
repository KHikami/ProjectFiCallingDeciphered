package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: vj */
final class vj implements vl {
    vj() {
    }

    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        try {
            Resources resources = context.getResources();
            Drawable bgVar = new bg(context);
            bgVar.inflate(resources, xmlPullParser, attributeSet, theme);
            return bgVar;
        } catch (Throwable e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
