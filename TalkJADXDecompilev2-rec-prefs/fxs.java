package p000;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.util.Random;

public abstract class fxs extends ContentProvider {
    public static final Random f6808a = new Random();

    public abstract File mo1198a(String str);

    private static boolean m9178b(String str) {
        int i = str.startsWith("/") ? 1 : 0;
        while (i < str.length()) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean m9177a(File file) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
        } catch (Throwable e) {
            glk.m17978c("Babel", "FileProvider: Failed to create file", e);
        }
        return false;
    }

    public boolean onCreate() {
        return true;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        String path = uri.getPath();
        if (!fxs.m9178b(path)) {
            return 0;
        }
        uri.getQueryParameter("ext");
        if (mo1198a(path).delete()) {
            return 1;
        }
        return 0;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        String path = uri.getPath();
        if (!fxs.m9178b(path)) {
            return null;
        }
        int i;
        uri.getQueryParameter("ext");
        File a = mo1198a(path);
        if (TextUtils.equals(str, "r")) {
            i = 268435456;
        } else {
            i = 603979776;
        }
        return ParcelFileDescriptor.open(a, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }
}
