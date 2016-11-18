package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class amc {
    public static final Comparator<byte[]> f1276a = new amd();
    private List<byte[]> f1277b = new LinkedList();
    private List<byte[]> f1278c = new ArrayList(64);
    private int f1279d = 0;
    private final int f1280e;

    public amc(int i) {
        this.f1280e = i;
    }

    public synchronized byte[] m2894a(int i) {
        byte[] bArr;
        for (int i2 = 0; i2 < this.f1278c.size(); i2++) {
            bArr = (byte[]) this.f1278c.get(i2);
            if (bArr.length >= i) {
                this.f1279d -= bArr.length;
                this.f1278c.remove(i2);
                this.f1277b.remove(bArr);
                break;
            }
        }
        bArr = new byte[i];
        return bArr;
    }

    public synchronized void m2893a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f1280e) {
                this.f1277b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f1278c, bArr, f1276a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f1278c.add(binarySearch, bArr);
                this.f1279d += bArr.length;
                m2892a();
            }
        }
    }

    private synchronized void m2892a() {
        while (this.f1279d > this.f1280e) {
            byte[] bArr = (byte[]) this.f1277b.remove(0);
            this.f1278c.remove(bArr);
            this.f1279d -= bArr.length;
        }
    }
}
