import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
final class agl extends agp {
    public final String a() {
        return "event";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/contact_event", "data2", buf.eQ, 120, new agk(), new ahc("data1"));
        a.l.add(new afy("data1", buf.eQ, 1));
        if (agf.a(attributeSet, "dateWithTime", false)) {
            a.n = ail.d;
            a.o = ail.c;
        } else {
            a.n = ail.a;
            a.o = ail.b;
        }
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    protected final afz a(AttributeSet attributeSet, String str) {
        boolean a = agf.a(attributeSet, "yearOptional", false);
        afz a2;
        if ("birthday".equals(str)) {
            a2 = agf.a(3, a);
            a2.c = 1;
            return a2;
        } else if ("anniversary".equals(str)) {
            return agf.a(1, a);
        } else {
            if ("other".equals(str)) {
                return agf.a(2, a);
            }
            if (!"custom".equals(str)) {
                return null;
            }
            a2 = agf.a(0, a);
            a2.b = true;
            a2.d = "data3";
            return a2;
        }
    }

    agl() {
    }
}
