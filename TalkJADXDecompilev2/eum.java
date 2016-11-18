package defpackage;

import android.text.TextUtils;
import java.util.List;

public class eum extends euu {
    private static final long serialVersionUID = 1;
    public final List<fbw> c;
    public final long d;

    public eum(String str, String str2, List<fbw> list, long j) {
        super(str2, str);
        this.c = list;
        this.d = j;
    }

    public nzf a(String str, int i, int i2) {
        lqm lqm = new lqm();
        lqm.b = blo.c(this.k);
        lqm.a = euk.a(this.e);
        lqm.e = Integer.valueOf(4);
        nzf lno = new lno();
        lno.a = lqm;
        if (this.c.size() > 0) {
            lsh[] lshArr = new lsh[this.c.size()];
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                boolean z;
                fbw fbw = (fbw) this.c.get(i3);
                if (fbw.c == null && TextUtils.isEmpty(fbw.e)) {
                    z = false;
                } else {
                    z = true;
                }
                iil.a("Expected condition to be true", z);
                lshArr[i3] = fbw.c(gwb.H());
            }
            lno.b = lshArr;
        }
        lno.requestHeader = euk.a(str, i, i2, this.i);
        return lno;
    }

    public String g() {
        return "conversations/adduser";
    }
}
