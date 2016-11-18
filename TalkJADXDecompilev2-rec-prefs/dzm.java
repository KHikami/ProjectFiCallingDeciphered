package p000;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class dzm {
    final String f10920a;
    final long[] f10921b;
    boolean f10922c;
    dzk f10923d;
    long f10924e;
    final /* synthetic */ dzi f10925f;

    dzm(dzi dzi, String str) {
        this.f10925f = dzi;
        this.f10920a = str;
        this.f10921b = new long[dzi.f10903b];
    }

    public String m13174a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long append : this.f10921b) {
            stringBuilder.append(' ').append(append);
        }
        return stringBuilder.toString();
    }

    void m13175a(String[] strArr) {
        if (strArr.length != this.f10925f.f10903b) {
            throw dzm.m13172b(strArr);
        }
        int i = 0;
        while (i < strArr.length) {
            try {
                this.f10921b[i] = Long.parseLong(strArr[i]);
                i++;
            } catch (NumberFormatException e) {
                throw dzm.m13172b(strArr);
            }
        }
    }

    private static IOException m13172b(String[] strArr) {
        String str = "unexpected journal line: ";
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public File m13173a(int i) {
        File file = this.f10925f.f10902a;
        String str = this.f10920a;
        return new File(file, new StringBuilder(String.valueOf(str).length() + 12).append(str).append(".").append(i).toString());
    }

    public File m13176b(int i) {
        File file = this.f10925f.f10902a;
        String str = this.f10920a;
        return new File(file, new StringBuilder(String.valueOf(str).length() + 16).append(str).append(".").append(i).append(".tmp").toString());
    }
}
