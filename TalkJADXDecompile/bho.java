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
    public final String a;
    public final bhm b;
    public final bhb c;
    public final long d;
    public final String e;
    public boolean f;
    final String g;
    public final bht h;
    public long i;
    public final bhp j;

    public bho(String str, String str2, bhm bhm, long j, bht bht, String str3, bhp bhp) {
        ba.a(j >= 0);
        this.a = str;
        this.b = (bhm) ba.a((Object) bhm);
        this.c = new bhb(str2);
        this.d = glj.b() + j;
        this.g = Log.getStackTraceString(new Throwable());
        this.h = bht;
        this.e = str3;
        this.i = -1;
        this.j = bhp;
    }

    public static long a(bhr bhr, long j) {
        long j2 = 0;
        long f = bhr == null ? 0 : bhr.f();
        if (f != -1) {
            j2 = 0 + f;
        }
        return j2 + j;
    }

    public String a() {
        int lastIndexOf = this.a.lastIndexOf(46) + 1;
        if (lastIndexOf >= this.a.length()) {
            lastIndexOf = 0;
        }
        String valueOf = String.valueOf(this.a.substring(lastIndexOf));
        String valueOf2 = String.valueOf(this.c);
        return new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
    }

    public static byte[] a(bho bho) {
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

    public static bho a(byte[] bArr) {
        Throwable th;
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream;
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

    public boolean a(Context context) {
        if (this.b instanceof bhe) {
            return gwb.a(context, "babel_enable_concurrent_task_logging", false);
        }
        return false;
    }
}
