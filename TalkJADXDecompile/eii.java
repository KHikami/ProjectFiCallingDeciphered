import android.content.Intent;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

final class eii implements jej {
    final /* synthetic */ eih a;

    eii(eih eih) {
        this.a = eih;
    }

    public void a(int i, Intent intent) {
        boolean z;
        eip eip = new eip(intent.getIntExtra("original_request_code", 0), (ArrayList) intent.getSerializableExtra("permission_results"));
        eie eie = (eie) this.a.c.get(eip.a);
        eih eih = this.a;
        int i2 = eie.a;
        List list = eip.b;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        eih.a(i2, list, true, z);
        eih = this.a;
        i2 = eip.a;
        List<eic> list2 = eip.b;
        for (eic eic : list2) {
            if (!eic.b) {
                Toast.makeText(eih.a, gwb.tt, 0).show();
                break;
            }
        }
        eib eib = (eib) eih.b.get(i2);
        eie eie2 = (eie) eih.c.get(i2);
        eih.c.remove(i2);
        eib.a(list2, eie2.b);
    }
}
