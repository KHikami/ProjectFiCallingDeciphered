package p000;

import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

final class cfa implements cgh {
    final /* synthetic */ cdr f5160a;

    cfa(cdr cdr) {
        this.f5160a = cdr;
    }

    public void mo893a(String str, cgc cgc) {
        if (!TextUtils.equals(this.f5160a.aJ, str) && !blo.m5871a(str)) {
            this.f5160a.ak.mo550a(new fkj(this.f5160a.av.m5638g(), cgc.f5231a, true, gwb.m1492a(this.f5160a.context, "babel_focustimeoutsecs", (int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES)));
            if (this.f5160a.av != null) {
                this.f5160a.bC.mo1030a(this.f5160a.av.m5638g(), cgc.f5231a, false);
            }
            if (cgc.f5232b == 1) {
                this.f5160a.aJ = str;
            }
        }
    }
}
