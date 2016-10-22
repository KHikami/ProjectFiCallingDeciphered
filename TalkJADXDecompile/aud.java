import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

final class aud implements aoe<File> {
    private static final String[] a;
    private final Context b;
    private final Uri c;

    static {
        a = new String[]{"_data"};
    }

    aud(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    public void a(amq amq, aof<? super File> aof__super_java_io_File) {
        Object obj = null;
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    obj = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        if (TextUtils.isEmpty(obj)) {
            String valueOf = String.valueOf(this.c);
            aof__super_java_io_File.a(new FileNotFoundException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to find file path for: ").append(valueOf).toString()));
            return;
        }
        aof__super_java_io_File.a(new File(obj));
    }

    public void a() {
    }

    public void b() {
    }

    public Class<File> d() {
        return File.class;
    }

    public anq c() {
        return anq.LOCAL;
    }
}
