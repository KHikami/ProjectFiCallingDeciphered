package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

final class cb extends ce {
    public cb(cb cbVar) {
        super(cbVar);
    }

    public void m7133a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
        if (gwb.m1946a(xmlPullParser, "pathData")) {
            TypedArray a = bz.m6570a(resources, theme, attributeSet, bs.f4303d);
            String string = a.getString(0);
            if (string != null) {
                this.n = string;
            }
            string = a.getString(1);
            if (string != null) {
                this.m = gwb.m1954a(string);
            }
            a.recycle();
        }
    }

    public boolean mo800a() {
        return true;
    }
}
