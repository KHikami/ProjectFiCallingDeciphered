package defpackage;

import android.text.TextUtils;

public class evq extends esw {
    private static final long serialVersionUID = 1;
    public final String c;

    public evq(String str) {
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        if (a) {
            String str2 = "SetStatusMessageRequest.buildProtobuf: statusMessage=";
            String valueOf = String.valueOf(this.c);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        lwh lwh = new lwh();
        if (!TextUtils.isEmpty(this.c)) {
            ofu ofu = new ofu();
            ofu.b = this.c;
            ofu.a = Integer.valueOf(0);
            ofu[] ofuArr = new ofu[]{ofu};
            new loc().a = ofuArr;
            lwh.a = new loc[]{r2};
        }
        nzf lvr = new lvr();
        lvr.f = lwh;
        lvr.requestHeader = euk.a(str, i, i2, this.i);
        return lvr;
    }

    public String g() {
        return "presence/setpresence";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return true;
    }

    public boolean a(String str) {
        return TextUtils.equals(str, this.c);
    }
}
