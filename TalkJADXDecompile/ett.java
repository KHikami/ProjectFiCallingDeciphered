import android.content.Context;

public class ett extends etk {
    private static final long serialVersionUID = 1;

    public nzf a(String str, int i, int i2) {
        kns kns = new kns();
        knp knp = new knp();
        knp.e = Integer.valueOf(50);
        knp.f = Integer.valueOf(50);
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
        String str2 = "SetChatAclsHappyStateRequest failed for ";
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
