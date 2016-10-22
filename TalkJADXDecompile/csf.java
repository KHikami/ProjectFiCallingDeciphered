import android.content.Context;
import android.content.DialogInterface;

public final class csf extends jxy {
    public void onClick(DialogInterface dialogInterface, int i) {
        onCancel(dialogInterface);
    }

    public void onCancel(DialogInterface dialogInterface) {
        getActivity().finish();
    }

    public static String a(Context context, int i) {
        int i2 = ba.jF;
        switch (i) {
            case 10001:
            case 10015:
            case 10018:
            case 11009:
                i2 = ba.jE;
                break;
            case 10003:
            case 10004:
            case 10011:
                i2 = ba.jD;
                break;
            case 10012:
                i2 = ba.jx;
                break;
            case 10013:
                i2 = ba.jy;
                break;
            case 10014:
                i2 = ba.jA;
                break;
            case 10019:
                iil.a("Express lane UI does not support HOA.");
                break;
            case 10020:
                i2 = ba.jz;
                break;
            case 10022:
            case 10023:
            case 10024:
            case 10029:
            case 11003:
                i2 = ba.jI;
                break;
            case 10025:
                i2 = ba.jH;
                break;
            case 11001:
                i2 = ba.jB;
                break;
            case 11006:
                i2 = ba.jG;
                break;
            case 11012:
                i2 = ba.jL;
                break;
            case 11013:
                i2 = ba.jC;
                break;
            case 11019:
                i2 = ba.jw;
                break;
        }
        return context.getResources().getString(i2);
    }
}
