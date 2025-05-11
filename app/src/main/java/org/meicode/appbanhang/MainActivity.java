package org.meicode.appbanhang;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.widget.Toolbar;
import android.widget.ListView;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbarmanhinhchinh;
    ViewFlipper viewflipper;
    RecyclerView recycleview;
    ListView listviewmanhinhchinh;
    NavigationView navigationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
          //  return insets;
       // });
        anhxa();
    }
    private void anhxa() {
        toolbarmanhinhchinh = findViewById(R.id.toolbarmanhinhchinh);
        viewflipper = findViewById(R.id.viewflipper);
        recycleview = findViewById(R.id.recycleview);
        navigationview = findViewById(R.id.navigationview);

        listviewmanhinhchinh = navigationview.findViewById(R.id.listviewmanhinhchinh);
    }

}