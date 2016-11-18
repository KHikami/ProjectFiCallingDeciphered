package defpackage;

import android.content.Intent;
import com.google.android.libraries.hangouts.video.internal.CallService;

final class irk extends itg {
    final /* synthetic */ iri a;

    irk(iri iri) {
        this.a = iri;
    }

    public void a(itk itk) {
        this.a.a.bindService(new Intent(this.a.a, CallService.class), this.a.e, 1);
    }

    public void a(int i) {
        this.a.c = null;
        this.a.a();
    }
}
