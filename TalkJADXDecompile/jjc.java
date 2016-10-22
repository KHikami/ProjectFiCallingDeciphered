import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class jjc {
    private static final byte[] a;
    private static final byte[] b;
    private static final byte[] c;
    private final jjn[] d;
    private byte[] e;
    private ArrayList<byte[]> f;
    private final ByteOrder g;
    private byte[] h;

    static {
        a = new byte[]{(byte) 65, (byte) 83, (byte) 67, (byte) 73, (byte) 73, (byte) 0, (byte) 0, (byte) 0};
        b = new byte[]{(byte) 74, (byte) 73, (byte) 83, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        c = new byte[]{(byte) 85, (byte) 78, (byte) 73, (byte) 67, (byte) 79, (byte) 68, (byte) 69, (byte) 0};
    }

    jjc(ByteOrder byteOrder) {
        this.d = new jjn[5];
        this.f = new ArrayList();
        this.g = byteOrder;
    }

    byte[] a() {
        return this.h;
    }

    void a(byte[] bArr) {
        this.h = bArr;
    }

    boolean b() {
        return this.h != null;
    }

    protected byte[] c() {
        return this.e;
    }

    protected void b(byte[] bArr) {
        this.e = bArr;
    }

    protected boolean d() {
        return this.e != null;
    }

    protected void a(int i, byte[] bArr) {
        if (i < this.f.size()) {
            this.f.set(i, bArr);
            return;
        }
        for (int size = this.f.size(); size < i; size++) {
            this.f.add(null);
        }
        this.f.add(bArr);
    }

    protected int e() {
        return this.f.size();
    }

    protected byte[] a(int i) {
        return (byte[]) this.f.get(i);
    }

    protected boolean f() {
        return !this.f.isEmpty();
    }

    protected ByteOrder g() {
        return this.g;
    }

    protected jjn b(int i) {
        if (jjm.a(i)) {
            return this.d[i];
        }
        return null;
    }

    protected void a(jjn jjn) {
        this.d[jjn.b()] = jjn;
    }

    private jjn c(int i) {
        jjn jjn = this.d[i];
        if (jjn != null) {
            return jjn;
        }
        jjn = new jjn(i);
        this.d[i] = jjn;
        return jjn;
    }

    protected jjm a(short s, int i) {
        jjn jjn = this.d[i];
        return jjn == null ? null : jjn.a(s);
    }

    protected jjm a(jjm jjm) {
        if (jjm != null) {
            return a(jjm, jjm.a());
        }
        return null;
    }

    private jjm a(jjm jjm, int i) {
        if (jjm == null || !jjm.a(i)) {
            return null;
        }
        return c(i).a(jjm);
    }

    protected void b(short s, int i) {
        jjn jjn = this.d[i];
        if (jjn != null) {
            jjn.b(s);
        }
    }

    protected List<jjm> h() {
        List<jjm> arrayList = new ArrayList();
        for (jjn jjn : this.d) {
            if (jjn != null) {
                jjm[] a = jjn.a();
                if (a != null) {
                    Collections.addAll(arrayList, a);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jjc)) {
            return false;
        }
        jjc jjc = (jjc) obj;
        if (jjc.g != this.g || jjc.f.size() != this.f.size() || !Arrays.equals(jjc.e, this.e)) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (!Arrays.equals((byte[]) jjc.f.get(i), (byte[]) this.f.get(i))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            jjn b = jjc.b(i2);
            jjn b2 = b(i2);
            if (b != b2 && b != null && !b.equals(b2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.g.hashCode() + 527) * 31) + this.f.hashCode()) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.d);
    }
}
