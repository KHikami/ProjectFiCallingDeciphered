import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.permissions.impl.RationaleActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eio implements eib {
    final /* synthetic */ RationaleActivity a;

    public eio(RationaleActivity rationaleActivity) {
        this.a = rationaleActivity;
    }

    public void a(List<eic> list, Bundle bundle) {
        RationaleActivity rationaleActivity = this.a;
        RationaleActivity rationaleActivity2 = this.a;
        Intent intent = new Intent();
        intent.putExtra("original_request_code", rationaleActivity2.getIntent().getIntExtra("original_request_code", 0));
        ArrayList arrayList = (ArrayList) rationaleActivity2.getIntent().getSerializableExtra("permissions");
        Collection arrayList2 = new ArrayList();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            arrayList2.add(new eic(str, rationaleActivity2.n.a(str)));
        }
        intent.putExtra("permission_results", new ArrayList(arrayList2));
        rationaleActivity.setResult(-1, intent);
        this.a.finish();
    }
}
