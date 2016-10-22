package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: agy */
final class agy extends agp {
    public final String a() {
        return "photo";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        ahm a = a(context, xmlPullParser, attributeSet, false, "vnd.android.cursor.item/photo", null, -1, -1, null, null);
        a.l.add(new afy("data15", -1, -1));
        agp.a(a);
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    agy() {
    }
}
