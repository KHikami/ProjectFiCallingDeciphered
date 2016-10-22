import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
public class aau {
    final /* synthetic */ RecyclerView a;

    public void a(zk zkVar, yx yxVar, yx yxVar2) {
        this.a.c.b(zkVar);
        RecyclerView recyclerView = this.a;
        recyclerView.a(zkVar);
        zkVar.a(false);
        if (recyclerView.y.a(zkVar, yxVar, yxVar2)) {
            recyclerView.k();
        }
    }

    public void b(zk zkVar, yx yxVar, yx yxVar2) {
        RecyclerView recyclerView = this.a;
        zkVar.a(false);
        if (recyclerView.y.b(zkVar, yxVar, yxVar2)) {
            recyclerView.k();
        }
    }

    public void c(zk zkVar, yx yxVar, yx yxVar2) {
        zkVar.a(false);
        if (this.a.t) {
            if (this.a.y.a(zkVar, zkVar, yxVar, yxVar2)) {
                this.a.k();
            }
        } else if (this.a.y.c(zkVar, yxVar, yxVar2)) {
            this.a.k();
        }
    }

    public void a(zk zkVar) {
        yz yzVar = this.a.k;
        View view = zkVar.a;
        zc zcVar = this.a.c;
        wq wqVar = yzVar.d;
        int a = wqVar.a.a(view);
        if (a >= 0) {
            if (wqVar.b.d(a)) {
                wqVar.b(view);
            }
            wqVar.a.a(a);
        }
        zcVar.a(view);
    }

    public aau(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
