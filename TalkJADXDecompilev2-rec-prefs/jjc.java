package p000;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class jjc {
    private static final byte[] f20230a = new byte[]{(byte) 65, (byte) 83, (byte) 67, (byte) 73, (byte) 73, (byte) 0, (byte) 0, (byte) 0};
    private static final byte[] f20231b = new byte[]{(byte) 74, (byte) 73, (byte) 83, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private static final byte[] f20232c = new byte[]{(byte) 85, (byte) 78, (byte) 73, (byte) 67, (byte) 79, (byte) 68, (byte) 69, (byte) 0};
    private final jjn[] f20233d = new jjn[5];
    private byte[] f20234e;
    private ArrayList<byte[]> f20235f = new ArrayList();
    private final ByteOrder f20236g;
    private byte[] f20237h;

    jjc(ByteOrder byteOrder) {
        this.f20236g = byteOrder;
    }

    byte[] m24393a() {
        return this.f20237h;
    }

    void m24392a(byte[] bArr) {
        this.f20237h = bArr;
    }

    boolean m24398b() {
        return this.f20237h != null;
    }

    protected byte[] m24399c() {
        return this.f20234e;
    }

    protected void m24397b(byte[] bArr) {
        this.f20234e = bArr;
    }

    protected boolean m24400d() {
        return this.f20234e != null;
    }

    protected void m24390a(int i, byte[] bArr) {
        if (i < this.f20235f.size()) {
            this.f20235f.set(i, bArr);
            return;
        }
        for (int size = this.f20235f.size(); size < i; size++) {
            this.f20235f.add(null);
        }
        this.f20235f.add(bArr);
    }

    protected int m24401e() {
        return this.f20235f.size();
    }

    protected byte[] m24394a(int i) {
        return (byte[]) this.f20235f.get(i);
    }

    protected boolean m24402f() {
        return !this.f20235f.isEmpty();
    }

    protected ByteOrder m24403g() {
        return this.f20236g;
    }

    protected jjn m24395b(int i) {
        if (jjm.m24453a(i)) {
            return this.f20233d[i];
        }
        return null;
    }

    protected void m24391a(jjn jjn) {
        this.f20233d[jjn.m24492b()] = jjn;
    }

    private jjn m24387c(int i) {
        jjn jjn = this.f20233d[i];
        if (jjn != null) {
            return jjn;
        }
        jjn = new jjn(i);
        this.f20233d[i] = jjn;
        return jjn;
    }

    protected jjm m24389a(short s, int i) {
        jjn jjn = this.f20233d[i];
        return jjn == null ? null : jjn.m24489a(s);
    }

    protected jjm m24388a(jjm jjm) {
        if (jjm != null) {
            return m24386a(jjm, jjm.m24463a());
        }
        return null;
    }

    private jjm m24386a(jjm jjm, int i) {
        if (jjm == null || !jjm.m24453a(i)) {
            return null;
        }
        return m24387c(i).m24488a(jjm);
    }

    protected void m24396b(short s, int i) {
        jjn jjn = this.f20233d[i];
        if (jjn != null) {
            jjn.m24493b(s);
        }
    }

    protected List<jjm> m24404h() {
        List<jjm> arrayList = new ArrayList();
        for (jjn jjn : this.f20233d) {
            if (jjn != null) {
                jjm[] a = jjn.m24491a();
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
        if (jjc.f20236g != this.f20236g || jjc.f20235f.size() != this.f20235f.size() || !Arrays.equals(jjc.f20234e, this.f20234e)) {
            return false;
        }
        for (int i = 0; i < this.f20235f.size(); i++) {
            if (!Arrays.equals((byte[]) jjc.f20235f.get(i), (byte[]) this.f20235f.get(i))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            jjn b = jjc.m24395b(i2);
            jjn b2 = m24395b(i2);
            if (b != b2 && b != null && !b.equals(b2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f20236g.hashCode() + 527) * 31) + this.f20235f.hashCode()) * 31) + Arrays.hashCode(this.f20234e)) * 31) + Arrays.hashCode(this.f20233d);
    }
}
