package com.example.popupmenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_show_popup);

        // Set an OnClickListener for the button to show the PopupMenu
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a PopupMenu and set the anchor view (button)
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, v);

                // Inflate the menu resource (menu options in popup)
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                // Set a listener for menu item clicks
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.option_1:
                                Toast.makeText(MainActivity.this, "Option 1 Selected", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.option_2:
                                Toast.makeText(MainActivity.this, "Option 2 Selected", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.option_3:
                                Toast.makeText(MainActivity.this, "Option 3 Selected", Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return false;
                        }
                    }
                });

                // Show the PopupMenu
                popupMenu.show();
            }
        });
    }
}
