package p000;

import android.content.Context;

@Deprecated
public class evf extends euu {
    private static final long serialVersionUID = 1;
    public final edo f12356c = null;

    public evf(String str, String str2, edo edo) {
        super(str2, str);
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            String str3 = this.k;
            String valueOf = String.valueOf(this.f12356c);
            new StringBuilder(((String.valueOf(str2).length() + 77) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()).append("RemoveUserRequest build protobuf convID: ").append(str2).append(" clientGeneratedId: ").append(str3).append(" participantId: ").append(valueOf);
        }
        lqm lqm = new lqm();
        lqm.f26145b = blo.m5887c(this.k);
        lqm.f26144a = euk.m14555a(this.e);
        lqm.f26148e = Integer.valueOf(5);
        nzf lui = new lui();
        lui.f26483a = lqm;
        if (this.f12356c != null) {
            lui.f26484b = gwb.m2092c(this.f12356c);
        }
        lui.requestHeader = euk.m14556a(str, i, i2, this.i);
        return lui;
    }

    public String mo1947g() {
        return "conversations/removeuser";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        super.mo1945a(context, bko, fdo);
    }
}
