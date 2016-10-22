package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.Relation;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: agf */
public abstract class agf extends afv {
    public static final agb i;

    static {
        i = new agg();
    }

    public agf() {
        this.a = null;
        this.b = null;
        this.e = buf.dA;
        this.f = buf.dy;
    }

    protected static afz a(int i) {
        return new afz(i, Phone.getTypeLabelResource(i));
    }

    protected static afz b(int i) {
        return new afz(i, Email.getTypeLabelResource(i));
    }

    protected static afz c(int i) {
        return new afz(i, StructuredPostal.getTypeLabelResource(i));
    }

    protected static afz d(int i) {
        return new afz(i, Im.getProtocolLabelResource(i));
    }

    protected static afz a(int i, boolean z) {
        afz aga = new aga(i, Event.getTypeResource(Integer.valueOf(i)));
        aga.e = z;
        return aga;
    }

    protected static afz e(int i) {
        return new afz(i, Relation.getTypeLabelResource(i));
    }

    static boolean a(AttributeSet attributeSet, String str, boolean z) {
        return attributeSet.getAttributeBooleanValue(null, str, z);
    }

    static int a(AttributeSet attributeSet, String str, int i) {
        return attributeSet.getAttributeIntValue(null, str, i);
    }

    static String a(AttributeSet attributeSet, String str) {
        return attributeSet.getAttributeValue(null, str);
    }

