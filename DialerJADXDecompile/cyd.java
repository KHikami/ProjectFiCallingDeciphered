import java.util.Arrays;

/* compiled from: PG */
class cyd extends cxn {
    private final String a;
    private final char[] b;
    private final char[] c;

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    cyd(String str, char[] cArr, char[] cArr2) {
        boolean z;
        this.a = str;
        this.b = cArr;
        this.c = cArr2;
        if (cArr.length == cArr2.length) {
            z = true;
        } else {
            z = false;
        }
        cob.a(z);
        for (int i = 0; i < cArr.length; i++) {
            boolean z2;
            if (cArr[i] <= cArr2[i]) {
                z2 = true;
            } else {
                z2 = false;
            }
            cob.a(z2);
            if (i + 1 < cArr.length) {
                if (cArr2[i] < cArr[i + 1]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cob.a(z2);
            }
        }
    }

    public final boolean b(char c) {
        int binarySearch = Arrays.binarySearch(this.b, c);
        if (binarySearch >= 0) {
            return true;
        }
        binarySearch = (binarySearch ^ -1) - 1;
        if (binarySearch < 0 || c > this.c[binarySearch]) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.a;
    }
}
