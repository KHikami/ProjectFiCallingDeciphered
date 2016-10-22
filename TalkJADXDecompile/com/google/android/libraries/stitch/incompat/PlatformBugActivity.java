package com.google.android.libraries.stitch.incompat;

import android.os.Bundle;
import dw;
import jyv;
import kaf;

public final class PlatformBugActivity extends dw {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("extra_error_type")) {
            ((kaf) new jyv(this, kaf.class).a(getIntent().getStringExtra("extra_error_type"))).b().a(J_(), "dialog");
            return;
        }
        throw new IllegalStateException("This needs a type to tell the user about!");
    }
}
