package com.example.my__mir_pandora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);


        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
      //  recyclerView.setNestedScrollingEnabled(false);

    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Танатор", "Самый свирепый хищник в дождевых лесах Пандоры. Взрослые танаторы достигают 5,5 метра в длину и 2,5 метра",
                R.drawable.tanator, "Численность средняя"));
        animals.add( new Animal("Титанотерий", "Массивная низко подвешенная голова защищена с обеих сторон костистыми наростами, придающими животному сходство с земной акулой-молотом, откуда он собственно и получил название.",
                R.drawable.titanoteri, "Численность большая"));
        animals.add( new Animal("Торуктманто", "Крупнейшее летающее животное на Пандоре, больше известен как Торук.",
                R.drawable.tyrykmanto, "Численность Маленькая"));
        animals.add( new Animal("Змееволк", "Один из самых распространенных и многочисленных наземных хищников Пандоры.",
                R.drawable.zmeevolk, "Численность большая"));
        animals.add( new Animal("Лютоконь", "Обычное верховое животное, на котором На’ви могут быстро передвигаться",
                R.drawable.lutokon, "Численность большая"));
        animals.add( new Animal("Икран", " Крупное летающее животное с четырьмя кожистыми крыльями",
                R.drawable.ikran, "Численность большая"));
    }
}