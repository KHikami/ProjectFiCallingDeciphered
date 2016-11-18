package p000;

import android.text.TextUtils;
import java.util.List;

public class eum extends euu {
    private static final long serialVersionUID = 1;
    public final List<fbw> f12301c;
    public final long f12302d;

    public eum(String str, String str2, List<fbw> list, long j) {
        super(str2, str);
        this.f12301c = list;
        this.f12302d = j;
    }

    public nzf mo1944a(String str, int i, int i2) {
        lqm lqm = new lqm();
        lqm.f26145b = blo.m5887c(this.k);
        lqm.f26144a = euk.m14555a(this.e);
        lqm.f26148e = Integer.valueOf(4);
        nzf lno = new lno();
        lno.f25793a = lqm;
        if (this.f12301c.size() > 0) {
            lsh[] lshArr = new lsh[this.f12301c.size()];
            for (int i3 = 0; i3 < this.f12301c.size(); i3++) {
                boolean z;
                fbw fbw = (fbw) this.f12301c.get(i3);
                if (fbw.f12668c == null && TextUtils.isEmpty(fbw.f12670e)) {
                    z = false;
                } else {
                    z = true;
                }
                iil.m21874a("Expected condition to be true", z);
                lshArr[i3] = fbw.m14937c(gwb.m1400H());
            }
            lno.f25794b = lshArr;
        }
        lno.requestHeader = euk.m14556a(str, i, i2, this.i);
        return lno;
    }

    public String mo1947g() {
        return "conversations/adduser";
    }
}
