import java.io.File;
import java.io.FilenameFilter;

final class emy implements FilenameFilter {
    final /* synthetic */ emx a;

    emy(emx emx) {
        this.a = emx;
    }

    public boolean accept(File file, String str) {
        return str != null && (str.startsWith("mmsdump-") || str.startsWith("smsdump-"));
    }
}
