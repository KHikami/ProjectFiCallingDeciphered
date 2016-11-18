package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class eea implements OnClickListener {
    final /* synthetic */ bjg f11290a;
    final /* synthetic */ String f11291b;
    final /* synthetic */ edv f11292c;

    eea(edv edv, bjg bjg, String str) {
        this.f11292c = edv;
        this.f11290a = bjg;
        this.f11291b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f11292c.m13616a(3238);
        edv edv = this.f11292c;
        bjg bjg = this.f11290a;
        String str = this.f11291b;
        edv.aj = new eef(edv, edv.ak, edv.getFragmentManager(), bjg);
        ((gie) edv.al.m25443a(gie.class)).mo2274a(bow.class, edv.aj, new bow(str, edv.an.m5638g(), box.REMOVE_PARTICIPANT_FROM_CONVERSATION).m6328a());
        ((cnt) edv.al.m25443a(cnt.class)).mo1029a(edv.an.m5638g(), str, bjg.mo575i());
        edv.aj.mo795a(edv.getResources().getString(bc.f2938V), "", "arg_task_tag", true);
    }
}
