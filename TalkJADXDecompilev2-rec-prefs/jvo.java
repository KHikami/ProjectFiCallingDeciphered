package p000;

import android.content.Context;
import com.google.api.client.http.HttpMethods;

public class jvo<RQ extends nzf, RS extends nzf> extends jvn<RS> {
    private boolean f5784a;
    public final RQ f5785t;

    public jvo(Context context, jvc jvc, String str, RQ rq, RS rs, String str2, String str3) {
        super(context, jvc, HttpMethods.POST, str, rs, str2, str3);
        this.f5785t = rq;
    }

    public void mo1041b(RQ rq) {
    }

    private void mo1043d() {
        if (!this.f5784a) {
            mo1041b(this.f5785t);
            this.f5784a = true;
        }
    }

    public byte[] mo1038c() {
        mo1043d();
        return nzf.m1029a(this.f5785t);
    }

    public String mo1039m() {
        mo1043d();
        return gwb.m1675a(this.f5785t);
    }
}
