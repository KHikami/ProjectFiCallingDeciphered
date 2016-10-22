package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: agr */
final class agr extends agp {
    private static void a(boolean z, String str) {
        if (!z) {
            throw new afx(String.valueOf(str).concat(" must be true"));
        }
    }

    public final String a() {
        return "name";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        List list;
        afy afy;
        boolean z = context.getResources().getBoolean(buf.cy);
        boolean a = agf.a(attributeSet, "supportsDisplayName", false);
        boolean a2 = agf.a(attributeSet, "supportsPrefix", false);
        boolean a3 = agf.a(attributeSet, "supportsMiddleName", false);
        boolean a4 = agf.a(attributeSet, "supportsSuffix", false);
        boolean a5 = agf.a(attributeSet, "supportsPhoneticFamilyName", false);
        boolean a6 = agf.a(attributeSet, "supportsPhoneticMiddleName", false);
        boolean a7 = agf.a(attributeSet, "supportsPhoneticGivenName", false);
        agr.a(a, "supportsDisplayName");
        agr.a(a2, "supportsPrefix");
        agr.a(a3, "supportsMiddleName");
        agr.a(a4, "supportsSuffix");
        agr.a(a5, "supportsPhoneticFamilyName");
        agr.a(a6, "supportsPhoneticMiddleName");
        agr.a(a7, "supportsPhoneticGivenName");
        List arrayList = new ArrayList();
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a8 = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/name", null, buf.fK, -1, new ahc(buf.fK), new ahc("data1"));
        agp.a(a8);
        arrayList.add(a8);
        a8.l.add(new afy("data1", buf.fj, 8289));
        List list2 = a8.l;
        afy afy2 = new afy("data4", buf.fS, 8289);
        afy2.c = true;
        list2.add(afy2);
        list2 = a8.l;
        afy2 = new afy("data3", buf.fL, 8289);
        afy2.c = true;
        list2.add(afy2);
        list2 = a8.l;
        afy2 = new afy("data5", buf.fN, 8289);
        afy2.c = true;
        list2.add(afy2);
        list2 = a8.l;
        afy2 = new afy("data2", buf.fM, 8289);
        afy2.c = true;
        list2.add(afy2);
        list2 = a8.l;
        afy2 = new afy("data6", buf.fT, 8289);
        afy2.c = true;
        list2.add(afy2);
        a8.l.add(new afy("data9", buf.fP, 193));
        a8.l.add(new afy("data8", buf.fR, 193));
        a8.l.add(new afy("data7", buf.fQ, 193));
        context2 = context;
        xmlPullParser2 = xmlPullParser;
        attributeSet2 = attributeSet;
        a8 = a(context2, xmlPullParser2, attributeSet2, true, "#displayName", null, buf.fK, -1, new ahc(buf.fK), new ahc("data1"));
        a8.j = 1;
        arrayList.add(a8);
        list2 = a8.l;
        afy2 = new afy("data1", buf.fj, 8289);
        afy2.b = true;
        list2.add(afy2);
        if (z) {
            list2 = a8.l;
            afy2 = new afy("data4", buf.fS, 8289);
            afy2.c = true;
            list2.add(afy2);
            list2 = a8.l;
            afy2 = new afy("data2", buf.fM, 8289);
            afy2.c = true;
            list2.add(afy2);
            list2 = a8.l;
            afy2 = new afy("data5", buf.fN, 8289);
            afy2.c = true;
            list2.add(afy2);
            list2 = a8.l;
            afy2 = new afy("data3", buf.fL, 8289);
            afy2.c = true;
            list2.add(afy2);
            list = a8.l;
            afy = new afy("data6", buf.fT, 8289);
            afy.c = true;
            list.add(afy);
        } else {
            list2 = a8.l;
            afy2 = new afy("data4", buf.fS, 8289);
            afy2.c = true;
            list2.add(afy2);
            list2 = a8.l;
            afy2 = new afy("data3", buf.fL, 8289);
            afy2.c = true;
            list2.add(afy2);
            list2 = a8.l;
            afy2 = new afy("data5", buf.fN, 8289);
            afy2.c = true;
            list2.add(afy2);
            list2 = a8.l;
            afy2 = new afy("data2", buf.fM, 8289);
            afy2.c = true;
            list2.add(afy2);
            list = a8.l;
            afy = new afy("data6", buf.fT, 8289);
            afy.c = true;
            list.add(afy);
        }
        context2 = context;
        xmlPullParser2 = xmlPullParser;
        attributeSet2 = attributeSet;
        a8 = a(context2, xmlPullParser2, attributeSet2, true, "#phoneticName", null, buf.fO, -1, new ahc(buf.fK), new ahc("data1"));
        a8.j = 1;
        arrayList.add(a8);
        list2 = a8.l;
        afy2 = new afy("#phoneticName", buf.fO, 193);
        afy2.b = true;
        list2.add(afy2);
        list2 = a8.l;
        afy2 = new afy("data9", buf.fP, 193);
        afy2.c = true;
        list2.add(afy2);
        list2 = a8.l;
        afy2 = new afy("data8", buf.fR, 193);
        afy2.c = true;
        list2.add(afy2);
        list = a8.l;
        afy = new afy("data7", buf.fQ, 193);
        afy.c = true;
        list.add(afy);
        return arrayList;
    }

    agr() {
    }
}
