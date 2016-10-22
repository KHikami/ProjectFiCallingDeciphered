package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cpz */
public final class cpz implements cpw {
    private final Context a;
    private final int b;
    private final boolean c;
    private final long d;
    private final int e;
    private final int f;
    private final long g;
    private final int h;
    private final int i;
    private final int j;
    private final long k;
    private final long l;
    private final String m;
    private final String n;
    private final ImageView o;
    private final List<cqc> p;

    public cpz(View view, int i, Cursor cursor) {
        this.b = cursor.getInt(33);
        this.c = cursor.getInt(8) == fwy.OUTGOING_USER_MESSAGE.ordinal();
        this.d = cursor.getLong(6) / 1000;
        this.f = cursor.getInt(42);
        this.g = cursor.getLong(43) / 1000;
        this.h = cursor.getInt(44);
        this.i = cursor.getInt(37);
        this.j = cursor.getInt(46);
        this.k = cursor.getLong(45);
        this.l = this.k - this.g;
        this.m = cursor.getString(2);
        this.n = cursor.getString(1);
        this.e = i;
        this.o = (ImageView) view.findViewById(ba.ay);
        this.a = view.getContext();
        this.p = jyn.c(this.a, cqc.class);
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public long e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        return this.j;
    }

    public long i() {
        return this.k;
    }

    public long j() {
        return this.l;
    }

    public String k() {
        return this.m;
    }

    public String l() {
        return this.n;
    }

    public ImageView m() {
        return this.o;
    }

    public boolean n() {
        for (cqc a : this.p) {
            if (a.a(this)) {
                return true;
            }
        }
        return false;
    }

    public List<String> o() {
        List<String> arrayList = new ArrayList();
        for (cqc cqc : this.p) {
            if (cqc.a(this)) {
                arrayList.add(cqc.b(this));
            }
        }
        return arrayList;
    }
}
