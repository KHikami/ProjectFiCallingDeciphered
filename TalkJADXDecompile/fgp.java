import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class fgp implements fok {
    private static final long serialVersionUID = 1;
    private int a;
    private String b;
    private int c;
    private int d;
    private int[] e;
    private List<String> f;

    public fgp(int i, int i2, Integer num, Collection<String> collection) {
        this.a = 0;
        this.f = new ArrayList();
        this.c = i;
        this.d = i2;
        if (num == null) {
            this.e = new int[0];
        } else {
            this.e = new int[1];
            this.e[0] = gwb.a(num);
        }
        this.f.addAll(collection);
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int[] e() {
        return this.e;
    }

    public List<String> f() {
        return Collections.unmodifiableList(this.f);
    }

    public void d_(String str) {
        this.b = str;
    }

    public int L_() {
        return this.a;
    }

    public void b(int i) {
        this.a = i;
    }

    public ead a() {
        return new fgo(this);
    }

    public boolean a(int i) {
        return false;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.d;
        String valueOf = String.valueOf(Arrays.toString(this.e));
        String valueOf2 = String.valueOf(this.f);
        return new StringBuilder((String.valueOf(valueOf).length() + 118) + String.valueOf(valueOf2).length()).append("OzMergedPersonLookupRequest{requestId=").append(i).append(", lookupType=").append(i2).append(", matchType=").append(i3).append(", requestTypes=").append(valueOf).append(", ids=").append(valueOf2).append("}").toString();
    }
}
