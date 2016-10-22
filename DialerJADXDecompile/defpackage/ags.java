package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: ags */
final class ags extends agp {
    public final String a() {
        return "nickname";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/nickname", null, buf.fV, 111, new ahc(buf.fV), new ahc("data1"));
        a.l.add(new afy("data1", buf.fV, 8289));
        a.m = new ContentValues();
        a.m.put("data2", Integer.valueOf(1));
        agp.a(a);
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    ags() {
    }
}
