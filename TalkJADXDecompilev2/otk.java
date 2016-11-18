package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class otk extends otj {
    private final File d;
    private final String e;
    private final String f;

    private otk(File file, String str, String str2, String str3) {
        super(str2);
        if (file == null) {
            throw new IllegalArgumentException("File may not be null");
        }
        this.d = file;
        this.e = file.getName();
        this.f = str3;
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

    public void a(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream fileInputStream = new FileInputStream(this.d);
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

    public String c() {
        return "binary";
    }

    public String b() {
        return this.f;
    }

    public long d() {
        return this.d.length();
    }

    public String e() {
        return this.e;
    }
}
