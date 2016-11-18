package p000;

import android.app.AlertDialog.Builder;

final class fuq implements jwm {
    final /* synthetic */ fuo f14045a;

    fuq(fuo fuo) {
        this.f14045a = fuo;
    }

    public boolean mo1377a(jwi jwi, Object obj) {
        fuo fuo = this.f14045a;
        boolean b = gwb.m2061b((Boolean) obj);
        if (fuo.f14041a.m5626M()) {
            CharSequence string;
            Builder builder = new Builder(fuo.getActivity());
            if (b) {
                builder.setTitle(fuo.getString(bc.tp)).setMessage(fuo.getString(bc.to));
                string = fuo.getString(bc.tn);
            } else {
                builder.setTitle(fuo.getString(bc.tm)).setMessage(fuo.getString(bc.tl));
                string = fuo.getString(bc.tk);
            }
            builder.setCancelable(false).setNegativeButton(bc.f2931O, null);
            builder.setPositiveButton(string, new fur(fuo, b));
            builder.create().show();
            return false;
        }
        bkq.m5688c(fuo.getContext(), fuo.f14041a, b);
        return true;
    }
}
