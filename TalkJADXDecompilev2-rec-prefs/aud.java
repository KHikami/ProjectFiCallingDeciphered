package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

final class aud implements aoe<File> {
    private static final String[] f2347a = new String[]{"_data"};
    private final Context f2348b;
    private final Uri f2349c;

    aud(Context context, Uri uri) {
        this.f2348b = context;
        this.f2349c = uri;
    }

    public void mo312a(amq amq, aof<? super File> aof__super_java_io_File) {
        Object obj = null;
        Cursor query = this.f2348b.getContentResolver().query(this.f2349c, f2347a, null, null, null);
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
            String valueOf = String.valueOf(this.f2349c);
            aof__super_java_io_File.mo325a(new FileNotFoundException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to find file path for: ").append(valueOf).toString()));
            return;
        }
        aof__super_java_io_File.mo326a(new File(obj));
    }

    public void mo311a() {
    }

    public void mo313b() {
    }

    public Class<File> mo321d() {
        return File.class;
    }

    public anq mo314c() {
        return anq.LOCAL;
    }
}
