package story.jk.animalstory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] TitleStory = getResources().getStringArray(R.array.Title_Story);
        String [] DetailStory = getResources().getStringArray(R.array.Detail_Story);
        list=findViewById(R.id.list);

        ArrayAdapter
    }
}
