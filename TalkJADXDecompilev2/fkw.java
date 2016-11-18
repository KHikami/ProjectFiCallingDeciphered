package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

public final class fkw extends fhb {
    private final ArrayList<String> a;

    public fkw(bko bko, ArrayList<String> arrayList) {
        super(bko);
        this.a = arrayList;
    }

    public void w_() {
        long a = giw.a();
        Object e = ffh.a().e();
        if (TextUtils.isEmpty(e)) {
            glk.d("Babel", "Unregister removed account with invalid gcm registration id", new Object[0]);
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a(fnm.a(e, a, gwb.H().getPackageName(), (String) obj));
        }
    }
}
