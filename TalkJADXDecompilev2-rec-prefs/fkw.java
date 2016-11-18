package p000;

import android.text.TextUtils;
import java.util.ArrayList;

public final class fkw extends fhb {
    private final ArrayList<String> f13343a;

    public fkw(bko bko, ArrayList<String> arrayList) {
        super(bko);
        this.f13343a = arrayList;
    }

    public void w_() {
        long a = giw.m17752a();
        Object e = ffh.m15192a().m15204e();
        if (TextUtils.isEmpty(e)) {
            glk.m17981d("Babel", "Unregister removed account with invalid gcm registration id", new Object[0]);
            return;
        }
        ArrayList arrayList = this.f13343a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m8039a(fnm.m15727a(e, a, gwb.m1400H().getPackageName(), (String) obj));
        }
    }
}
