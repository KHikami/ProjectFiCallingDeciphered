import android.content.Context;
import com.google.api.client.http.HttpMethods;

public class jvo<RQ extends nzf, RS extends nzf> extends jvn<RS> {
    private boolean a;
    public final RQ t;

    public jvo(Context context, jvc jvc, String str, RQ rq, RS rs, String str2, String str3) {
        super(context, jvc, HttpMethods.POST, str, rs, str2, str3);
        this.t = rq;
    }

    public void b(RQ rq) {
    }

    private void d() {
        if (!this.a) {
            b(this.t);
            this.a = true;
        }
    }

    public byte[] c() {
        d();
        return nzf.a(this.t);
    }

    public String m() {
        d();
        return gwb.a(this.t);
    }
}
