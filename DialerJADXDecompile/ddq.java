import java.util.regex.Pattern;

/* compiled from: PG */
public final class ddq {
    private ddr a;

    public ddq(int i) {
        this.a = new ddr(100);
    }

    public final Pattern a(String str) {
        Pattern pattern = (Pattern) this.a.a(str);
        if (pattern != null) {
            return pattern;
        }
        pattern = Pattern.compile(str);
        this.a.a(str, pattern);
        return pattern;
    }
}
