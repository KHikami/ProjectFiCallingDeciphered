package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

public final class cpz implements cpw {
    private final Context f8809a;
    private final int f8810b;
    private final boolean f8811c;
    private final long f8812d;
    private final int f8813e;
    private final int f8814f;
    private final long f8815g;
    private final int f8816h;
    private final int f8817i;
    private final int f8818j;
    private final long f8819k;
    private final long f8820l;
    private final String f8821m;
    private final String f8822n;
    private final ImageView f8823o;
    private final List<cqc> f8824p;

    public cpz(View view, int i, Cursor cursor) {
        this.f8810b = cursor.getInt(33);
        this.f8811c = cursor.getInt(8) == fwy.OUTGOING_USER_MESSAGE.ordinal();
        this.f8812d = cursor.getLong(6) / 1000;
        this.f8814f = cursor.getInt(42);
        this.f8815g = cursor.getLong(43) / 1000;
        this.f8816h = cursor.getInt(44);
        this.f8817i = cursor.getInt(37);
        this.f8818j = cursor.getInt(46);
        this.f8819k = cursor.getLong(45);
        this.f8820l = this.f8819k - this.f8815g;
        this.f8821m = cursor.getString(2);
        this.f8822n = cursor.getString(1);
        this.f8813e = i;
        this.f8823o = (ImageView) view.findViewById(ba.ay);
        this.f8809a = view.getContext();
        this.f8824p = jyn.m25438c(this.f8809a, cqc.class);
    }

    public Context mo721a() {
        return this.f8809a;
    }

    public boolean mo722b() {
        return this.f8811c;
    }

    public long mo723c() {
        return this.f8812d;
    }

    public int mo724d() {
        return this.f8814f;
    }

    public long mo725e() {
        return this.f8815g;
    }

    public int mo726f() {
        return this.f8816h;
    }

    public int mo727g() {
        return this.f8817i;
    }

    public int mo728h() {
        return this.f8818j;
    }

    public long mo729i() {
        return this.f8819k;
    }

    public long mo730j() {
        return this.f8820l;
    }

    public String mo731k() {
        return this.f8821m;
    }

    public String mo732l() {
        return this.f8822n;
    }

    public ImageView mo733m() {
        return this.f8823o;
    }

    public boolean mo734n() {
        for (cqc a : this.f8824p) {
            if (a.mo1379a(this)) {
                return true;
            }
        }
        return false;
    }

    public List<String> mo735o() {
        List<String> arrayList = new ArrayList();
        for (cqc cqc : this.f8824p) {
            if (cqc.mo1379a(this)) {
                arrayList.add(cqc.mo1380b(this));
            }
        }
        return arrayList;
    }
}
