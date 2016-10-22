package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bor */
public final class bor {
    public static final boolean a;
    private final Context b;
    private final Map<String, bos> c;

    static {
        kae kae = glk.d;
        a = false;
    }

    bor(Context context) {
        this.b = context;
        this.c = new ky();
    }

    private bos b(String str) {
        bos bos = (bos) this.c.get(str);
        if (bos != null) {
            return bos;
        }
        bos = new bos(this.b);
        this.c.put(str, bos);
        return bos;
    }

    public bos a(String str) {
        return b(str);
    }

    public void a(fqj fqj) {
        b(fqj.a()).a(fqj);
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            bos bos = (bos) entry.getValue();
            String str2 = "ConversationId ";
            str = String.valueOf(str);
            stringBuilder.append(str.length() != 0 ? str2.concat(str) : new String(str2));
            stringBuilder.append("\n");
            bos.a(stringBuilder);
        }
        return stringBuilder.toString();
    }
}
