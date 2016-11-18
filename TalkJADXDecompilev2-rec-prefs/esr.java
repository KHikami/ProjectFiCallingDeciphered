package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class esr implements Serializable {
    private static final long serialVersionUID = 1;
    public final edo f12187a;
    public final String f12188b;
    public final String f12189c;
    public final int f12190d;

    private esr(lot lot) {
        String str = null;
        this.f12187a = gwb.m1604a(gwb.m1400H(), lot.f25934a, null);
        this.f12189c = lot.f25935b;
        if (lot.f25938e != null) {
            str = lot.f25938e.f28411a;
        }
        this.f12188b = str;
        this.f12190d = gwb.m1507a(lot.f25936c);
    }

    public static List<esr> m14385a(lot[] lotArr) {
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
        boolean equals = this.f12187a == null ? esr.f12187a == null : this.f12187a.equals(esr.f12187a);
        boolean equals2 = this.f12188b == null ? esr.f12188b == null : this.f12188b.equals(esr.f12188b);
        boolean equals3;
        if (this.f12189c != null) {
            equals3 = this.f12189c.equals(esr.f12189c);
        } else if (esr.f12189c == null) {
            equals3 = true;
        } else {
            equals3 = false;
        }
        boolean z;
        if (this.f12190d == esr.f12190d) {
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
