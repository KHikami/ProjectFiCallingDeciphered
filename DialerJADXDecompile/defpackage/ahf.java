package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: ahf */
final class ahf extends agp {
    public final String a() {
        return "website";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/website", null, buf.gW, 160, new ahc(buf.gW), new ahc("data1"));
        a.l.add(new afy("data1", buf.gW, 17));
        a.m = new ContentValues();
        a.m.put("data2", Integer.valueOf(7));
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    ahf() {
    }
}
