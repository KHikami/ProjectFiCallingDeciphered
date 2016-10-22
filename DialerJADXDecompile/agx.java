import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
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
            return a(1, false);
        }
        if ("mobile".equals(str)) {
            return a(2, false);
        }
        if ("work".equals(str)) {
            return a(3, false);
        }
        if ("fax_work".equals(str)) {
            return a(4, true);
        }
        if ("fax_home".equals(str)) {
            return a(5, true);
        }
        if ("pager".equals(str)) {
            return a(6, true);
        }
        if ("other".equals(str)) {
            return a(7, false);
        }
        if ("callback".equals(str)) {
            return a(8, true);
        }
        if ("car".equals(str)) {
            return a(9, true);
        }
        if ("company_main".equals(str)) {
            return a(10, true);
        }
        if ("isdn".equals(str)) {
            return a(11, true);
        }
        if ("main".equals(str)) {
            return a(12, true);
        }
        if ("other_fax".equals(str)) {
            return a(13, true);
        }
        if ("radio".equals(str)) {
            return a(14, true);
        }
        if ("telex".equals(str)) {
            return a(15, true);
        }
        if ("tty_tdd".equals(str)) {
            return a(16, true);
        }
        if ("work_mobile".equals(str)) {
            return a(17, true);
        }
        if ("work_pager".equals(str)) {
            return a(18, true);
        }
        if ("assistant".equals(str)) {
            return a(19, true);
        }
        if ("mms".equals(str)) {
            return a(20, true);
        }
        if (!"custom".equals(str)) {
            return null;
        }
        afz a = a(0, true);
        a.d = "data3";
        return a;
    }

    agx() {
    }
}
