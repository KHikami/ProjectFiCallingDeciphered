package defpackage;

import java.util.Arrays;

/* renamed from: mep */
class mep extends mdz {
    private final String o;
    private final char[] p;
    private final char[] q;

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    mep(String str, char[] cArr, char[] cArr2) {
        boolean z;
        this.o = str;
        this.p = cArr;
        this.q = cArr2;
        if (cArr.length == cArr2.length) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z);
        for (int i = 0; i < cArr.length; i++) {
            boolean z2;
            if (cArr[i] <= cArr2[i]) {
                z2 = true;
            } else {
                z2 = false;
            }
            bm.a(z2);
            if (i + 1 < cArr.length) {
                if (cArr2[i] < cArr[i + 1]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bm.a(z2);
            }
        }
    }

    public boolean b(char c) {
        int binarySearch = Arrays.binarySearch(this.p, c);
        if (binarySearch >= 0) {
            return true;
        }
        binarySearch = (binarySearch ^ -1) - 1;
        if (binarySearch < 0 || c > this.q[binarySearch]) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.o;
    }
}
