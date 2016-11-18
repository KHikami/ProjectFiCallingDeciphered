package defpackage;

import android.content.Context;
import android.text.TextUtils;

public class etr extends etk {
    private static final long serialVersionUID = 1;
    private final String c;
    private final String d;
    private final int e;
    private final ets f;

    public etr(ets ets, String str, String str2, int i) {
        this.f = ets;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public nzf a(String str, int i, int i2) {
        kns kns = new kns();
        knp knp = new knp();
        if (this.f == ets.PUBLIC_ACL) {
            knp.a = Integer.valueOf(this.e);
        } else if (this.f == ets.EMAIL_ACL) {
            knp.e = Integer.valueOf(this.e);
        } else if (this.f == ets.PHONE_ACL) {
            knp.f = Integer.valueOf(this.e);
        } else {
            iil.b("Expected condition to be false", TextUtils.isEmpty(this.c));
            knq knq = new knq();
            knq.a = this.c;
            knq.b = this.d;
            knq.c = Integer.valueOf(this.e);
            knp.c = new knq[]{knq};
        }
        kns.a = knp;
        nzf knj = new knj();
        knj.a = kns;
        return knj;
    }

    public String g() {
        return "setchatacls";
    }

    public void a(Context context, bko bko, fdo fdo) {
        String str = "Babel";
        String str2 = "SetChatAclSettingRequest failed for ";
        String valueOf = String.valueOf(glk.b(bko.c()));
        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), (Throwable) fdo);
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }
}
