package p000;

import android.content.Context;
import android.database.MatrixCursor;

public final class dec extends MatrixCursor implements dab {
    private static final String[] f9549a = new String[]{"DisplayName", "PhoneNumber"};
    private boolean f9550b = false;

    public dec() {
        super(f9549a);
    }

    public void m11513a(String str, Context context) {
        if (this.f9550b) {
            glk.m17982e("Babel", "InputCallContactCursor.setPhone() was called more than once!", new Object[0]);
            return;
        }
        String i = glq.m18038i(gwb.m1400H(), str);
        Object[] objArr = new Object[2];
        objArr[0] = context.getResources().getString(bc.f2928L, new Object[]{i});
        objArr[1] = str;
        addRow(objArr);
        this.f9550b = true;
    }

    public hwk mo627a() {
        return null;
    }

    public dak mo629b() {
        return new dak(new dap(getString(1), ""));
    }

    public dac mo630c() {
        return null;
    }

    public void mo628a(czo czo) {
    }

    public int mo632e() {
        return 0;
    }

    public int mo631d() {
        return 2;
    }

    public boolean mo633f() {
        return true;
    }
}
