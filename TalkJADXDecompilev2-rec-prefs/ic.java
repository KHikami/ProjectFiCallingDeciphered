package p000;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class ic {
    final String f17545a;
    final HashMap<String, File> f17546b = new HashMap();

    public Uri m21557a(File file) {
        try {
            String path;
            String canonicalPath = file.getCanonicalPath();
            Entry entry = null;
            for (Entry entry2 : this.f17546b.entrySet()) {
                Entry entry22;
                path = ((File) entry22.getValue()).getPath();
                if (!canonicalPath.startsWith(path) || (entry != null && path.length() <= ((File) entry.getValue()).getPath().length())) {
                    entry22 = entry;
                }
                entry = entry22;
            }
            if (entry == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            }
            String path2 = ((File) entry.getValue()).getPath();
            if (path2.endsWith("/")) {
                path = canonicalPath.substring(path2.length());
            } else {
                path = canonicalPath.substring(path2.length() + 1);
            }
            return new Builder().scheme("content").authority(this.f17545a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path, "/")).build();
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public File m21558a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f17546b.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (canonicalFile.getPath().startsWith(file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }

    public ic(String str) {
        this.f17545a = str;
    }

    public void m21559a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f17546b.put(str, file.getCanonicalFile());
        } catch (Throwable e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }
}