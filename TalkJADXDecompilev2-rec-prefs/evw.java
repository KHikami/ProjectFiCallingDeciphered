package p000;

public class evw extends euo {
    private static final long serialVersionUID = 1;
    public final long f12396c;

    public evw(String str, long j) {
        super(str);
        this.f12396c = j;
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 77).append("updateWatermark build protobuf conversationID=").append(str2).append(" watermark=").append(this.f12396c);
        }
        nzf lwz = new lwz();
        lwz.f26738a = euk.m14555a(this.e);
        lwz.f26739b = Long.valueOf(this.f12396c);
        lwz.requestHeader = euk.m14556a(str, i, i2, this.i);
        return lwz;
    }

    public String mo1947g() {
        return "conversations/updatewatermark";
    }

    public String K_() {
        return "background_queue";
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return ((evw) ead).e.equals(this.e);
    }
}