    protected ahm h() {
        ahm a = a(new ahm("vnd.android.cursor.item/name", buf.fK, -1, true));
        a.f = new ahc(buf.fK);
        a.h = new ahc("data1");
        a.j = 1;
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.fj, 8289));
        List list = a.l;
        afy afy = new afy("data4", buf.fS, 8289);
        afy.c = true;
        list.add(afy);
        list = a.l;
        afy = new afy("data3", buf.fL, 8289);
        afy.c = true;
        list.add(afy);
        list = a.l;
        afy = new afy("data5", buf.fN, 8289);
        afy.c = true;
        list.add(afy);
        list = a.l;
        afy = new afy("data2", buf.fM, 8289);
        afy.c = true;
        list.add(afy);
        list = a.l;
        afy = new afy("data6", buf.fT, 8289);
        afy.c = true;
        list.add(afy);
        a.l.add(new afy("data9", buf.fP, 193));
        a.l.add(new afy("data8", buf.fR, 193));
        a.l.add(new afy("data7", buf.fQ, 193));
        return a;
    }

    protected ahm c(Context context) {
        ahm a = a(new ahm("#displayName", buf.fK, -1, true));
        a.f = new ahc(buf.fK);
        a.h = new ahc("data1");
        a.j = 1;
        a.l = new ArrayList();
        List list = a.l;
        afy afy = new afy("data1", buf.fj, 8289);
        afy.b = true;
        list.add(afy);
        if (context.getResources().getBoolean(buf.cy)) {
            list = a.l;
            afy = new afy("data4", buf.fS, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data2", buf.fM, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data5", buf.fN, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data3", buf.fL, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data6", buf.fT, 8289);
            afy.c = true;
            list.add(afy);
        } else {
            list = a.l;
            afy = new afy("data4", buf.fS, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data3", buf.fL, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data5", buf.fN, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data2", buf.fM, 8289);
            afy.c = true;
            list.add(afy);
            list = a.l;
            afy = new afy("data6", buf.fT, 8289);
            afy.c = true;
            list.add(afy);
        }
        return a;
    }

    protected ahm i() {
        ahm a = a(new ahm("#phoneticName", buf.fO, -1, true));
        a.f = new ahc(buf.fK);
        a.h = new ahc("data1");
        a.j = 1;
        a.l = new ArrayList();
        List list = a.l;
        afy afy = new afy("#phoneticName", buf.fO, 193);
        afy.b = true;
        list.add(afy);
        list = a.l;
        afy = new afy("data9", buf.fP, 193);
        afy.c = true;
        list.add(afy);
        list = a.l;
        afy = new afy("data8", buf.fR, 193);
        afy.c = true;
        list.add(afy);
        list = a.l;
        afy = new afy("data7", buf.fQ, 193);
        afy.c = true;
        list.add(afy);
        return a;
    }

    protected ahm d(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/nickname", buf.fV, 111, true));
        a.j = 1;
        a.f = new ahc(buf.fV);
        a.h = new ahc("data1");
        a.m = new ContentValues();
        a.m.put("data2", Integer.valueOf(1));
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.fV, 8289));
        return a;
    }

    protected ahm e(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/phone_v2", buf.fY, 10, true));
        a.c = buf.dc;
        a.d = buf.gn;
        a.f = new agw();
        a.g = new agv();
        a.h = new ahc("data1");
        a.i = "data2";
        a.k = new ArrayList();
        a.k.add(agf.a(2));
        a.k.add(agf.a(1));
        a.k.add(agf.a(3));
        List list = a.k;
        afz a2 = agf.a(4);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(5);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(6);
        a2.b = true;
        list.add(a2);
        a.k.add(agf.a(7));
        list = a.k;
        a2 = agf.a(0);
        a2.b = true;
        a2.d = "data3";
        list.add(a2);
        list = a.k;
        a2 = agf.a(8);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(9);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(10);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(11);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(12);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(13);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(14);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(15);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(16);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(17);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(18);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(19);
        a2.b = true;
        list.add(a2);
        list = a.k;
        a2 = agf.a(20);
        a2.b = true;
        list.add(a2);
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.fY, 3));
        return a;
    }

    protected ahm f(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/email_v2", buf.eK, 15, true));
        a.f = new agi();
        a.h = new ahc("data1");
        a.i = "data2";
        a.k = new ArrayList();
        a.k.add(agf.b(1));
        a.k.add(agf.b(2));
        a.k.add(agf.b(3));
        a.k.add(agf.b(4));
        List list = a.k;
        afz b = agf.b(0);
        b.b = true;
        b.d = "data3";
        list.add(b);
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.eK, 33));
        return a;
    }

    protected ahm g(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/postal-address_v2", buf.fZ, 25, true));
        a.f = new agz();
        a.h = new ahc("data1");
        a.i = "data2";
        a.k = new ArrayList();
        a.k.add(agf.c(1));
        a.k.add(agf.c(2));
        a.k.add(agf.c(3));
        List list = a.k;
        afz c = agf.c(0);
        c.b = true;
        c.d = "data3";
        list.add(c);
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.ga, 139377));
        a.p = 10;
        return a;
    }

    protected ahm h(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/im", buf.fn, 140, true));
        a.f = new agn();
        a.h = new ahc("data1");
        a.m = new ContentValues();
        a.m.put("data2", Integer.valueOf(3));
        a.i = "data5";
        a.k = new ArrayList();
        a.k.add(agf.d(0));
        a.k.add(agf.d(1));
        a.k.add(agf.d(2));
        a.k.add(agf.d(3));
        a.k.add(agf.d(4));
        a.k.add(agf.d(5));
        a.k.add(agf.d(6));
        a.k.add(agf.d(7));
        List list = a.k;
        afz d = agf.d(-1);
        d.b = true;
        d.d = "data6";
        list.add(d);
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.fn, 33));
        return a;
    }

    protected ahm i(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/organization", buf.fX, 125, true));
        a.f = new ahc(buf.fX);
        a.h = i;
        a.j = 1;
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.fk, 8193));
        a.l.add(new afy("data4", buf.fl, 8193));
        return a;
    }

    protected ahm j(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/photo", -1, -1, true));
        a.j = 1;
        a.l = new ArrayList();
        a.l.add(new afy("data15", -1, -1));
        return a;
    }

    protected ahm k(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/note", buf.fv, 130, true));
        a.j = 1;
        a.f = new ahc(buf.fv);
        a.h = new ahc("data1");
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.fv, 147457));
        a.p = 100;
        return a;
    }

    protected ahm l(Context context) {
        ahm a = a(new ahm("vnd.android.cursor.item/website", buf.gW, 160, true));
        a.f = new ahc(buf.gW);
        a.h = new ahc("data1");
        a.m = new ContentValues();
        a.m.put("data2", Integer.valueOf(7));
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.gW, 17));
        return a;
    }

    protected final ahm j() {
        ahm a = a(new ahm("vnd.android.cursor.item/sip_address", buf.fw, 145, true));
        a.f = new ahc(buf.fw);
        a.h = new ahc("data1");
        a.l = new ArrayList();
        a.l.add(new afy("data1", buf.fw, 33));
        a.j = 1;
        return a;
    }

    protected final ahm k() {
        ahm a = a(new ahm("vnd.android.cursor.item/group_membership", buf.fm, 150, true));
        a.j = 1;
        a.l = new ArrayList();
        a.l.add(new afy("data1", -1, -1));
        a.p = 10;
        return a;
    }

    public boolean g() {
        return false;
    }

    protected final void a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        String attributeValue;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next != 3 || xmlPullParser.getDepth() > depth) {
                int depth2 = xmlPullParser.getDepth();
                if (next == 2 && depth2 == depth + 1) {
                    String name = xmlPullParser.getName();
                    if ("DataKind".equals(name)) {
                        agq agq = agq.a;
                        attributeValue = attributeSet.getAttributeValue(null, "kind");
                        agp agp = (agp) agq.b.get(attributeValue);
                        if (agp == null) {
                            break;
                        }
                        for (ahm a : agp.a(context, xmlPullParser, attributeSet)) {
                            a(a);
                        }
                    } else {
                        attributeValue = "BaseAccountType";
                        String str = "Skipping unknown tag ";
                        name = String.valueOf(name);
                        Log.w(attributeValue, name.length() != 0 ? str.concat(name) : new String(str));
                    }
                }
            } else {
                return;
            }
        }
        throw new afx(new StringBuilder(String.valueOf(attributeValue).length() + 22).append("Undefined data kind '").append(attributeValue).append("'").toString());
    }
}
