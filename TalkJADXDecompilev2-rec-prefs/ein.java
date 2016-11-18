package p000;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.permissions.impl.RationaleActivity;
import java.util.ArrayList;
import java.util.Collection;

public final class ein implements OnClickListener {
    final /* synthetic */ RationaleActivity f11614a;

    public ein(RationaleActivity rationaleActivity) {
        this.f11614a = rationaleActivity;
    }

    public void onClick(View view) {
        if (view.getId() == gwb.tr) {
            RationaleActivity rationaleActivity = this.f11614a;
            RationaleActivity rationaleActivity2 = this.f11614a;
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
                arrayList2.add(new eic(str, rationaleActivity2.f6536n.mo1882a(str)));
            }
            intent.putExtra("permission_results", new ArrayList(arrayList2));
            rationaleActivity.setResult(0, intent);
            this.f11614a.finish();
            return;
        }
        this.f11614a.f6537o.mo1886a(new eie(gwb.to, 0), (ArrayList) this.f11614a.getIntent().getSerializableExtra("permissions"));
    }
}
