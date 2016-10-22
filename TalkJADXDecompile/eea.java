import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class eea implements OnClickListener {
    final /* synthetic */ bjg a;
    final /* synthetic */ String b;
    final /* synthetic */ edv c;

    eea(edv edv, bjg bjg, String str) {
        this.c = edv;
        this.a = bjg;
        this.b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.c.a(3238);
        edv edv = this.c;
        bjg bjg = this.a;
        String str = this.b;
        edv.aj = new eef(edv, edv.ak, edv.getFragmentManager(), bjg);
        ((gie) edv.al.a(gie.class)).a(bow.class, edv.aj, new bow(str, edv.an.g(), box.REMOVE_PARTICIPANT_FROM_CONVERSATION).a());
        ((cnt) edv.al.a(cnt.class)).a(edv.an.g(), str, bjg.i());
        edv.aj.a(edv.getResources().getString(bc.V), "", "arg_task_tag", true);
    }
}
