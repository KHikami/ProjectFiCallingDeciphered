package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

/* renamed from: dhl */
public final class dhl extends dq implements OnClickListener {
    public static dhl a(String str, int i) {
        dhl dhl = new dhl();
        Bundle bundle = new Bundle();
        bundle.putString("key_error_message", str);
        bundle.putInt("KEY_ERROR", i);
        dhl.setArguments(bundle);
        return dhl;
    }

    public Dialog a(Bundle bundle) {
        Builder builder = new Builder(getActivity());
        Bundle arguments = getArguments();
        builder.setMessage(dhl.a(getContext(), arguments.getString("key_error_message"), arguments.getInt("KEY_ERROR")));
        builder.setPositiveButton(getActivity().getResources().getString(bc.hR), this);
        return builder.create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        iil.a(Integer.valueOf(i), Integer.valueOf(-1));
        onCancel(dialogInterface);
        a();
    }

    public void onCancel(DialogInterface dialogInterface) {
        HangoutActivity hangoutActivity = (HangoutActivity) getActivity();
        if (hangoutActivity != null) {
            hangoutActivity.n();
        }
    }

    public static String a(Context context, String str, int i) {
        if (str != null) {
            return str;
        }
        int i2 = bc.dJ;
        switch (i) {
            case 67:
            case 11007:
            case 11014:
                break;
            case 10001:
            case 10016:
            case 11016:
                i2 = bc.dD;
                break;
            case 10002:
                i2 = bc.fa;
                break;
            case 10003:
            case 10004:
            case 10005:
            case 10006:
            case 10007:
            case 10008:
            case 10009:
            case 10010:
            case 10011:
                i2 = bc.dB;
                break;
            case 10012:
                i2 = bc.du;
                break;
            case 10013:
                i2 = bc.dv;
                break;
            case 10014:
                i2 = bc.dx;
                break;
            case 10015:
            case 11009:
                i2 = bc.fl;
                break;
            case 10017:
            case 10018:
                i2 = bc.dz;
                break;
            case 10019:
                iil.a("This should be handled differently");
                break;
            case 10020:
                i2 = bc.dw;
                break;
            case 10021:
            case 10022:
            case 10023:
            case 10024:
            case 10029:
            case 11003:
                i2 = bc.dM;
                break;
            case 10025:
                i2 = bc.dL;
                break;
            case 10028:
                i2 = bc.dC;
                break;
            case 11000:
                i2 = bc.dg;
                break;
            case 11001:
                i2 = bc.dy;
                break;
            case 11002:
                i2 = bc.dE;
                break;
            case 11006:
                i2 = bc.dK;
                break;
            case 11008:
                i2 = bc.dF;
                break;
            case 11012:
                i2 = bc.fa;
                break;
            case 11013:
                i2 = bc.dA;
                break;
            case 11019:
                i2 = bc.db;
                break;
            default:
                iil.a("Unknown/unexpected error code:" + i);
                break;
        }
        return context.getResources().getString(i2);
    }
}
