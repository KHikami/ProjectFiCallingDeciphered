package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class asn implements FilenameFilter {
    final /* synthetic */ Pattern f2289a;

    asn(Pattern pattern) {
        this.f2289a = pattern;
    }

    public boolean accept(File file, String str) {
        return this.f2289a.matcher(str).matches();
    }
}
