package defpackage;

import android.content.Context;

public class btq {
    private final lo<btc, bte> a = new lo();

    public btq(Context context) {
        for (bte bte : jyn.c(context, bte.class)) {
            for (Object obj : bte.a()) {
                if (this.a.containsKey(obj)) {
                    String valueOf = String.valueOf(((bte) this.a.get(obj)).getClass().getName());
                    String valueOf2 = String.valueOf(bte.getClass().getName());
                    String valueOf3 = String.valueOf(obj);
                    iil.a(new StringBuilder(((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(" and ").append(valueOf2).append(" support same attachment type: ").append(valueOf3).toString());
                }
                this.a.put(obj, bte);
            }
        }
    }

    public btd a(Context context, btf btf) {
        bte bte = (bte) this.a.get(btf.s.a(context));
        if (bte != null) {
            return bte.a(context);
        }
        return null;
    }
}