package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class otk extends otj {
    private final File f34255d;
    private final String f34256e;
    private final String f34257f;

    private otk(File file, String str, String str2, String str3) {
        super(str2);
        if (file == null) {
            throw new IllegalArgumentException("File may not be null");
        }
        this.f34255d = file;
        this.f34256e = file.getName();
        this.f34257f = str3;
    }

    private otk(File file, String str, String str2) {
        this(file, null, str, null);
    }

    private otk(File file, String str) {
        this(file, str, null);
    }

    public otk(File file) {
        this(file, "application/octet-stream");
    }

    public void mo4220a(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream fileInputStream = new FileInputStream(this.f34255d);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
        } finally {
            fileInputStream.close();
        }
    }

    public String mo4222c() {
        return "binary";
    }

    public String mo4221b() {
        return this.f34257f;
    }

    public long mo4223d() {
        return this.f34255d.length();
    }

    public String mo4224e() {
        return this.f34256e;
    }
}
