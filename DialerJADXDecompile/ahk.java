import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
public final class ahk extends agf {
    public ahk(Context context, String str, String str2) {
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
            l(context);
            k();
            ahm a = a(new ahm("vnd.android.cursor.item/relation", buf.gi, 160, true));
            a.f = new aha();
            a.h = new ahc("data1");
            a.i = "data2";
            a.k = new ArrayList();
            a.k.add(agf.e(1));
            a.k.add(agf.e(2));
            a.k.add(agf.e(3));
            a.k.add(agf.e(4));
            a.k.add(agf.e(5));
            a.k.add(agf.e(6));
            a.k.add(agf.e(7));
            a.k.add(agf.e(8));
            a.k.add(agf.e(9));
            a.k.add(agf.e(10));
            a.k.add(agf.e(11));
            a.k.add(agf.e(12));
            a.k.add(agf.e(13));
            a.k.add(agf.e(14));
            List list = a.k;
            afz e = agf.e(0);
            e.b = true;
            e.d = "data3";
            list.add(e);
            a.m = new ContentValues();
            a.m.put("data2", Integer.valueOf(14));
            a.l = new ArrayList();
            a.l.add(new afy("data1", buf.gi, 8289));
            a = a(new ahm("vnd.android.cursor.item/contact_event", buf.eQ, 150, true));
            a.f = new agk();
            a.h = new ahc("data1");
            a.i = "data2";
            a.k = new ArrayList();
            a.n = ail.a;
            a.o = ail.b;
            list = a.k;
            e = agf.a(3, true);
            e.c = 1;
            list.add(e);
            a.k.add(agf.a(1, false));
            a.k.add(agf.a(2, false));
            list = a.k;
            e = agf.a(0, false);
            e.b = true;
            e.d = "data3";
            list.add(e);
            a.m = new ContentValues();
            a.m.put("data2", Integer.valueOf(3));
            a.l = new ArrayList();
            a.l.add(new afy("data1", buf.eQ, 1));
            this.g = true;
        } catch (Throwable e2) {
            Log.e("KnownExternalAccountType", "Problem building account type", e2);
        }
    }

    public static boolean a(Context context, String str, String str2) {
        return "com.osp.app.signin".equals(str) && !ahh.a(context, str2);
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

    protected final ahm e(Context context) {
        ahm e = super.e(context);
        e.i = "data2";
        e.k = new ArrayList();
        e.k.add(agf.a(2));
        e.k.add(agf.a(1));
        e.k.add(agf.a(3));
        e.k.add(agf.a(12));
        List list = e.k;
        afz a = agf.a(4);
        a.b = true;
        list.add(a);
        list = e.k;
        a = agf.a(5);
        a.b = true;
        list.add(a);
        list = e.k;
        a = agf.a(6);
        a.b = true;
        list.add(a);
        list = e.k;
        a = agf.a(14);
        a.b = true;
        list.add(a);
        e.k.add(agf.a(7));
        list = e.k;
        a = agf.a(0);
        a.b = true;
        a.d = "data3";
        list.add(a);
        e.l = new ArrayList();
        e.l.add(new afy("data1", buf.fY, 3));
        return e;
    }

    protected final ahm f(Context context) {
        ahm f = super.f(context);
        f.i = "data2";
        f.k = new ArrayList();
        f.k.add(agf.b(1));
        f.k.add(agf.b(2));
        f.k.add(agf.b(3));
        List list = f.k;
        afz b = agf.b(0);
        b.b = true;
        b.d = "data3";
        list.add(b);
        f.l = new ArrayList();
        f.l.add(new afy("data1", buf.eK, 33));
        return f;
    }

    public final boolean g() {
        return true;
    }

    public final boolean b() {
        return true;
    }
}
