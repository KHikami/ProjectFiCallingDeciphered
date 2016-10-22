public class eun extends euo {
    private static final long serialVersionUID = 1;
    public final boolean c;
    public final long d;

    public eun(String str, long j, boolean z) {
        super(str);
        this.d = j;
        this.c = z;
    }

    public nzf a(String str, int i, int i2) {
        int i3;
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 27).append("Archive conversation ").append(str2).append(" ").append(this.c);
        }
        nzf ltc = new ltc();
        ltc.requestHeader = euk.a(str, i, i2, this.i);
        ltc.a = euk.a(this.e);
        ltc.c = Long.valueOf(this.d);
        if (this.c) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        ltc.b = Integer.valueOf(i3);
        return ltc;
    }

    public String K_() {
        return "event_queue";
    }

    public String g() {
        return "conversations/modifyconversationview";
    }
}
