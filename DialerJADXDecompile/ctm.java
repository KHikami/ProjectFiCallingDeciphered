import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* compiled from: PG */
class ctm {
    private Map a;
    private Map b;

    public ctm() {
        this.a = new hv();
        this.b = new hv();
    }

    public bqy a(csz csz) {
        if (csz instanceof ctk) {
            return ((ctk) csz).a();
        }
        return null;
    }

    public brf a(ctd ctd) {
        if (this.a.containsKey(ctd)) {
            return (brf) this.a.get(ctd);
        }
        brf ctn = new ctn(this, ctd);
        this.a.put(ctd, ctn);
        return ctn;
    }

    public brg a(cte cte) {
        if (this.b.containsKey(cte)) {
            return (brg) this.b.get(cte);
        }
        brg cto = new cto(this, cte);
        this.b.put(cte, cto);
        return cto;
    }

    public fr a(ConnectionResult connectionResult) {
        return new ctl(connectionResult);
    }
}
