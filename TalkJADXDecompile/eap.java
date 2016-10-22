import java.util.List;

final class eap {
    int a;
    List<ear> b;

    eap(int i, List<ear> list) {
        this.a = i;
        this.b = list;
        if (ebz.d) {
            int i2 = this.a;
            glk.d("Babel", "Notification list with : messageCount=" + i2 + " conversation count=" + this.b.size(), new Object[0]);
        }
    }

    gjj a() {
        gjj gjj = new gjj();
        for (ear ear : this.b) {
            if (ear.j) {
                for (ecj ecj : ear.h) {
                    gjj.add(((ebq) ecj).p.a);
                }
            } else {
                gjj.add(ear.a);
            }
        }
        return gjj;
    }
}
