package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: dzm */
final class dzm {
    final String a;
    final long[] b;
    boolean c;
    dzk d;
    long e;
    final /* synthetic */ dzi f;

    dzm(dzi dzi, String str) {
        this.f = dzi;
        this.a = str;
        this.b = new long[dzi.b];
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long append : this.b) {
            stringBuilder.append(' ').append(append);
        }
        return stringBuilder.toString();
    }

    void a(String[] strArr) {
        if (strArr.length != this.f.b) {
            throw dzm.b(strArr);
        }
        int i = 0;
        while (i < strArr.length) {
            try {
                this.b[i] = Long.parseLong(strArr[i]);
                i++;
            } catch (NumberFormatException e) {
                throw dzm.b(strArr);
            }
        }
    }

    private static IOException b(String[] strArr) {
        String str = "unexpected journal line: ";
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public File a(int i) {
        File file = this.f.a;
        String str = this.a;
        return new File(file, new StringBuilder(String.valueOf(str).length() + 12).append(str).append(".").append(i).toString());
    }

    public File b(int i) {
        File file = this.f.a;
        String str = this.a;
        return new File(file, new StringBuilder(String.valueOf(str).length() + 16).append(str).append(".").append(i).append(".tmp").toString());
    }
}
