import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

public final class jbk extends SecureRandomSpi {
    private static final File a;
    private static final Object b;
    private static DataInputStream c;
    private static OutputStream d;
    private boolean e;

    static {
        a = new File("/dev/urandom");
        b = new Object();
    }

    protected void engineSetSeed(byte[] bArr) {
        try {
            OutputStream b;
            synchronized (b) {
                b = b();
            }
            b.write(bArr);
            b.flush();
            this.e = true;
        } catch (IOException e) {
            try {
                String valueOf = String.valueOf(a);
                new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to mix seed into ").append(valueOf);
            } finally {
                this.e = true;
            }
        }
    }

    protected void engineNextBytes(byte[] bArr) {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            DataInputStream a;
            if (!this.e) {
                engineSetSeed(jbj.a());
            }
            synchronized (b) {
                a = a();
            }
            synchronized (a) {
                a.readFully(bArr);
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        } catch (Throwable e) {
            try {
                String valueOf = String.valueOf(a);
                throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Failed to read from ").append(valueOf).toString(), e);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
        }
    }

    protected byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    private static DataInputStream a() {
        DataInputStream dataInputStream;
        synchronized (b) {
            if (c == null) {
                try {
                    c = new DataInputStream(new FileInputStream(a));
                } catch (Throwable e) {
                    String valueOf = String.valueOf(a);
                    throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to open ").append(valueOf).append(" for reading").toString(), e);
                }
            }
            dataInputStream = c;
        }
        return dataInputStream;
    }

    private static OutputStream b() {
        OutputStream outputStream;
        synchronized (b) {
            if (d == null) {
                d = new FileOutputStream(a);
            }
            outputStream = d;
        }
        return outputStream;
    }
}
