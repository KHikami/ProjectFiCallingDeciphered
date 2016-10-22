package io.grpc.internal;

import java.util.ArrayList;
import olv;

final class aj implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ olv b;
    final /* synthetic */ ag c;

    aj(ag agVar, ArrayList arrayList, olv olv) {
        this.c = agVar;
        this.a = arrayList;
        this.b = olv;
    }

    public void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((am) obj).a(new be(this.b));
        }
    }
}
