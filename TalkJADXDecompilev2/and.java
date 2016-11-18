package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class and {
    final String a;
    final long[] b;
    File[] c;
    File[] d;
    boolean e;
    anc f;
    long g;
    final /* synthetic */ amz h;

    and(amz amz, String str) {
        this.h = amz;
        this.a = str;
        this.b = new long[amz.b];
        this.c = new File[amz.b];
        this.d = new File[amz.b];
        StringBuilder append = new StringBuilder(str).append('.');
        int length = append.length();
        for (int i = 0; i < amz.b; i++) {
            append.append(i);
            this.c[i] = new File(amz.a, append.toString());
            append.append(".tmp");
            this.d[i] = new File(amz.a, append.toString());
            append.setLength(length);
        }
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long append : this.b) {
            stringBuilder.append(' ').append(append);
        }
        return stringBuilder.toString();
    }

    void a(String[] strArr) {
        if (strArr.length != this.h.b) {
            throw and.b(strArr);
        }
        int i = 0;
        while (i < strArr.length) {
            try {
                this.b[i] = Long.parseLong(strArr[i]);
                i++;
            } catch (NumberFormatException e) {
                throw and.b(strArr);
            }
        }
    }

    private static IOException b(String[] strArr) {
        String str = "unexpected journal line: ";
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public File a(int i) {
        return this.c[i];
    }

    public File b(int i) {
        return this.d[i];
    }
}
