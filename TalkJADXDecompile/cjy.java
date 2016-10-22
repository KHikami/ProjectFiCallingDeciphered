import android.content.Intent;

final class cjy implements bpg {
    final /* synthetic */ Intent a;
    final /* synthetic */ cjx b;

    cjy(cjx cjx, Intent intent) {
        this.b = cjx;
        this.a = intent;
    }

    public void a(bpd bpd) {
        new cit(this.b.a.context).execute(new Intent[]{this.a});
        ((cnh) this.b.a.binder.a(cnh.class)).a(2329, 1, 0, null);
    }
}
