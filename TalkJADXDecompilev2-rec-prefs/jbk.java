package p000;

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
    private static final File f19721a = new File("/dev/urandom");
    private static final Object f19722b = new Object();
    private static DataInputStream f19723c;
    private static OutputStream f19724d;
    private boolean f19725e;

    protected void engineSetSeed(byte[] bArr) {
        try {
            OutputStream b;
            synchronized (f19722b) {
                b = jbk.m23792b();
            }
            b.write(bArr);
            b.flush();
            this.f19725e = true;
        } catch (IOException e) {
            try {
                String valueOf = String.valueOf(f19721a);
                new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to mix seed into ").append(valueOf);
            } finally {
                this.f19725e = true;
            }
        }
    }

    protected void engineNextBytes(byte[] bArr) {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            DataInputStream a;
            if (!this.f19725e) {
                engineSetSeed(jbj.m23789a());
            }
            synchronized (f19722b) {
                a = jbk.m23791a();
            }
            synchronized (a) {
                a.readFully(bArr);
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        } catch (Throwable e) {
            try {
                String valueOf = String.valueOf(f19721a);
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

    private static DataInputStream m23791a() {
        DataInputStream dataInputStream;
        synchronized (f19722b) {
            if (f19723c == null) {
                try {
                    f19723c = new DataInputStream(new FileInputStream(f19721a));
                } catch (Throwable e) {
                    String valueOf = String.valueOf(f19721a);
                    throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to open ").append(valueOf).append(" for reading").toString(), e);
                }
            }
            dataInputStream = f19723c;
        }
        return dataInputStream;
    }

    private static OutputStream m23792b() {
        OutputStream outputStream;
        synchronized (f19722b) {
            if (f19724d == null) {
                f19724d = new FileOutputStream(f19721a);
            }
            outputStream = f19724d;
        }
        return outputStream;
    }
}
