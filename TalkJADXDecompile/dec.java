import android.content.Context;
import android.database.MatrixCursor;

public final class dec extends MatrixCursor implements dab {
    private static final String[] a;
    private boolean b;

    static {
        a = new String[]{"DisplayName", "PhoneNumber"};
    }

    public dec() {
        super(a);
        this.b = false;
    }

    public void a(String str, Context context) {
        if (this.b) {
            glk.e("Babel", "InputCallContactCursor.setPhone() was called more than once!", new Object[0]);
            return;
        }
        String i = glq.i(gwb.H(), str);
        Object[] objArr = new Object[2];
        objArr[0] = context.getResources().getString(bc.L, new Object[]{i});
        objArr[1] = str;
        addRow(objArr);
        this.b = true;
    }

    public hwk a() {
        return null;
    }

    public dak b() {
        return new dak(new dap(getString(1), ""));
    }

    public dac c() {
        return null;
    }

    public void a(czo czo) {
    }

    public int e() {
        return 0;
    }

    public int d() {
        return 2;
    }

    public boolean f() {
        return true;
    }
}
