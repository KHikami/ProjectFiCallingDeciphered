public class evw extends euo {
    private static final long serialVersionUID = 1;
    public final long c;

    public evw(String str, long j) {
        super(str);
        this.c = j;
    }

    public nzf a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 77).append("updateWatermark build protobuf conversationID=").append(str2).append(" watermark=").append(this.c);
        }
        nzf lwz = new lwz();
        lwz.a = euk.a(this.e);
        lwz.b = Long.valueOf(this.c);
        lwz.requestHeader = euk.a(str, i, i2, this.i);
        return lwz;
    }

    public String g() {
        return "conversations/updatewatermark";
    }

    public String K_() {
        return "background_queue";
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return ((evw) ead).e.equals(this.e);
    }
}
