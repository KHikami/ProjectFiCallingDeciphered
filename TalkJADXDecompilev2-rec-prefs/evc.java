package p000;

import java.io.Serializable;
import java.util.List;

public final class evc implements Serializable {
    private static final long serialVersionUID = 1;
    public final String f12352a;
    public final List<String> f12353b;

    public evc(String str, List<String> list) {
        this.f12352a = str;
        this.f12353b = list;
    }

    public lsp m14613a() {
        lsp lsp = new lsp();
        lsp.f26335a = euk.m14555a(this.f12352a);
        if (this.f12353b != null && this.f12353b.size() > 0) {
            lsp.f26336b = new String[this.f12353b.size()];
            for (int i = 0; i < this.f12353b.size(); i++) {
                lsp.f26336b[i] = (String) this.f12353b.get(i);
            }
        }
        return lsp;
    }
}
