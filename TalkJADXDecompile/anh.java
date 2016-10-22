import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

final class anh {
    static final Charset a;
    static final Charset b;

    static {
        a = Charset.forName("US-ASCII");
        b = Charset.forName("UTF-8");
    }

    static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String valueOf = String.valueOf(file);
            throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("not a readable directory: ").append(valueOf).toString());
        }
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            File file2 = listFiles[i];
            if (file2.isDirectory()) {
                a(file2);
            }
            if (file2.delete()) {
                i++;
            } else {
                valueOf = String.valueOf(file2);
                throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 23).append("failed to delete file: ").append(valueOf).toString());
            }
        }
    }

    static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
        }
    }
}
