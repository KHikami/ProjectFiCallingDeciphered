package p000;

import android.content.Context;
import java.io.File;

public class asa {
    final /* synthetic */ Context f2256a;
    final /* synthetic */ String f2257b;

    public File m3903a() {
        File cacheDir = this.f2256a.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        return this.f2257b != null ? new File(cacheDir, this.f2257b) : cacheDir;
    }

    asa(Context context, String str) {
        this.f2256a = context;
        this.f2257b = str;
    }
}
