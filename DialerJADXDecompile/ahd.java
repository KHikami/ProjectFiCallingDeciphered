import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
final class ahd extends agp {
    public final String a() {
        return "sip_address";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/sip_address", null, buf.fw, 145, new ahc(buf.fw), new ahc("data1"));
        a.l.add(new afy("data1", buf.fw, 33));
        agp.a(a);
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    ahd() {
    }
}
