package p000;

import java.util.regex.Matcher;

public final class jbe implements jbd {
    private final jaz f19676a = new jaz(100);

    public boolean mo3432a(String str, jbi jbi, boolean z) {
        Matcher matcher = this.f19676a.m23741a(jbi.f19717a).matcher(str);
        return matcher.matches() || (z && matcher.lookingAt());
    }

    public boolean mo3431a(String str, jbi jbi) {
        return this.f19676a.m23741a(jbi.f19718b).matcher(str).matches();
    }
}
