import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class jnn extends jzn implements jmi {
    jmo a;
    jcf b;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jmo) this.binder.a(jmo.class);
        this.b = (jcf) this.binder.a(jcf.class);
    }

    public void a(jmu jmu) {
        List arrayList = new ArrayList();
        for (Integer intValue : this.b.a()) {
            int intValue2 = intValue.intValue();
            jch a = this.b.a(intValue2);
            if (!(a.c("logged_in") || a.c("is_managed_account"))) {
                arrayList.add(Integer.valueOf(intValue2));
            }
        }
        if (arrayList.isEmpty()) {
            this.a.b();
            return;
        }
        String string;
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("dialog_title");
        } else {
            string = null;
        }
        ed childFragmentManager = getChildFragmentManager();
        if (string == null) {
            string = this.context.getString(gwb.zn);
        }
        jnk.a(childFragmentManager, string, iArr, true, true);
    }
}
