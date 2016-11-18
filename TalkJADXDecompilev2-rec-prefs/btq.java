package p000;

import android.content.Context;

public class btq {
    private final lo<btc, bte> f4431a = new lo();

    public btq(Context context) {
        for (bte bte : jyn.m25438c(context, bte.class)) {
            for (Object obj : bte.mo709a()) {
                if (this.f4431a.containsKey(obj)) {
                    String valueOf = String.valueOf(((bte) this.f4431a.get(obj)).getClass().getName());
                    String valueOf2 = String.valueOf(bte.getClass().getName());
                    String valueOf3 = String.valueOf(obj);
                    iil.m21870a(new StringBuilder(((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(" and ").append(valueOf2).append(" support same attachment type: ").append(valueOf3).toString());
                }
                this.f4431a.put(obj, bte);
            }
        }
    }

    public btd m6609a(Context context, btf btf) {
        bte bte = (bte) this.f4431a.get(btf.f4406s.m6573a(context));
        if (bte != null) {
            return bte.mo708a(context);
        }
        return null;
    }
}
