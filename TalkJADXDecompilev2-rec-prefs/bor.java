package p000;

import android.content.Context;
import java.util.Map;
import java.util.Map.Entry;

public final class bor {
    public static final boolean f4113a = false;
    private final Context f4114b;
    private final Map<String, bos> f4115c = new ky();

    static {
        kae kae = glk.f15557d;
    }

    bor(Context context) {
        this.f4114b = context;
    }

    private bos m6319b(String str) {
        bos bos = (bos) this.f4115c.get(str);
        if (bos != null) {
            return bos;
        }
        bos = new bos(this.f4114b);
        this.f4115c.put(str, bos);
        return bos;
    }

    public bos m6320a(String str) {
        return m6319b(str);
    }

    public void m6322a(fqj fqj) {
        m6319b(fqj.m15827a()).m6324a(fqj);
    }

    public String m6321a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : this.f4115c.entrySet()) {
            String str = (String) entry.getKey();
            bos bos = (bos) entry.getValue();
            String str2 = "ConversationId ";
            str = String.valueOf(str);
            stringBuilder.append(str.length() != 0 ? str2.concat(str) : new String(str2));
            stringBuilder.append("\n");
            bos.m6325a(stringBuilder);
        }
        return stringBuilder.toString();
    }
}
