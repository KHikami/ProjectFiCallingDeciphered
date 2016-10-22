package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cqi */
public final class cqi implements cqt {
    private static final Uri a;
    private final LogPrinter b;

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }

    public cqi() {
        this.b = new LogPrinter(4, "GA/LogCatTransport");
    }

    public final Uri a() {
        return a;
    }

    public final void a(cqk cqk) {
        List<cql> arrayList = new ArrayList(cqk.h.values());
        Collections.sort(arrayList, new cqj(this));
        StringBuilder stringBuilder = new StringBuilder();
        for (cql obj : arrayList) {
            Object obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj2);
            }
        }
        this.b.println(stringBuilder.toString());
    }
}
