package p000;

public class eun extends euo {
    private static final long serialVersionUID = 1;
    public final boolean f12303c;
    public final long f12304d;

    public eun(String str, long j, boolean z) {
        super(str);
        this.f12304d = j;
        this.f12303c = z;
    }

    public nzf mo1944a(String str, int i, int i2) {
        int i3;
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 27).append("Archive conversation ").append(str2).append(" ").append(this.f12303c);
        }
        nzf ltc = new ltc();
        ltc.requestHeader = euk.m14556a(str, i, i2, this.i);
        ltc.f26365a = euk.m14555a(this.e);
        ltc.f26367c = Long.valueOf(this.f12304d);
        if (this.f12303c) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        ltc.f26366b = Integer.valueOf(i3);
        return ltc;
    }

    public String K_() {
        return "event_queue";
    }

    public String mo1947g() {
        return "conversations/modifyconversationview";
    }
}
