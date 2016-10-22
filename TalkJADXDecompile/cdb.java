import android.os.Bundle;
import java.util.List;

final class cdb implements eib {
    final /* synthetic */ ccz a;

    cdb(ccz ccz) {
        this.a = ccz;
    }

    public void a(List<eic> list, Bundle bundle) {
        if (gwb.f((List) list) && this.a.a != null) {
            String string = bundle.getString("permission_picker_name");
            int i = 0;
            while (i < this.a.a.size()) {
                if (string.equals(((cdd) this.a.a.get(i)).a())) {
                    break;
                }
                i++;
            }
            i = -1;
            this.a.b(i);
        }
    }
}
