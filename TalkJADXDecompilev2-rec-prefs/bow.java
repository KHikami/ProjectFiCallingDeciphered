package p000;

public class bow implements ayo {
    private final int f4127a;
    private final String f4128b;
    private final box f4129c;

    public bow(String str, int i, box box) {
        glk.m17970a("Babel_ConvTrigger", "Creating a ConversationChange with filter type %s.", box.name());
        this.f4127a = i;
        this.f4128b = str;
        this.f4129c = box;
    }

    public gib m6328a() {
        return new gib("account_id", Integer.valueOf(this.f4127a)).m17706a("conversation_id", this.f4128b).m17706a("type_of_change", this.f4129c);
    }

    public String m6329b() {
        return this.f4128b;
    }

    public int m6330c() {
        return this.f4127a;
    }
}
