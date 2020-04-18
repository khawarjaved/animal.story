package story.jk.animalstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] TitleStory = getResources().getStringArray(R.array.Title_Story);
        final String [] DetailStory = getResources().getStringArray(R.array.Detail_Story);
        listView=findViewById(R.id.list);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,TitleStory);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              String t=DetailStory[position];
                Intent intent = new Intent(MainActivity.this,StoryDetail.class);
                intent.putExtra("Story",t);
                startActivity(intent);
            }
        });
    }
}
