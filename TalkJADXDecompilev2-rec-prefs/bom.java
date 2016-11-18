package p000;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.text.TextUtils;

public final class bom extends CursorWrapper implements dab {
    private czo f4104a;

    public bom(Cursor cursor) {
        super(cursor);
    }

    public void mo628a(czo czo) {
        this.f4104a = czo;
    }

    public hwk mo627a() {
        if (this.f4104a == null || mo632e() == 1) {
            return null;
        }
        Object string = getString(2);
        Object e = glq.m18021e(gwb.m1400H(), getString(1));
        if (!TextUtils.isEmpty(string)) {
            return this.f4104a.m11351a(string);
        }
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        return this.f4104a.m11353b(e);
    }

    public dak mo629b() {
        return new dak(new dap(getString(1), ""));
    }

    public dac mo630c() {
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

    public int mo631d() {
        return 0;
    }

    public int mo632e() {
        return getInt(5);
    }

    public boolean mo633f() {
        return true;
    }
}
