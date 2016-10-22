import java.io.File;

public final class mrg {
    private static final mnx<File> a;

    public static void a(File file, File file2) {
        boolean z;
        if (file.equals(file2)) {
            z = false;
        } else {
            z = true;
        }
        bm.a(z, "Source %s and destination %s must be different", (Object) file, (Object) file2);
        new mrj(file).a(new mri(file2, new mrf[0]));
    }

    static {
        a = new mrh();
    }
}
