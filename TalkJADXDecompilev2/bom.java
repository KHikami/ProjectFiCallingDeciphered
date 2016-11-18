package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.text.TextUtils;

public final class bom extends CursorWrapper implements dab {
    private czo a;

    public bom(Cursor cursor) {
        super(cursor);
    }

    public void a(czo czo) {
        this.a = czo;
    }

    public hwk a() {
        if (this.a == null || e() == 1) {
            return null;
        }
        Object string = getString(2);
        Object e = glq.e(gwb.H(), getString(1));
        if (!TextUtils.isEmpty(string)) {
            return this.a.a(string);
        }
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        return this.a.b(e);
    }

    public dak b() {
        return new dak(new dap(getString(1), ""));
    }

    public dac c() {
        boolean z = true;
        String string = getString(0);
        String string2 = getString(1);
        long j = getLong(3);
        int i = getInt(4);
        String string3 = getString(6);
        if (getInt(7) == 0) {
            z = false;
        }
        return new dac(string, string2, j, i, string3, z);
    }

    public int d() {
        return 0;
    }

    public int e() {
        return getInt(5);
    }

    public boolean f() {
        return true;
    }
}
