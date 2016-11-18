package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class jjr {
    private final Context a;
    private final String b;
    private final long c;
    private final long d;
    private final float e;
    private final float f;
    private final jjt g;
    private File h;
    private String i;
    private long j;

    public jjr(Context context, String str, long j, long j2, float f, float f2) {
        jjt jju;
        if (VERSION.SDK_INT < 18) {
            jju = new jju();
        } else {
            jju = new jjs();
        }
        this(context, str, j, j2, f, f2, jju);
    }

    private jjr(Context context, String str, long j, long j2, float f, float f2, jjt jjt) {
        this.a = context;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = f2;
        this.g = jjt;
    }

    private File d() {
        if (this.h == null) {
            this.h = new File(this.a.getCacheDir(), this.b);
        }
        return this.h;
    }

    private String e() {
        if (this.i == null) {
            this.i = d().getPath();
        }
        return this.i;
    }

    public void a(String str, byte[] bArr) {
        a(str, gwb.e(bArr));
    }

    public void a(String str, ByteBuffer byteBuffer) {
        String str2;
        String str3;
        String valueOf;
        String b = b(str);
        try {
            gwb.a(byteBuffer, b);
        } catch (Throwable e) {
            File parentFile = new File(b).getParentFile();
            if (parentFile.exists()) {
                str2 = "FileCache";
                str3 = "Cannot write file to cache: ";
                valueOf = String.valueOf(b);
                Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
            } else {
                try {
                    parentFile.mkdirs();
                } catch (Throwable e2) {
                    valueOf = String.valueOf(parentFile);
                    Log.e("FileCache", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Cannot create cache directory: ").append(valueOf).toString(), e2);
                    throw new RuntimeException("Cannot create cache directory", e2);
                }
            }
            try {
                gwb.a(byteBuffer, b);
            } catch (IOException e3) {
                str2 = "FileCache";
                str3 = "Cannot write file to cache: ";
                valueOf = String.valueOf(b);
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                Log.e(str2, valueOf, e);
            }
        } catch (Throwable e4) {
            str2 = "FileCache";
            str3 = "Cannot write file to cache: ";
            valueOf = String.valueOf(b);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e4);
        }
    }

    public File a(String str) {
        File file = new File(b(str));
        return file.exists() ? file : null;
    }

    public String b(String str) {
        StringBuilder stringBuilder = new StringBuilder((e().length() + str.length()) + 3);
        stringBuilder.append(e());
        stringBuilder.append(File.separatorChar);
        stringBuilder.append(str.charAt(0));
        stringBuilder.append(File.separatorChar);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public synchronized long a() {
        if (this.j == 0) {
            this.j = b();
        }
        return this.j;
    }

    public long b() {
        long j = this.d;
        long a = this.g.a();
        if (((float) j) > ((float) a) * this.e) {
            j = (long) (((float) a) * this.e);
        }
        if (j < this.c) {
            j = this.c;
        }
        a = this.g.b();
        return ((float) j) < ((float) a) * this.f ? j : (long) (((float) (c() + a)) * this.f);
    }

    public long c() {
        return d().exists() ? a(d()) : 0;
    }

    private long a(File file) {
        long j = 0;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += file2.isDirectory() ? a(file2) : file2.length();
            }
        }
        return j;
    }
}
