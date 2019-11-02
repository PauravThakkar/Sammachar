package com.example.sammachar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    TextView txt_help_gest,m1,m2,m3;
    TextView txt_help_gest1;
    TextView txt_help_gest2;

    Toolbar toolbar;
    String[] title={"Main News 1","Main News 2","Main News 3","Main News 4","Main News 5"};
    int[] images={R.drawable.sherlock_bbc_believe_profile_minimalism_101403_1920x1080,
            R.drawable.sherlock_bbc_believe_profile_minimalism_101403_1920x1080,
            R.drawable.sherlock_bbc_believe_profile_minimalism_101403_1920x1080,
            R.drawable.sherlock_bbc_believe_profile_minimalism_101403_1920x1080,
            R.drawable.sherlock_bbc_believe_profile_minimalism_101403_1920x1080};

    String[] maincontent ={"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
    "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
    "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.",
    "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.",
    "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham."};

    String[] acc={"content 1/ncontent2","content 1/ncontent2","content 1/ncontent2","content 1/ncontent2","content 1/ncontent2"};
    String[] acc1={"content 1/ncontent2","content 1/ncontent2","content 1/ncontent2","content 1/ncontent2","content 1/ncontent2"};
    String[] acc2={"content 1/ncontent2","content 1/ncontent2","content 1/ncontent2","content 1/ncontent2","content 1/ncontent2"};

    String[] date= {"1/1/2019","2/1/2019","3/1/2019","4/1/2019","5/1/2019"};
    String[] author={"abc","abcd","abcde","abcdef","abcdefg"};
    String[] other={"art,india","sports,india","art,America","politics,gujarat","art,india"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.navDrawer);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.setDrawerIndicatorEnabled(true); //disable "hamburger to arrow" drawable
        //toggle.setHomeAsUpIndicator(R.drawable.ic_menu); //set your own
        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        toolbar.setTitle("SAMMACHAR");

        RecyclerView adaptar = findViewById(R.id.recycler_view);
        adaptar.setLayoutManager(new LinearLayoutManager(this));
        adaptar.setAdapter(new adaptar(title,images,maincontent,acc,acc1,acc2,date,author,other));



    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
