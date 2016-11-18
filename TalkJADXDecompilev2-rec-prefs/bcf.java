package p000;

import java.util.ArrayList;
import java.util.List;

public final class bcf {
    public List<bcn> f3000a = new ArrayList();
    public List<bcg> f3001b = new ArrayList();

    public juh m4843a() {
        return new juh();
    }

    public bcf m4841a(bcn bcn) {
        this.f3000a.add(bcn);
        return this;
    }

    public bcf m4842a(Iterable<? extends bcn> iterable) {
        for (bcn add : iterable) {
            this.f3000a.add(add);
        }
        return this;
    }

    public bcf m4840a(bcg bcg) {
        this.f3001b.add(bcg);
        return this;
    }
}
