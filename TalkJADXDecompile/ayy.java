import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class ayy {
    private final Context a;

    public ayy(Context context) {
        this.a = context;
    }

    public List<ayx> a() {
        List<ayx> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return arrayList;
            }
            for (String str : applicationInfo.metaData.keySet()) {
                String str2;
                if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                    arrayList.add(a(str2));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        String str3 = "Loaded Glide module: ";
                        str2 = String.valueOf(str2);
                        if (str2.length() != 0) {
                            str3.concat(str2);
                        } else {
                            str2 = new String(str3);
                        }
                    } else {
                        continue;
                    }
                }
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    private static ayx a(String str) {
        Throwable e;
        String valueOf;
        try {
            Class cls = Class.forName(str);
            try {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof ayx) {
                    return (ayx) newInstance;
                }
                String valueOf2 = String.valueOf(newInstance);
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf2).length() + 44).append("Expected instanceof GlideModule, but found: ").append(valueOf2).toString());
            } catch (InstantiationException e2) {
                e = e2;
                valueOf = String.valueOf(cls);
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 53).append("Unable to instantiate GlideModule implementation for ").append(valueOf).toString(), e);
            } catch (IllegalAccessException e3) {
                e = e3;
                valueOf = String.valueOf(cls);
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 53).append("Unable to instantiate GlideModule implementation for ").append(valueOf).toString(), e);
            }
        } catch (Throwable e4) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e4);
        }
    }
}
