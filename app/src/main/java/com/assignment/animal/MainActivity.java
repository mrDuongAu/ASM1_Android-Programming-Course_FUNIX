package com.assignment.animal;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivElephant, ivDragonFly, ivDolphin, ivDog, ivPig, ivDuck, ivLadybug, ivTurtle,
            ivPenguin;
    ImageView ivFavoriteElephant, ivFavoriteDragonFly, ivFavoriteDolphin, ivFavoriteDog,
            ivFavoritePig, ivFavoriteDuck, ivFavoriteLadybug, ivFavoriteTurtle, ivFavoritePenguin;
    String favoriteState = "";

    ActivityResultLauncher<Intent> launcher =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == RESULT_OK) {
                    Intent data = result.getData();

                    favoriteState = data.getStringExtra("FAVORITE_ICON");

                    switch (favoriteState) {
                        case "elephant_checked":
                            ivFavoriteElephant.setVisibility(View.VISIBLE);
                            break;
                        case "dragonfly_checked":
                            ivFavoriteDragonFly.setVisibility(View.VISIBLE);
                            break;
                        case "dolphin_checked":
                            ivFavoriteDolphin.setVisibility(View.VISIBLE);
                            break;
                        case "dog_checked":
                            ivFavoriteDog.setVisibility(View.VISIBLE);
                            break;
                        case "pig_checked":
                            ivFavoritePig.setVisibility(View.VISIBLE);
                            break;
                        case "duck_checked":
                            ivFavoriteDuck.setVisibility(View.VISIBLE);
                            break;
                        case "ladybug_checked":
                            ivFavoriteLadybug.setVisibility(View.VISIBLE);
                            break;
                        case "turtle_checked":
                            ivFavoriteTurtle.setVisibility(View.VISIBLE);
                            break;
                        case "penguin_checked":
                            ivPenguin.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        ivFavoriteElephant = findViewById(R.id.ivFavoriteElephant);
        ivFavoriteElephant.setVisibility(View.GONE);

        ivFavoriteDragonFly = findViewById(R.id.ivFavoriteDragonFly);
        ivFavoriteDragonFly.setVisibility(View.GONE);

        ivFavoriteDolphin = findViewById(R.id.ivFavoriteDolphin);
        ivFavoriteDolphin.setVisibility(View.GONE);

        ivFavoriteDog = findViewById(R.id.ivFavoriteDog);
        ivFavoriteDog.setVisibility(View.GONE);

        ivFavoritePig = findViewById(R.id.ivFavoritePig);
        ivFavoritePig.setVisibility(View.GONE);

        ivFavoriteDuck = findViewById(R.id.ivFavoriteDuck);
        ivFavoriteDuck.setVisibility(View.GONE);

        ivFavoriteLadybug = findViewById(R.id.ivFavoriteLadybug);
        ivFavoriteLadybug.setVisibility(View.GONE);

        ivFavoriteTurtle = findViewById(R.id.ivFavoriteTurtle);
        ivFavoriteTurtle.setVisibility(View.GONE);

        ivFavoritePenguin = findViewById(R.id.ivFavoritePenguin);
        ivFavoritePenguin.setVisibility(View.GONE);

        ivElephant = findViewById(R.id.ivElephant);
        ivElephant.setOnClickListener(this);

        ivDragonFly = findViewById(R.id.ivDragonFly);
        ivDragonFly.setOnClickListener(this);

        ivDolphin = findViewById(R.id.ivDolphin);
        ivDolphin.setOnClickListener(this);

        ivDog = findViewById(R.id.ivDog);
        ivDog.setOnClickListener(this);

        ivPig = findViewById(R.id.ivPig);
        ivPig.setOnClickListener(this);

        ivDuck = findViewById(R.id.ivDuck);
        ivDuck.setOnClickListener(this);

        ivLadybug = findViewById(R.id.ivLadybug);
        ivLadybug.setOnClickListener(this);

        ivTurtle = findViewById(R.id.ivTurtle);
        ivTurtle.setOnClickListener(this);

        ivPenguin = findViewById(R.id.ivPenguin);
        ivPenguin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);

        if (view.getId() == R.id.ivElephant) {
            intent.putExtra("ANIMAL", "elephant");
        } else if (view.getId() == R.id.ivDragonFly) {
            intent.putExtra("ANIMAL", "dragonfly");
        } else if (view.getId() == R.id.ivDolphin) {
            intent.putExtra("ANIMAL", "dolphin");
        } else if (view.getId() == R.id.ivDog) {
            intent.putExtra("ANIMAL", "dog");
        } else if (view.getId() == R.id.ivPig) {
            intent.putExtra("ANIMAL", "pig");
        } else if (view.getId() == R.id.ivDuck) {
            intent.putExtra("ANIMAL", "duck");
        } else if (view.getId() == R.id.ivLadybug) {
            intent.putExtra("ANIMAL", "ladybug");
        } else if (view.getId() == R.id.ivTurtle) {
            intent.putExtra("ANIMAL", "turtle");
        } else if (view.getId() == R.id.ivPenguin) {
            intent.putExtra("ANIMAL", "penguin");
        }

        launcher.launch(intent);
    }
}