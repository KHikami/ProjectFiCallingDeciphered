import android.content.ContentValues;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
final class ago extends agp {
    public final String a() {
        return "im";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/im", "data5", buf.fn, 140, new agn(), new ahc("data1"));
        a.l.add(new afy("data1", buf.fn, 33));
        a.m = new ContentValues();
        a.m.put("data2", Integer.valueOf(3));
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    protected final afz a(AttributeSet attributeSet, String str) {
        if ("aim".equals(str)) {
            return agf.d(0);
        }
        if ("msn".equals(str)) {
            return agf.d(1);
        }
        if ("yahoo".equals(str)) {
            return agf.d(2);
        }
        if ("skype".equals(str)) {
            return agf.d(3);
        }
        if ("qq".equals(str)) {
            return agf.d(4);
        }
        if ("google_talk".equals(str)) {
            return agf.d(5);
        }
        if ("icq".equals(str)) {
            return agf.d(6);
        }
        if ("jabber".equals(str)) {
            return agf.d(7);
        }
        if (!"custom".equals(str)) {
            return null;
        }
        afz d = agf.d(-1);
        d.b = true;
        d.d = "data6";
        return d;
    }

    ago() {
    }
}
