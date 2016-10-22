import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
final class agm extends agp {
    public final String a() {
        return "group_membership";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        ahm a = a(context, xmlPullParser, attributeSet, false, "vnd.android.cursor.item/group_membership", null, buf.fm, 150, null, null);
        a.l.add(new afy("data1", -1, -1));
        a.p = 10;
        agp.a(a);
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    agm() {
    }
}
