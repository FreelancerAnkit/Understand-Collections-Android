package databinding.rapidera.understandcollection;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.ArraySet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    long start,end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Key-Value Collections
        testHashmap();  //2-3 ms
        testArrayMap(); //3-4 ms

        //Single Value Collections
        testArraySet();  //3-4 ms
        testArrayList(); //1 ms
        testSparseArray(); //0-1 ms
    }

    private void testSparseArray() {
        SparseArray<String> arrayMap = new SparseArray<>();
        start = System.currentTimeMillis();
        for (int i=1;i<=200;i++){
            arrayMap.put(i,"John");
        }
        end = System.currentTimeMillis();
        Log.e("SparseArray:",(end - start)+" ms"+" Value:"+ arrayMap.toString() );
    }

    private void testArrayList() {
        ArrayList<String> arrayMap = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i=1;i<=200;i++){
            arrayMap.add(i+""+"John");
        }
        end = System.currentTimeMillis();
        Log.e("ArrayList:",(end - start)+" ms"+" Value:"+ arrayMap.toString() );
    }


    private void testHashmap() {
        HashMap<String,String> arrayMap = new HashMap<>();
        start = System.currentTimeMillis();
        for (int i=1;i<=200;i++){
            arrayMap.put(i+"","John");
        }
        end = System.currentTimeMillis();
        Log.e("HashMap:",(end - start)+" ms"+" Value:"+ arrayMap.toString() );
    }

    private void testArrayMap() {
        ArrayMap<String,String> arrayMap = new ArrayMap<>();
        start = System.currentTimeMillis();
        for (int i=1;i<=200;i++){
            arrayMap.put(i+"","John");
        }
        end = System.currentTimeMillis();
        Log.e("ArrayMap:",(end - start)+" ms"+" Value:"+ arrayMap.toString() );
    }

    private void testArraySet() {
        ArraySet<String> arrayMap = new ArraySet<>();
        start = System.currentTimeMillis();
        for (int i=1;i<=200;i++){
            arrayMap.add(i+""+"John");
        }
        end = System.currentTimeMillis();
        Log.e("ArraySet:",(end - start)+" ms"+" Value:"+ arrayMap.toString() );
    }



}
