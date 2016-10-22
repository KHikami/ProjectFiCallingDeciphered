import java.io.Serializable;
import java.util.List;

public final class evc implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final List<String> b;

    public evc(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public lsp a() {
        lsp lsp = new lsp();
        lsp.a = euk.a(this.a);
        if (this.b != null && this.b.size() > 0) {
            lsp.b = new String[this.b.size()];
            for (int i = 0; i < this.b.size(); i++) {
                lsp.b[i] = (String) this.b.get(i);
            }
        }
        return lsp;
    }
}
