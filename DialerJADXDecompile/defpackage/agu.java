package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: agu */
final class agu extends agp {
    public final String a() {
        return "organization";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        ahm a = a(context, xmlPullParser, attributeSet, false, "vnd.android.cursor.item/organization", null, buf.fX, 125, new ahc(buf.fX), agf.i);
        a.l.add(new afy("data1", buf.fk, 8193));
        a.l.add(new afy("data4", buf.fl, 8193));
        agp.a(a);
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    agu() {
    }
}
