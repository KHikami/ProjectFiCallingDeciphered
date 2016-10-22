import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class esr implements Serializable {
    private static final long serialVersionUID = 1;
    public final edo a;
    public final String b;
    public final String c;
    public final int d;

    private esr(lot lot) {
        String str = null;
        this.a = gwb.a(gwb.H(), lot.a, null);
        this.c = lot.b;
        if (lot.e != null) {
            str = lot.e.a;
        }
        this.b = str;
        this.d = gwb.a(lot.c);
    }

    public static List<esr> a(lot[] lotArr) {
        List<esr> arrayList = new ArrayList();
        for (lot esr : lotArr) {
            arrayList.add(new esr(esr));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof esr)) {
            return false;
        }
        esr esr = (esr) obj;
        boolean equals = this.a == null ? esr.a == null : this.a.equals(esr.a);
        boolean equals2 = this.b == null ? esr.b == null : this.b.equals(esr.b);
        boolean equals3;
        if (this.c != null) {
            equals3 = this.c.equals(esr.c);
        } else if (esr.c == null) {
            equals3 = true;
        } else {
            equals3 = false;
        }
        boolean z;
        if (this.d == esr.d) {
            z = true;
        } else {
            z = false;
        }
        if (equals && r3 && r4 && r5) {
            return true;
        }
        return false;
    }
}
