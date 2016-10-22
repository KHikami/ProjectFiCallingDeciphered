import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
final class ahe extends agp {
    public final String a() {
        return "postal";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        List list;
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/postal-address_v2", "data2", buf.fZ, 25, new agz(), new ahc("data1"));
        if (!agf.a(attributeSet, "needsStructured", false)) {
            a.p = 10;
            a.l.add(new afy("data1", buf.ga, 139377));
        } else if (Locale.JAPANESE.getLanguage().equals(Locale.getDefault().getLanguage())) {
            list = a.l;
            r2 = new afy("data10", buf.gc, 139377);
            r2.a = true;
            list.add(r2);
            a.l.add(new afy("data9", buf.gd, 139377));
            a.l.add(new afy("data8", buf.ge, 139377));
            a.l.add(new afy("data7", buf.gb, 139377));
            a.l.add(new afy("data4", buf.gf, 139377));
        } else {
            a.l.add(new afy("data4", buf.gf, 139377));
            a.l.add(new afy("data7", buf.gb, 139377));
            a.l.add(new afy("data8", buf.ge, 139377));
            a.l.add(new afy("data9", buf.gd, 139377));
            list = a.l;
            r2 = new afy("data10", buf.gc, 139377);
            r2.a = true;
            list.add(r2);
        }
        list = new ArrayList();
        list.add(a);
        return list;
    }

    protected final afz a(AttributeSet attributeSet, String str) {
        if ("home".equals(str)) {
            return agf.c(1);
        }
        if ("work".equals(str)) {
            return agf.c(2);
        }
        if ("other".equals(str)) {
            return agf.c(3);
        }
        if (!"custom".equals(str)) {
            return null;
        }
        afz c = agf.c(0);
        c.b = true;
        c.d = "data3";
        return c;
    }

    ahe() {
    }
}
