package com.google.android.apps.hangouts.realtimechat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import ba;
import fem;
import fen;
import feo;
import gwb;
import jcu;
import jyy;

public class DebugOzGetMergedPersonActivity extends jyy {
    public DebugOzGetMergedPersonActivity() {
        new jcu(this, this.k).a(this.j);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gk);
        EditText editText = (EditText) findViewById(ba.em);
        RadioGroup radioGroup = (RadioGroup) findViewById(ba.en);
        ((RadioButton) findViewById(ba.dZ)).setOnClickListener(new fem(this, editText));
        ((RadioButton) findViewById(ba.aT)).setOnClickListener(new fen(this, editText));
        CheckBox checkBox = (CheckBox) findViewById(ba.s);
        ((Button) findViewById(ba.eZ)).setOnClickListener(new feo(this, (TextView) findViewById(ba.eL), radioGroup, editText, checkBox, this));
    }
}
