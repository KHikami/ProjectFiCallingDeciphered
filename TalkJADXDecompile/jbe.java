import java.util.regex.Matcher;

public final class jbe implements jbd {
    private final jaz a;

    public jbe() {
        this.a = new jaz(100);
    }

    public boolean a(String str, jbi jbi, boolean z) {
        Matcher matcher = this.a.a(jbi.a).matcher(str);
        return matcher.matches() || (z && matcher.lookingAt());
    }

    public boolean a(String str, jbi jbi) {
        return this.a.a(jbi.b).matcher(str).matches();
    }
}
