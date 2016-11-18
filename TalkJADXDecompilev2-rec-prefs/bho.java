package p000;

import android.content.Context;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public final class bho implements Serializable {
    public final String f3353a;
    public final bhm f3354b;
    public final bhb f3355c;
    public final long f3356d;
    public final String f3357e;
    public boolean f3358f;
    final String f3359g;
    public final bht f3360h;
    public long f3361i;
    public final bhp f3362j;

    public bho(String str, String str2, bhm bhm, long j, bht bht, String str3, bhp bhp) {
        ba.m4577a(j >= 0);
        this.f3353a = str;
        this.f3354b = (bhm) ba.m4536a((Object) bhm);
        this.f3355c = new bhb(str2);
        this.f3356d = glj.m17963b() + j;
        this.f3359g = Log.getStackTraceString(new Throwable());
        this.f3360h = bht;
        this.f3357e = str3;
        this.f3361i = -1;
        this.f3362j = bhp;
    }

    public static long m5255a(bhr bhr, long j) {
        long j2 = 0;
        long f = bhr == null ? 0 : bhr.m5266f();
        if (f != -1) {
            j2 = 0 + f;
        }
        return j2 + j;
    }

    public String m5258a() {
        int lastIndexOf = this.f3353a.lastIndexOf(46) + 1;
        if (lastIndexOf >= this.f3353a.length()) {
            lastIndexOf = 0;
        }
        String valueOf = String.valueOf(this.f3353a.substring(lastIndexOf));
        String valueOf2 = String.valueOf(this.f3355c);
        return new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
    }

    public static byte[] m5257a(bho bho) {
        Throwable th;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(bho);
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    objectOutputStream.close();
                } catch (IOException e) {
                }
                return toByteArray;
            } catch (Throwable th2) {
                th = th2;
                try {
                    byteArrayOutputStream.close();
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                } catch (IOException e2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            byteArrayOutputStream.close();
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            throw th;
        }
    }

    public static bho m5256a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable th;
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                bho bho = (bho) objectInputStream.readObject();
                try {
                    byteArrayInputStream.close();
                    objectInputStream.close();
                } catch (IOException e) {
                }
                return bho;
            } catch (Throwable th2) {
                th = th2;
                try {
                    byteArrayInputStream.close();
                    objectInputStream.close();
                } catch (IOException e2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            objectInputStream = null;
            byteArrayInputStream.close();
            objectInputStream.close();
            throw th;
        }
    }

    public boolean m5259a(Context context) {
        if (this.f3354b instanceof bhe) {
            return gwb.m1906a(context, "babel_enable_concurrent_task_logging", false);
        }
        return false;
    }
}
