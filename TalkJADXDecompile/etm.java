import android.content.Context;

public class etm extends etk {
    private static final long serialVersionUID = 1;

    public nzf a(String str, int i, int i2) {
        knr knr = new knr();
        nzf kmx = new kmx();
        kmx.a = knr;
        return kmx;
    }

    public String g() {
        return "getchatacls";
    }

    public void a(Context context, bko bko, fdo fdo) {
        String str = "Babel";
        String str2 = "GetChatAclSettingsOperation failed for ";
        String valueOf = String.valueOf(glk.b(bko.c()));
        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), (Throwable) fdo);
    }

    public String K_() {
        return "ui_queue";
    }
}
