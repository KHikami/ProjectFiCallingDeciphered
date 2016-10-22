package defpackage;

import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: agx */
final class agx extends agp {
    private static afz a(int i, boolean z) {
        afz afz = new afz(i, Phone.getTypeLabelResource(i));
        afz.b = z;
        return afz;
    }

    public final String a() {
        return "phone";
    }

    public final List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Context context2 = context;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        ahm a = a(context2, xmlPullParser2, attributeSet2, false, "vnd.android.cursor.item/phone_v2", "data2", buf.fY, 10, new agw(), new ahc("data1"));
        a.c = buf.dc;
        a.d = buf.gn;
        a.g = new agv();
        a.l.add(new afy("data1", buf.fY, 3));
        List arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    protected final afz a(AttributeSet attributeSet, String str) {
        if ("home".equals(str)) {
            return agx.a(1, false);
        }
        if ("mobile".equals(str)) {
            return agx.a(2, false);
        }
        if ("work".equals(str)) {
            return agx.a(3, false);
        }
        if ("fax_work".equals(str)) {
            return agx.a(4, true);
        }
        if ("fax_home".equals(str)) {
            return agx.a(5, true);
        }
        if ("pager".equals(str)) {
            return agx.a(6, true);
        }
        if ("other".equals(str)) {
            return agx.a(7, false);
        }
        if ("callback".equals(str)) {
            return agx.a(8, true);
        }
        if ("car".equals(str)) {
            return agx.a(9, true);
        }
        if ("company_main".equals(str)) {
            return agx.a(10, true);
        }
        if ("isdn".equals(str)) {
            return agx.a(11, true);
        }
        if ("main".equals(str)) {
            return agx.a(12, true);
        }
        if ("other_fax".equals(str)) {
            return agx.a(13, true);
        }
        if ("radio".equals(str)) {
            return agx.a(14, true);
        }
        if ("telex".equals(str)) {
            return agx.a(15, true);
        }
        if ("tty_tdd".equals(str)) {
            return agx.a(16, true);
        }
        if ("work_mobile".equals(str)) {
            return agx.a(17, true);
        }
        if ("work_pager".equals(str)) {
            return agx.a(18, true);
        }
        if ("assistant".equals(str)) {
            return agx.a(19, true);
        }
        if ("mms".equals(str)) {
            return agx.a(20, true);
        }
        if (!"custom".equals(str)) {
            return null;
        }
        afz a = agx.a(0, true);
        a.d = "data3";
        return a;
    }

    agx() {
    }
}
