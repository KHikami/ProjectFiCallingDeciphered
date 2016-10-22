package defpackage;

import android.net.Uri;
import android.provider.BaseColumns;

/* compiled from: PG */
/* renamed from: awe */
public final class awe implements BaseColumns {
    public static final Uri a;
    public static final Uri b;

    static {
        a = Uri.withAppendedPath(awd.a, "filtered_numbers_table");
        b = Uri.withAppendedPath(awd.a, "filtered_numbers_increment_filtered_count");
    }
}
