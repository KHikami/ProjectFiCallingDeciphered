package p000;

import android.content.Context;
import android.text.TextUtils;

public class etr extends etk {
    private static final long serialVersionUID = 1;
    private final String f12242c;
    private final String f12243d;
    private final int f12244e;
    private final ets f12245f;

    public etr(ets ets, String str, String str2, int i) {
        this.f12245f = ets;
        this.f12242c = str;
        this.f12243d = str2;
        this.f12244e = i;
    }

    public nzf mo1944a(String str, int i, int i2) {
        kns kns = new kns();
        knp knp = new knp();
        if (this.f12245f == ets.PUBLIC_ACL) {
            knp.f22429a = Integer.valueOf(this.f12244e);
        } else if (this.f12245f == ets.EMAIL_ACL) {
            knp.f22433e = Integer.valueOf(this.f12244e);
        } else if (this.f12245f == ets.PHONE_ACL) {
            knp.f22434f = Integer.valueOf(this.f12244e);
        } else {
            iil.m21879b("Expected condition to be false", TextUtils.isEmpty(this.f12242c));
            knq knq = new knq();
            knq.f22437a = this.f12242c;
            knq.f22438b = this.f12243d;
            knq.f22439c = Integer.valueOf(this.f12244e);
            knp.f22431c = new knq[]{knq};
        }
        kns.f22440a = knp;
        nzf knj = new knj();
        knj.f22423a = kns;
        return knj;
    }

    public String mo1947g() {
        return "setchatacls";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        String str = "Babel";
        String str2 = "SetChatAclSettingRequest failed for ";
        String valueOf = String.valueOf(glk.m17974b(bko.m5634c()));
        glk.m17980d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), (Throwable) fdo);
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }
}
