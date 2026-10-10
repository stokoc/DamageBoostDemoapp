package com.example.damageboostdemo;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private boolean enabled = false;
    private TextView status;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(28, 28, 28, 28);
        layout.setBackgroundColor(Color.rgb(20, 20, 28));

        TextView title = new TextView(this);
        title.setText("DAMAGE BOOST DEMO");
        title.setTextColor(Color.WHITE);
        title.setTextSize(24);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        status = new TextView(this);
        status.setText("Damage Boost: OFF");
        status.setTextColor(Color.RED);
        status.setTextSize(20);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 30, 0, 30);
        layout.addView(status);

        Button toggle = new Button(this);
        toggle.setText("ON / OFF");
        toggle.setOnClickListener(v -> {
            enabled = !enabled;
            status.setText(enabled ? "Damage Boost: ON" : "Damage Boost: OFF");
            status.setTextColor(enabled ? Color.GREEN : Color.RED);
        });
        layout.addView(toggle);

        TextView note = new TextView(this);
        note.setText("Demo mandiri — tombol ini hanya mengubah tampilan aplikasi.");
        note.setTextColor(Color.LTGRAY);
        note.setGravity(Gravity.CENTER);
        note.setPadding(0, 30, 0, 0);
        layout.addView(note);

        setContentView(layout);
    }
}
