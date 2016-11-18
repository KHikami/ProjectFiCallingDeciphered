package p000;

import com.google.android.apps.hangouts.elane.CallActivity;

public final class cri extends itg {
    final /* synthetic */ CallActivity f8938a;

    public cri(CallActivity callActivity) {
        this.f8938a = callActivity;
        super('\u0000');
    }

    public void mo1385a(int i) {
        CallActivity callActivity = this.f8938a;
        if (!callActivity.isFinishing()) {
            Object obj;
            switch (i) {
                case 10030:
                case 11004:
                case 11005:
                case 11010:
                case 11011:
                    obj = 1;
                    break;
                default:
                    obj = null;
                    break;
            }
            if (obj == null) {
                callActivity.m8386c(i);
            } else if (!callActivity.f6127o) {
                callActivity.finish();
            }
        }
    }
}
