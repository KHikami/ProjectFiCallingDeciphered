package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: cbm */
public final class cbm extends enk {
    private final bko j;
    private final edk k;
    private final boolean l;
    private final gou m;
    private final gor n;
    private final gos o;

    public cbm(Context context, bko bko, edk edk, boolean z, boolean z2, gor gor, gos gos) {
        super(context, null);
        this.j = bko;
        this.k = edk;
        this.l = z;
        this.n = gor;
        this.o = gos;
        if (!fdq.i.b(bko.g()) || z2) {
            this.m = gou.PEOPLE_OPTIONS_GUEST;
        } else {
            this.m = gou.PEOPLE_OPTIONS;
        }
    }

    public boolean isEnabled(int i) {
        return false;
    }

    public int getCount() {
        int count = super.getCount();
        if (this.k != null) {
            return Math.max(1, count);
        }
        return count;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!(view == null || (view instanceof gon))) {
            view = null;
        }
        return super.getView(i, view, viewGroup);
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View gon = new gon(context, this.j, this.m);
        gon.a(this.n);
        gon.a(this.o);
        return gon;
    }

    public void a(View view, Cursor cursor) {
        edk edk;
        boolean z;
        if (this.k != null) {
            edk = this.k;
        } else {
            edk = bkf.a(this.j, cursor);
        }
        gon gon = (gon) view;
        gon.k();
        if (this.l) {
            z = false;
        } else {
            z = true;
        }
        gon.a(bjj.a(edk, null, z), null, false, this.l, this.m);
    }
}
