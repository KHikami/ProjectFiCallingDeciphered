package defpackage;

import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

final class cfa implements cgh {
    final /* synthetic */ cdr a;

    cfa(cdr cdr) {
        this.a = cdr;
    }

    public void a(String str, cgc cgc) {
        if (!TextUtils.equals(this.a.aJ, str) && !blo.a(str)) {
            this.a.ak.a(new fkj(this.a.av.g(), cgc.a, true, gwb.a(this.a.context, "babel_focustimeoutsecs", (int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES)));
            if (this.a.av != null) {
                this.a.bC.a(this.a.av.g(), cgc.a, false);
            }
            if (cgc.b == 1) {
                this.a.aJ = str;
            }
        }
    }
}
