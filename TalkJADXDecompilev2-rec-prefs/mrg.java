package p000;

import java.io.File;

public final class mrg {
    private static final mnx<File> f28149a = new mrh();

    public static void m32753a(File file, File file2) {
        boolean z;
        if (file.equals(file2)) {
            z = false;
        } else {
            z = true;
        }
        bm.m6144a(z, "Source %s and destination %s must be different", (Object) file, (Object) file2);
        new mrj(file).m32741a(new mri(file2, new mrf[0]));
    }
}
