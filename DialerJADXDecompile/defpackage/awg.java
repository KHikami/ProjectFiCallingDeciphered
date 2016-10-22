package defpackage;

import android.net.Uri;
import android.provider.BaseColumns;
import android.provider.OpenableColumns;

/* compiled from: PG */
/* renamed from: awg */
public final class awg implements BaseColumns, OpenableColumns {
    public static final Uri a;

    static {
        a = Uri.withAppendedPath(awf.a, "voicemail_archive_table");
    }

    public static final Uri a(int i) {
        return Uri.withAppendedPath(a, Integer.toString(i));
    }
}
