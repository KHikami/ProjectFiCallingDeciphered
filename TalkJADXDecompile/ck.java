import java.io.File;
import java.io.FileFilter;

final class ck implements FileFilter {
    final /* synthetic */ String a;

    ck(String str) {
        this.a = str;
    }

    public boolean accept(File file) {
        return !file.getName().startsWith(this.a);
    }
}
