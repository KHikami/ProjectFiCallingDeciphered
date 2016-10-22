import com.google.android.apps.hangouts.elane.CallActivity;

public final class cri extends itg {
    final /* synthetic */ CallActivity a;

    public cri(CallActivity callActivity) {
        this.a = callActivity;
        super('\u0000');
    }

    public void a(int i) {
        CallActivity callActivity = this.a;
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
                callActivity.c(i);
            } else if (!callActivity.o) {
                callActivity.finish();
            }
        }
    }
}
