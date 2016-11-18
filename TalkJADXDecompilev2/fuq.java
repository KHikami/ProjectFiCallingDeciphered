package defpackage;

import android.app.AlertDialog.Builder;

final class fuq implements jwm {
    final /* synthetic */ fuo a;

    fuq(fuo fuo) {
        this.a = fuo;
    }

    public boolean a(jwi jwi, Object obj) {
        fuo fuo = this.a;
        boolean b = gwb.b((Boolean) obj);
        if (fuo.a.M()) {
            CharSequence string;
            Builder builder = new Builder(fuo.getActivity());
            if (b) {
                builder.setTitle(fuo.getString(bc.tp)).setMessage(fuo.getString(bc.to));
                string = fuo.getString(bc.tn);
            } else {
                builder.setTitle(fuo.getString(bc.tm)).setMessage(fuo.getString(bc.tl));
                string = fuo.getString(bc.tk);
            }
            builder.setCancelable(false).setNegativeButton(bc.O, null);
            builder.setPositiveButton(string, new fur(fuo, b));
            builder.create().show();
            return false;
        }
        bkq.c(fuo.getContext(), fuo.a, b);
        return true;
    }
}
