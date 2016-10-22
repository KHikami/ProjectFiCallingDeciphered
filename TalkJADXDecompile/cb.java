import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

final class cb extends ce {
    public cb(cb cbVar) {
        super(cbVar);
    }

    public void a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
        if (gwb.a(xmlPullParser, "pathData")) {
            TypedArray a = bz.a(resources, theme, attributeSet, bs.d);
            String string = a.getString(0);
            if (string != null) {
                this.n = string;
            }
            string = a.getString(1);
            if (string != null) {
                this.m = gwb.a(string);
            }
            a.recycle();
        }
    }

    public boolean a() {
        return true;
    }
}
