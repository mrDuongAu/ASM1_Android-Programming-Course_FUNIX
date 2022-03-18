package com.assignment.animal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivImage, ivFavorite;
    TextView tvAnimalName, tvDescription;
    Intent intent;
    boolean flag = false;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
    }

    private void initViews() {
        ivImage = findViewById(R.id.ivImage);
        tvAnimalName = findViewById(R.id.tvAnimalName);
        tvDescription = findViewById(R.id.tvDescription);
        ivFavorite = findViewById(R.id.ivFavorite);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        changeViewAccordingToAnimalChosen();
    }

    private void changeViewAccordingToAnimalChosen() {
        intent = getIntent();
        String animal = intent.getStringExtra("ANIMAL");
        flag = intent.getBooleanExtra("FAVORITE_MAIN", false);
        if (flag) {
            ivFavorite.setImageResource(R.drawable.ic_favorite);
        } else {
            ivFavorite.setImageResource(R.drawable.ic_favorite_border);
        }

        switch (animal) {
            case "elephant":
                ivImage.setImageResource(R.drawable.bg_elephant);
                tvAnimalName.setText(R.string.elephant_name);
                tvDescription.setText(R.string.elephant_description);

                listenToFavoriteClicked(intent, animal);


                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "elephant_checked");
                }
                break;
            case "dragonfly":
                ivImage.setImageResource(R.drawable.bg_dragonfly);
                tvAnimalName.setText(R.string.dragonfly_name);
                tvDescription.setText(R.string.dragonfly_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "dragonfly_checked");
                }
                break;
            case "dolphin":
                ivImage.setImageResource(R.drawable.bg_dolphin);
                tvAnimalName.setText(R.string.dolphin_name);
                tvDescription.setText(R.string.dolphin_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "dolphin_checked");
                }
                break;
            case "dog":
                ivImage.setImageResource(R.drawable.bg_dog);
                tvAnimalName.setText(R.string.dog_name);
                tvDescription.setText(R.string.dog_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "dog_checked");
                }
                break;
            case "pig":
                ivImage.setImageResource(R.drawable.bg_pig);
                tvAnimalName.setText(R.string.pig_name);
                tvDescription.setText(R.string.pig_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "pig_checked");
                }
                break;
            case "duck":
                ivImage.setImageResource(R.drawable.bg_duck);
                tvAnimalName.setText(R.string.duck_name);
                tvDescription.setText(R.string.duck_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "duck_checked");
                }
                break;
            case "ladybug":
                ivImage.setImageResource(R.drawable.bg_laydybug);
                tvAnimalName.setText(R.string.ladybug_name);
                tvDescription.setText(R.string.ladybug_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "ladybug_checked");
                }
                break;
            case "turtle":
                ivImage.setImageResource(R.drawable.bg_turtle);
                tvAnimalName.setText(R.string.turtle_name);
                tvDescription.setText(R.string.turtle_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "turtle_checked");
                }
                break;
            case "penguin":
                ivImage.setImageResource(R.drawable.bg_penguin);
                tvAnimalName.setText(R.string.penguin_name);
                tvDescription.setText(R.string.penguin_description);

                listenToFavoriteClicked(intent, animal);

                if (ivFavorite.getDrawable() == ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_favorite, getTheme())) {
                    intent.putExtra("FAVORITE_ICON", "penguin_checked");
                }
                break;
        }

        setResult(RESULT_OK, intent);
    }

    private void listenToFavoriteClicked(Intent intent, String animal) {
        ivFavorite = findViewById(R.id.ivFavorite);
        ivFavorite.setOnClickListener(view -> {

            if (flag) {
                ivFavorite.setImageResource(R.drawable.ic_favorite_border);
                flag = false;
            } else {
                ivFavorite.setImageResource(R.drawable.ic_favorite);
                flag = true;
            }

            intent.putExtra("FAV", flag);
            intent.putExtra("TYPE", animal);
            setResult(RESULT_OK, intent);
        });
    }


    @Override
    public void onClick(View view) {

    }
}