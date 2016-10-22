import android.content.ContentValues;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
final class ahb extends agp {
    public final String a() {
        return "relationship";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/relation", "data2", buf.gi, 999, new aha(), new ahc("data1"));
        a.l.add(new afy("data1", buf.gi, 8289));
        a.m = new ContentValues();
        a.m.put("data2", Integer.valueOf(14));
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    protected final afz a(AttributeSet attributeSet, String str) {
        if ("assistant".equals(str)) {
            return agf.e(1);
        }
        if ("brother".equals(str)) {
            return agf.e(2);
        }
        if ("child".equals(str)) {
            return agf.e(3);
        }
        if ("domestic_partner".equals(str)) {
            return agf.e(4);
        }
        if ("father".equals(str)) {
            return agf.e(5);
        }
        if ("friend".equals(str)) {
            return agf.e(6);
        }
        if ("manager".equals(str)) {
            return agf.e(7);
        }
        if ("mother".equals(str)) {
            return agf.e(8);
        }
        if ("parent".equals(str)) {
            return agf.e(9);
        }
        if ("partner".equals(str)) {
            return agf.e(10);
        }
        if ("referred_by".equals(str)) {
            return agf.e(11);
        }
        if ("relative".equals(str)) {
            return agf.e(12);
        }
        if ("sister".equals(str)) {
            return agf.e(13);
        }
        if ("spouse".equals(str)) {
            return agf.e(14);
        }
        if (!"custom".equals(str)) {
            return null;
        }
        afz e = agf.e(0);
        e.b = true;
        e.d = "data3";
        return e;
    }

    ahb() {
    }
}
