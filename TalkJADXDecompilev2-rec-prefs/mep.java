package p000;

import java.util.Arrays;

class mep extends mdz {
    private final String f27570o;
    private final char[] f27571p;
    private final char[] f27572q;

    @Deprecated
    public /* bridge */ /* synthetic */ boolean mo3735a(Object obj) {
        return super.m31929a((Character) obj);
    }

    mep(String str, char[] cArr, char[] cArr2) {
        boolean z;
        this.f27570o = str;
        this.f27571p = cArr;
        this.f27572q = cArr2;
        if (cArr.length == cArr2.length) {
            z = true;
        } else {
            z = false;
        }
        bm.m6137a(z);
        for (int i = 0; i < cArr.length; i++) {
            boolean z2;
            if (cArr[i] <= cArr2[i]) {
                z2 = true;
            } else {
                z2 = false;
            }
            bm.m6137a(z2);
            if (i + 1 < cArr.length) {
                if (cArr2[i] < cArr[i + 1]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bm.m6137a(z2);
            }
        }
    }

    public boolean mo3738b(char c) {
        int binarySearch = Arrays.binarySearch(this.f27571p, c);
        if (binarySearch >= 0) {
            return true;
        }
        binarySearch = (binarySearch ^ -1) - 1;
        if (binarySearch < 0 || c > this.f27572q[binarySearch]) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f27570o;
    }
}
