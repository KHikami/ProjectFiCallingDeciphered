package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class jjr {
    private final Context f20305a;
    private final String f20306b;
    private final long f20307c;
    private final long f20308d;
    private final float f20309e;
    private final float f20310f;
    private final jjt f20311g;
    private File f20312h;
    private String f20313i;
    private long f20314j;

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
        this.f20305a = context;
        this.f20306b = str;
        this.f20307c = j;
        this.f20308d = j2;
        this.f20309e = f;
        this.f20310f = f2;
        this.f20311g = jjt;
    }

    private File m24504d() {
        if (this.f20312h == null) {
            this.f20312h = new File(this.f20305a.getCacheDir(), this.f20306b);
        }
        return this.f20312h;
    }

    private String m24505e() {
        if (this.f20313i == null) {
            this.f20313i = m24504d().getPath();
        }
        return this.f20313i;
    }

    public void m24509a(String str, byte[] bArr) {
        m24508a(str, gwb.m2173e(bArr));
    }

    public void m24508a(String str, ByteBuffer byteBuffer) {
        String str2;
        String str3;
        String valueOf;
        String b = m24511b(str);
        try {
            gwb.m1874a(byteBuffer, b);
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
                gwb.m1874a(byteBuffer, b);
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

    public File m24507a(String str) {
        File file = new File(m24511b(str));
        return file.exists() ? file : null;
    }

    public String m24511b(String str) {
        StringBuilder stringBuilder = new StringBuilder((m24505e().length() + str.length()) + 3);
        stringBuilder.append(m24505e());
        stringBuilder.append(File.separatorChar);
        stringBuilder.append(str.charAt(0));
        stringBuilder.append(File.separatorChar);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public synchronized long m24506a() {
        if (this.f20314j == 0) {
            this.f20314j = m24510b();
        }
        return this.f20314j;
    }

    public long m24510b() {
        long j = this.f20308d;
        long a = this.f20311g.mo3527a();
        if (((float) j) > ((float) a) * this.f20309e) {
            j = (long) (((float) a) * this.f20309e);
        }
        if (j < this.f20307c) {
            j = this.f20307c;
        }
        a = this.f20311g.mo3528b();
        return ((float) j) < ((float) a) * this.f20310f ? j : (long) (((float) (m24512c() + a)) * this.f20310f);
    }

    public long m24512c() {
        return m24504d().exists() ? m24503a(m24504d()) : 0;
    }

    private long m24503a(File file) {
        long j = 0;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += file2.isDirectory() ? m24503a(file2) : file2.length();
            }
        }
        return j;
    }
}
