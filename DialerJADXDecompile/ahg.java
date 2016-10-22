import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
public final class ahg extends agf {
    public ahg(Context context, String str, String str2) {
        this.a = str2;
        this.c = null;
        this.d = str;
        try {
            h();
            c(context);
            i();
            d(context);
            e(context);
            f(context);
            g(context);
            h(context);
            i(context);
            j(context);
            k(context);
            ahm a = a(new ahm("vnd.android.cursor.item/contact_event", buf.eQ, 120, true));
            a.f = new agk();
            a.h = new ahc("data1");
            a.j = 1;
            a.i = "data2";
            a.k = new ArrayList();
            List list = a.k;
            afz a2 = agf.a(3, false);
            a2.c = 1;
            list.add(a2);
            a.o = ail.c;
            a.l = new ArrayList();
            a.l.add(new afy("data1", buf.eQ, 1));
            l(context);
            k();
            this.g = true;
        } catch (Throwable e) {
            Log.e("ExchangeAccountType", "Problem building account type", e);
        }
    }

    public static boolean a(String str) {
        return "com.android.exchange".equals(str) || "com.google.android.exchange".equals(str) || "com.google.android.gm.exchange".equals(str);
    }

    protected final ahm h() {
        ahm a = a(new ahm("vnd.android.cursor.item/name", buf.fK, -1, true));
        a.f = new ahc(buf.fK);
        a.h = new ahc("data1");
        a.j = 1;
        a.l = new ArrayList();
        List list = a.l;
        afy afy = new afy("data4", buf.fS, 8289);
        afy.a = true;
        list.add(afy);
        a.l.add(new afy("data3", buf.fL, 8289));
        a.l.add(new afy("data5", buf.fN, 8289));
        a.l.add(new afy("data2", buf.fM, 8289));
        a.l.add(new afy("data6", buf.fT, 8289));
        a.l.add(new afy("data9", buf.fP, 193));
        a.l.add(new afy("data7", buf.fQ, 193));
        return a;
    }

    protected final ahm c(Context context) {
        List list;
        afy afy;
        ahm a = a(new ahm("#displayName", buf.fK, -1, true));
        boolean z = context.getResources().getBoolean(buf.cy);
        a.j = 1;
        a.l = new ArrayList();
        List list2 = a.l;
        afy afy2 = new afy("data4", buf.fS, 8289);
        afy2.a = true;
        list2.add(afy2);
        if (z) {
            a.l.add(new afy("data2", buf.fM, 8289));
            list = a.l;
            afy = new afy("data5", buf.fN, 8289);
            afy.a = true;
            list.add(afy);
            a.l.add(new afy("data3", buf.fL, 8289));
        } else {
            a.l.add(new afy("data3", buf.fL, 8289));
            list = a.l;
            afy = new afy("data5", buf.fN, 8289);
            afy.a = true;
            list.add(afy);
            a.l.add(new afy("data2", buf.fM, 8289));
        }
        list = a.l;
        afy = new afy("data6", buf.fT, 8289);
        afy.a = true;
        list.add(afy);
        return a;
    }

    protected final ahm i() {
        ahm a = a(new ahm("#phoneticName", buf.fO, -1, true));
        a.f = new ahc(buf.fK);
        a.h = new ahc("data1");
        a.j = 1;
        a.l = new ArrayList();
        a.l.add(new afy("data9", buf.fP, 193));
        a.l.add(new afy("data7", buf.fQ, 193));
        return a;
    }

    protected final ahm d(Context context) {
        ahm d = super.d(context);
        d.j = 1;
        d.l = new ArrayList();
        d.l.add(new afy("data1", buf.fV, 8289));
        return d;
    }

    protected final ahm e(Context context) {
        ahm e = super.e(context);
        e.i = "data2";
        e.k = new ArrayList();
        List list = e.k;
        afz a = agf.a(2);
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(1);
        a.c = 2;
        list.add(a);
        list = e.k;
        a = agf.a(3);
        a.c = 2;
        list.add(a);
        list = e.k;
        a = agf.a(4);
        a.b = true;
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(5);
        a.b = true;
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(6);
        a.b = true;
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(9);
        a.b = true;
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(10);
        a.b = true;
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(20);
        a.b = true;
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(14);
        a.b = true;
        a.c = 1;
        list.add(a);
        list = e.k;
        a = agf.a(19);
        a.b = true;
        a.c = 1;
        list.add(a);
        e.l = new ArrayList();
        e.l.add(new afy("data1", buf.fY, 3));
        return e;
    }

    protected final ahm f(Context context) {
        ahm f = super.f(context);
        f.j = 3;
        f.l = new ArrayList();
        f.l.add(new afy("data1", buf.eK, 33));
        return f;
    }

    protected final ahm g(Context context) {
        ahm g = super.g(context);
        boolean equals = Locale.JAPANESE.getLanguage().equals(Locale.getDefault().getLanguage());
        g.i = "data2";
        g.k = new ArrayList();
        List list = g.k;
        afz c = agf.c(2);
        c.c = 1;
        list.add(c);
        list = g.k;
        c = agf.c(1);
        c.c = 1;
        list.add(c);
        list = g.k;
        c = agf.c(3);
        c.c = 1;
        list.add(c);
        g.l = new ArrayList();
        List list2;
        afy afy;
        if (equals) {
            list2 = g.l;
            afy = new afy("data10", buf.gc, 139377);
            afy.a = true;
            list2.add(afy);
            g.l.add(new afy("data9", buf.gd, 139377));
            g.l.add(new afy("data8", buf.ge, 139377));
            g.l.add(new afy("data7", buf.gb, 139377));
            g.l.add(new afy("data4", buf.gf, 139377));
        } else {
            g.l.add(new afy("data4", buf.gf, 139377));
            g.l.add(new afy("data7", buf.gb, 139377));
            g.l.add(new afy("data8", buf.ge, 139377));
            g.l.add(new afy("data9", buf.gd, 139377));
            list2 = g.l;
            afy = new afy("data10", buf.gc, 139377);
            afy.a = true;
            list2.add(afy);
        }
        return g;
    }

    protected final ahm h(Context context) {
        ahm h = super.h(context);
        h.j = 3;
        h.m = new ContentValues();
        h.m.put("data2", Integer.valueOf(3));
        h.l = new ArrayList();
        h.l.add(new afy("data1", buf.fn, 33));
        return h;
    }

    protected final ahm i(Context context) {
        ahm i = super.i(context);
        i.j = 1;
        i.l = new ArrayList();
        i.l.add(new afy("data1", buf.fk, 8193));
        i.l.add(new afy("data4", buf.fl, 8193));
        return i;
    }

    protected final ahm j(Context context) {
        ahm j = super.j(context);
        j.j = 1;
        j.l = new ArrayList();
        j.l.add(new afy("data15", -1, -1));
        return j;
    }

    protected final ahm k(Context context) {
        ahm k = super.k(context);
        k.l = new ArrayList();
        k.l.add(new afy("data1", buf.fv, 147457));
        return k;
    }

    protected final ahm l(Context context) {
        ahm l = super.l(context);
        l.j = 1;
        l.l = new ArrayList();
        l.l.add(new afy("data1", buf.gW, 17));
        return l;
    }

    public final boolean g() {
        return true;
    }

    public final boolean b() {
        return true;
    }
}
