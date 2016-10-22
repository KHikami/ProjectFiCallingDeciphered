import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
final class agj extends agp {
    public final String a() {
        return "email";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/email_v2", "data2", buf.eK, 15, new agi(), new ahc("data1"));
        a.l.add(new afy("data1", buf.eK, 33));
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    protected final afz a(AttributeSet attributeSet, String str) {
        if ("home".equals(str)) {
            return agf.b(1);
        }
        if ("work".equals(str)) {
            return agf.b(2);
        }
        if ("other".equals(str)) {
            return agf.b(3);
        }
        if ("mobile".equals(str)) {
            return agf.b(4);
        }
        if (!"custom".equals(str)) {
            return null;
        }
        afz b = agf.b(0);
        b.b = true;
        b.d = "data3";
        return b;
    }

    agj() {
    }
}
