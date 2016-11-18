package p000;

import java.io.Serializable;

public final class eze implements Serializable {
    private static final long serialVersionUID = 1;
    public final String f12528a;
    public final int f12529b;
    public final String f12530c;
    public final long f12531d;
    public int f12532e;
    public final long f12533f;

    public eze() {
        this.f12532e = ezf.f12534a;
        this.f12528a = "";
        this.f12529b = 1;
        this.f12530c = "";
        this.f12531d = 0;
        this.f12533f = -1;
    }

    public eze(kmu kmu) {
        this.f12532e = ezf.f12534a;
        this.f12531d = 0;
        ojd ojd = kmu.f22401a;
        this.f12528a = "";
        this.f12529b = 1;
        this.f12530c = "";
        this.f12533f = -1;
    }

    public eze(luq luq) {
        this.f12532e = ezf.f12534a;
        this.f12528a = luq.f26516b;
        this.f12529b = gwb.m1507a(luq.f26515a);
        this.f12530c = luq.f26517c;
        this.f12531d = gwb.m1523a(luq.f26518d);
        if (luq.f26525k == null || luq.f26525k.f26709a == null || luq.f26525k.f26710b == null) {
            this.f12533f = -1;
            return;
        }
        this.f12533f = gwb.m1523a(luq.f26525k.f26710b);
        switch (gwb.m1507a(luq.f26525k.f26709a)) {
            case 0:
                this.f12532e = ezf.f12534a;
                return;
            case 1:
                this.f12532e = ezf.f12535b;
                return;
            case 2:
                this.f12532e = ezf.f12536c;
                return;
            case 3:
                this.f12532e = ezf.f12537d;
                return;
            default:
                String valueOf = String.valueOf(luq.f26525k.f26709a);
                glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 66).append("Unexpected error code for syncHintAnswer in clientResponseHeader: ").append(valueOf).toString(), new Object[0]);
                return;
        }
    }
}
