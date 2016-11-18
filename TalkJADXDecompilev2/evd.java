package defpackage;

public class evd extends euo {
    private static final long serialVersionUID = 1;
    public final int c;

    public evd(String str, int i) {
        super(str);
        this.c = i;
    }

    public nzf a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 81).append("setConversationNotificationLevel build protobuf conversationID=").append(str2).append(" level=").append(this.c);
        }
        nzf lvj = new lvj();
        lvj.requestHeader = euk.a(str, i, i2, this.i);
        lvj.a = euk.a(this.e);
        lvj.b = Integer.valueOf(this.c);
        return lvj;
    }

    public String g() {
        return "conversations/setconversationnotificationlevel";
    }
}
