import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;

final class dxk extends fje {
    exj a;
    final /* synthetic */ dxg b;
    private ConditionVariable c;

    dxk(dxg dxg, ConditionVariable conditionVariable) {
        this.b = dxg;
        super(dxg.d);
        this.c = conditionVariable;
    }

    void a(Collection<String> collection, int i) {
        ArrayList arrayList = new ArrayList();
        for (String a : collection) {
            arrayList.add(fbt.a(a, null, false));
        }
        gwb.a(new dxl(this, i, arrayList));
    }

    protected void a(fiu fiu) {
        this.a = (exj) fiu.c();
        this.c.open();
    }

    protected void a(Exception exception) {
        this.c.open();
    }
}
