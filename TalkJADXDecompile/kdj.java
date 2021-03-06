import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;

public final class kdj {
    private static final String[] a;

    static {
        a = new String[]{"_data"};
    }

    public static boolean a(Uri uri) {
        return uri != null && "file".equals(uri.getScheme());
    }

    public static boolean b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean a(String str) {
        return "image/gif".equals(str);
    }

    public static boolean b(String str) {
        return str != null && str.startsWith("image/");
    }

    public static boolean c(String str) {
        return str != null && str.startsWith("video/");
    }

    public static String a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
        String valueOf;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    CharSequence string = query.getString(0);
                    if (TextUtils.isEmpty(string)) {
                        if (Log.isLoggable("ContentUriUtils", 5)) {
                            valueOf = String.valueOf(uri);
                            new StringBuilder(String.valueOf(valueOf).length() + 49).append("getFilePath: MediaColumns.DATA was empty for uri=").append(valueOf);
                        }
                        query.close();
                        return null;
                    }
                    query.close();
                    return string;
                }
                if (Log.isLoggable("ContentUriUtils", 5)) {
                    valueOf = String.valueOf(uri);
                    new StringBuilder(String.valueOf(valueOf).length() + 49).append("getFilePath: query returned empty cursor for uri=").append(valueOf);
                }
                query.close();
                return null;
            } catch (Throwable th) {
                query.close();
            }
        } else if (!Log.isLoggable("ContentUriUtils", 5)) {
            return null;
        } else {
            valueOf = String.valueOf(uri);
            new StringBuilder(String.valueOf(valueOf).length() + 48).append("getFilePath: query returned null cursor for uri=").append(valueOf);
            return null;
        }
    }

    public static String b(ContentResolver contentResolver, Uri uri) {
        String str = null;
        try {
            str = d(contentResolver, uri);
            if (TextUtils.isEmpty(str)) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
            }
            if ("*/*".equals(str) && b(uri)) {
                str = c(contentResolver, uri);
            }
        } catch (Exception e) {
            if (Log.isLoggable("ContentUriUtils", 5)) {
                String valueOf = String.valueOf(uri);
                new StringBuilder(String.valueOf(valueOf).length() + 27).append("getMimeType failed for uri=").append(valueOf);
            }
        }
        return str;
    }

    private static String c(ContentResolver contentResolver, Uri uri) {
        String mimeTypeFromExtension;
        Object obj;
        Cursor query = contentResolver.query(uri, a, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(query.getString(0)));
                    if (query != null) {
                        query.close();
                    }
                    if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                        return mimeTypeFromExtension;
                    }
                    if (b(uri) || !uri.toString().contains("/video/")) {
                        obj = null;
                    } else {
                        obj = 1;
                    }
                    return obj == null ? "video/*" : "image/*";
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
            }
        }
        mimeTypeFromExtension = null;
        if (query != null) {
            query.close();
        }
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            return mimeTypeFromExtension;
        }
        if (b(uri)) {
        }
        obj = null;
        if (obj == null) {
        }
    }

    private static String d(ContentResolver contentResolver, Uri uri) {
        String str = null;
        try {
            str = contentResolver.getType(uri);
        } catch (Exception e) {
            if (Log.isLoggable("ContentUriUtils", 5)) {
                String valueOf = String.valueOf(uri);
                new StringBuilder(String.valueOf(valueOf).length() + 31).append("safeGetMimeType failed for uri=").append(valueOf);
            }
        }
        return str;
    }
}
