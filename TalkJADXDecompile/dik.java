import java.io.File;
import java.util.Comparator;

public final class dik implements Comparator<File> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        File file = (File) obj2;
        long lastModified = ((File) obj).lastModified();
        long lastModified2 = file.lastModified();
        if (lastModified2 > lastModified) {
            return 1;
        }
        return lastModified2 < lastModified ? -1 : 0;
    }
}
