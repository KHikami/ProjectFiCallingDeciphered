package p000;

public class evd extends euo {
    private static final long serialVersionUID = 1;
    public final int f12354c;

    public evd(String str, int i) {
        super(str);
        this.f12354c = i;
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 81).append("setConversationNotificationLevel build protobuf conversationID=").append(str2).append(" level=").append(this.f12354c);
        }
        nzf lvj = new lvj();
        lvj.requestHeader = euk.m14556a(str, i, i2, this.i);
        lvj.f26592a = euk.m14555a(this.e);
        lvj.f26593b = Integer.valueOf(this.f12354c);
        return lvj;
    }

    public String mo1947g() {
        return "conversations/setconversationnotificationlevel";
    }
}
