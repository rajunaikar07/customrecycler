package com.example.customrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_v,recyclerView_h;
    UserModel userModel;
    UserAdapter userAdapter;
    List<UserModel> userModelList = new ArrayList<>();

    GameModel gameModel;
    GameAdapter gameAdapter;
    List<GameModel> gameModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView_h = findViewById(R.id.recycler_h);
            recycler_v = findViewById(R.id.recycler_v);


            recyclerView_h.setHasFixedSize(true);
            recycler_v.setHasFixedSize(true);

            recyclerView_h.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            recycler_v.setLayoutManager(new LinearLayoutManager(this));

            userAdapter = new UserAdapter(getApplicationContext(), userModelList);
            recyclerView_h.setAdapter(userAdapter);

            gameAdapter = new GameAdapter(getApplicationContext(), gameModelList, this);
            recycler_v.setAdapter(gameAdapter);


            loadHorizantalMethod();
            loadVerticalMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void loadVerticalMethod() {
        gameModel = new GameModel(R.drawable.img_2, "Game1", "Country1", "11");
        gameModelList.add(gameModel);
        gameModel = new GameModel(R.drawable.img_1, "Game2", "Country2", "12");
        gameModelList.add(gameModel);
        gameModel = new GameModel(R.drawable.img_3, "Game3", "Country3", "13");
        gameModelList.add(gameModel);
        gameModel = new GameModel(R.drawable.img_4, "Game4", "Country4", "14");
        gameModelList.add(gameModel);
        gameAdapter.notifyDataSetChanged();

    }

    private void loadHorizantalMethod() {
        userModel = new UserModel(R.drawable.img_1, "user1");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_2, "user2");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_3, "user3");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_4, "user4");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_1, "user5");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_2, "user6");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_2, "user7");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_3, "user8");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_4, "user9");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_1, "user10");
        userModelList.add(userModel);
        userModel = new UserModel(R.drawable.img_2, "user11");
        userModelList.add(userModel);

        userAdapter.notifyDataSetChanged();
    }
}


