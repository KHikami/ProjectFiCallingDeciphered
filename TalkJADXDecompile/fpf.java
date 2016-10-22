import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class fpf implements fqd {
    private static final long serialVersionUID = 1;
    private final List<String> a;
    private final List<String> b;
    private final String c;

    public fpf(lol lol, String str) {
        int i = 0;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = str;
        for (ltr ltr : lol.a) {
            this.a.add(ltr.b);
        }
        ltr[] ltrArr = lol.b;
        int length = ltrArr.length;
        while (i < length) {
            this.b.add(ltrArr[i].b);
            i++;
        }
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        String str = this.c;
        String str2 = "ContactsNotification.selfFanoutId == ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        if (!eul.b(str)) {
            ((bhl) jyn.a(gwb.H(), bhl.class)).a(new fkr(i));
        }
    }
}
