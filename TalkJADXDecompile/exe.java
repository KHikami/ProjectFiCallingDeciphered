import java.util.ArrayList;
import java.util.List;

public final class exe extends evz {
    private static final long serialVersionUID = 1;
    private int g;
    private int h;
    private int i;
    private final List<exf> j;

    public exe(kmy kmy) {
        super(kmy, kmy.apiHeader);
        knp knp = kmy.a.a;
        if (evz.a) {
            String valueOf = String.valueOf(kmy.a.a);
            new StringBuilder(String.valueOf(valueOf).length() + 64).append("GetChatAclSettingsResponse.processResponse: retrieved chat ACLs ").append(valueOf);
        }
        if (knp != null) {
            this.g = gwb.a(knp.a);
            this.h = gwb.a(knp.f);
            this.i = gwb.a(knp.e);
            if (knp.c.length > 0) {
                this.j = new ArrayList();
                for (knq knq : knp.c) {
                    exf exf = new exf();
                    exf.b = knq.b;
                    exf.a = knq.a;
                    exf.c = gwb.a(knq.c);
                    this.j.add(exf);
                }
                return;
            }
            this.j = null;
            return;
        }
        this.j = null;
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        bnz.a(blo.g().g(), this.g, this.h, this.i, this.j);
    }
}
