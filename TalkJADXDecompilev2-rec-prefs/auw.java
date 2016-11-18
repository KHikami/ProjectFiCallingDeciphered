package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class auw implements ant<InputStream> {
    private final aqy f2384a;

    public /* bridge */ /* synthetic */ boolean mo383a(Object obj, File file, anz anz) {
        return m4079a((InputStream) obj, file);
    }

    public auw(aqy aqy) {
        this.f2384a = aqy;
    }

    private boolean m4079a(InputStream inputStream, File file) {
        OutputStream fileOutputStream;
        Throwable th;
        Object obj = (byte[]) this.f2384a.m3780a(65536, byte[].class);
        try {
            fileOutputStream = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(obj);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(obj, 0, read);
                } catch (IOException e) {
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            fileOutputStream.close();
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
            }
            this.f2384a.m3785a(obj, byte[].class);
            return true;
        } catch (IOException e3) {
            fileOutputStream = null;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                }
            }
            this.f2384a.m3785a(obj, byte[].class);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                }
            }
            this.f2384a.m3785a(obj, byte[].class);
            throw th;
        }
    }
}
