import java.io.Serializable;

public final class eze implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public int e;
    public final long f;

    public eze() {
        this.e = ezf.a;
        this.a = "";
        this.b = 1;
        this.c = "";
        this.d = 0;
        this.f = -1;
    }

    public eze(kmu kmu) {
        this.e = ezf.a;
        this.d = 0;
        ojd ojd = kmu.a;
        this.a = "";
        this.b = 1;
        this.c = "";
        this.f = -1;
    }

    public eze(luq luq) {
        this.e = ezf.a;
        this.a = luq.b;
        this.b = gwb.a(luq.a);
        this.c = luq.c;
        this.d = gwb.a(luq.d);
        if (luq.k == null || luq.k.a == null || luq.k.b == null) {
            this.f = -1;
            return;
        }
        this.f = gwb.a(luq.k.b);
        switch (gwb.a(luq.k.a)) {
            case wi.w /*0*/:
                this.e = ezf.a;
            case wi.j /*1*/:
                this.e = ezf.b;
            case wi.l /*2*/:
                this.e = ezf.c;
            case wi.z /*3*/:
                this.e = ezf.d;
            default:
                String valueOf = String.valueOf(luq.k.a);
                glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 66).append("Unexpected error code for syncHintAnswer in clientResponseHeader: ").append(valueOf).toString(), new Object[0]);
        }
    }
}
