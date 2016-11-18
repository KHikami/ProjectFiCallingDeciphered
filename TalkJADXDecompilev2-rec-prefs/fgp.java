package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class fgp implements fok {
    private static final long serialVersionUID = 1;
    private int f13010a = 0;
    private String f13011b;
    private int f13012c;
    private int f13013d;
    private int[] f13014e;
    private List<String> f13015f = new ArrayList();

    public fgp(int i, int i2, Integer num, Collection<String> collection) {
        this.f13012c = i;
        this.f13013d = i2;
        if (num == null) {
            this.f13014e = new int[0];
        } else {
            this.f13014e = new int[1];
            this.f13014e[0] = gwb.m1507a(num);
        }
        this.f13015f.addAll(collection);
    }

    public int m15265c() {
        return this.f13012c;
    }

    public int m15266d() {
        return this.f13013d;
    }

    public int[] m15267e() {
        return this.f13014e;
    }

    public List<String> m15268f() {
        return Collections.unmodifiableList(this.f13015f);
    }

    public void d_(String str) {
        this.f13011b = str;
    }

    public int L_() {
        return this.f13010a;
    }

    public void mo1023b(int i) {
        this.f13010a = i;
    }

    public ead mo1021a() {
        return new fgo(this);
    }

    public boolean mo1022a(int i) {
        return false;
    }

    public String toString() {
        int i = this.f13010a;
        int i2 = this.f13012c;
        int i3 = this.f13013d;
        String valueOf = String.valueOf(Arrays.toString(this.f13014e));
        String valueOf2 = String.valueOf(this.f13015f);
        return new StringBuilder((String.valueOf(valueOf).length() + 118) + String.valueOf(valueOf2).length()).append("OzMergedPersonLookupRequest{requestId=").append(i).append(", lookupType=").append(i2).append(", matchType=").append(i3).append(", requestTypes=").append(valueOf).append(", ids=").append(valueOf2).append("}").toString();
    }
}
