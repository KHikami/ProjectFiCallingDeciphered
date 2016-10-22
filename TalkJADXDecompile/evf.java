import android.content.Context;

@Deprecated
public class evf extends euu {
    private static final long serialVersionUID = 1;
    public final edo c;

    public evf(String str, String str2, edo edo) {
        super(str2, str);
        this.c = null;
    }

    public nzf a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            String str3 = this.k;
            String valueOf = String.valueOf(this.c);
            new StringBuilder(((String.valueOf(str2).length() + 77) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()).append("RemoveUserRequest build protobuf convID: ").append(str2).append(" clientGeneratedId: ").append(str3).append(" participantId: ").append(valueOf);
        }
        lqm lqm = new lqm();
        lqm.b = blo.c(this.k);
        lqm.a = euk.a(this.e);
        lqm.e = Integer.valueOf(5);
        nzf lui = new lui();
        lui.a = lqm;
        if (this.c != null) {
            lui.b = gwb.c(this.c);
        }
        lui.requestHeader = euk.a(str, i, i2, this.i);
        return lui;
    }

    public String g() {
        return "conversations/removeuser";
    }

    public void a(Context context, bko bko, fdo fdo) {
        super.a(context, bko, fdo);
    }
}
