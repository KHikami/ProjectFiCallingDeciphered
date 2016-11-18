package p000;

import android.text.TextUtils;

public class evq extends esw {
    private static final long serialVersionUID = 1;
    public final String f12378c;

    public evq(String str) {
        this.f12378c = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (a) {
            String str2 = "SetStatusMessageRequest.buildProtobuf: statusMessage=";
            String valueOf = String.valueOf(this.f12378c);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        lwh lwh = new lwh();
        if (!TextUtils.isEmpty(this.f12378c)) {
            ofu ofu = new ofu();
            ofu.b = this.f12378c;
            ofu.a = Integer.valueOf(0);
            ofu[] ofuArr = new ofu[]{ofu};
            new loc().f25850a = ofuArr;
            lwh.f26678a = new loc[]{r2};
        }
        nzf lvr = new lvr();
        lvr.f26617f = lwh;
        lvr.requestHeader = euk.m14556a(str, i, i2, this.i);
        return lvr;
    }

    public String mo1947g() {
        return "presence/setpresence";
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return true;
    }

    public boolean mo1016a(String str) {
        return TextUtils.equals(str, this.f12378c);
    }
}
