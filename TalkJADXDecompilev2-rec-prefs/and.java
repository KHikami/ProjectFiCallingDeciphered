package p000;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class and {
    final String f1397a;
    final long[] f1398b;
    File[] f1399c;
    File[] f1400d;
    boolean f1401e;
    anc f1402f;
    long f1403g;
    final /* synthetic */ amz f1404h;

    and(amz amz, String str) {
        this.f1404h = amz;
        this.f1397a = str;
        this.f1398b = new long[amz.f1378b];
        this.f1399c = new File[amz.f1378b];
        this.f1400d = new File[amz.f1378b];
        StringBuilder append = new StringBuilder(str).append('.');
        int length = append.length();
        for (int i = 0; i < amz.f1378b; i++) {
            append.append(i);
            this.f1399c[i] = new File(amz.f1377a, append.toString());
            append.append(".tmp");
            this.f1400d[i] = new File(amz.f1377a, append.toString());
            append.setLength(length);
        }
    }

    public String m3013a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long append : this.f1398b) {
            stringBuilder.append(' ').append(append);
        }
        return stringBuilder.toString();
    }

    void m3014a(String[] strArr) {
        if (strArr.length != this.f1404h.f1378b) {
            throw and.m3011b(strArr);
        }
        int i = 0;
        while (i < strArr.length) {
            try {
                this.f1398b[i] = Long.parseLong(strArr[i]);
                i++;
            } catch (NumberFormatException e) {
                throw and.m3011b(strArr);
            }
        }
    }

    private static IOException m3011b(String[] strArr) {
        String str = "unexpected journal line: ";
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public File m3012a(int i) {
        return this.f1399c[i];
    }

    public File m3015b(int i) {
        return this.f1400d[i];
    }
}
